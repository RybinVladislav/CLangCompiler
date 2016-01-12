/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clangcompiler.sources;

import clangcompiler.antlr.CGrammarLexer;
import static clangcompiler.sources.SemanticChecker.strToDataType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author Andrey
 */
public class MSILGenerator {
    private int lblNum = 0;
    private int methodCount = 0;
    
    private static String dataTypeToStr(DataType type) {
        switch (type) {
            case Int:
                return "int32";
            case Double:
                return "float64";
            case Char:
                return "char";
            case String:
                return "string";
            case Void:
                return "void";
            default:
                return "unknown";
        }
    }
    
    private static String dataTypeToShortStr(DataType type){
        switch (type) {
            case Int:
                return "i4";
            case Double:
                return "r8";
            case Char:
                return "i4";
            default:
                return "unknown";
        }
    }

    private String generateMSILMethod(Tree node, Context context) throws Exception {
        if (node.getType() != CGrammarLexer.FUNC) return "";
        StringBuilder mcil = new StringBuilder();
        mcil.append("   .method private hidebysig static ");
        String returnType = dataTypeToStr(strToDataType(node.getChild(0).getText()));
        mcil.append(String.format("%s %s", returnType, node.getChild(1).getText()));
        Tree paramsNode = node.getChild(2);
        mcil.append("(");
        for (int i = 0; i < paramsNode.getChildCount(); i++) {
            CommonTree param = (CommonTree)paramsNode.getChild(i);
            DataType paramDataType = strToDataType(param.getText());
            CommonTree t = (CommonTree)param.getChild(0);
            String paramName = "";
            if (t.getType() == CGrammarLexer.ARRAY) {
                paramName = t.getChild(0).getText() + "[]";
            } else paramName = t.getText();
            mcil.append(String.format("%s %s", dataTypeToStr(paramDataType), paramName));
            if (i != paramsNode.getChildCount() - 1)
                mcil.append(", ");
        }
        mcil.append(") cil managed\n   {\n");
        if (node.getChild(1).getText().equalsIgnoreCase("main")) {
            mcil.append("      .entrypoint\n");
        }
        mcil.append("      .locals(\n");
        
        Ident[] locals = new Ident[context.getAllIdents().size()];
        for (Entry<String, Ident> ident : context.getAllIdents().entrySet()) {
            locals[ident.getValue().getId()] = ident.getValue();
        }
        for (int i = 0; i < locals.length; i++) {
            mcil.append(String.format("         [%d] %s%s %s", locals[i].getId(), 
                    dataTypeToStr(locals[i].getDataType()), locals[i].isArray() ? "[]" : "", locals[i].getName()));
            if (i < locals.length - 1) mcil.append(",\n");
        }
        mcil.append("\n      )\n");
        
        mcil.append(generate(node.getChild(3), context));
        
        mcil.append(String.format("    RL_%04X:\n", methodCount++));
        mcil.append("      ret\n");
        mcil.append("   }\n");
        return mcil.toString();
    }
    
    private String ldIdent(Tree node, Context context) {
        StringBuilder mcil = new StringBuilder();
        Ident ident = context.getIdent(node.getText());
        String identType = ident.getIdentType() == IdentType.LocalVar ? "loc.s" :
                           ident.getIdentType() == IdentType.Param ? "arg.s" :
                           ident.getIdentType() == IdentType.GlobalVar ? "sfld" :
                           "unknown";
        if (ident.getIdentType() != IdentType.GlobalVar)
            mcil.append(String.format("      ld%s %s\n", identType, ident.getId()));
        else
            mcil.append(String.format("      ld%s %s%s Program::%s\n", identType, dataTypeToStr(ident.getDataType()), ident.isArray() ? "[]" : "", ident.getName()));
        return mcil.toString();
    }
    
    private String stIdent(Tree node, Context context) {
        StringBuilder mcil = new StringBuilder();
        Ident ident = context.getIdent(node.getText());
        String identType = ident.getIdentType() == IdentType.LocalVar ? "loc.s" :
                           ident.getIdentType() == IdentType.Param ? "arg.s" :
                           ident.getIdentType() == IdentType.GlobalVar ? "sfld" :
                           "unknown";
        
        if (ident.getIdentType() != IdentType.GlobalVar)
            mcil.append(String.format("      st%s %s\n", identType, ident.getId()));
        else
            mcil.append(String.format("      st%s %s%s Program::%s\n", identType, dataTypeToStr(ident.getDataType()), ident.isArray() ? "[]" : "", ident.getName()));
        return mcil.toString();
    }
    
    private char getChar(String str) {
        if (str.length() == 3) 
            return str.charAt(1);
        else {
            String s = str.substring(1, str.length() - 2);
            
            switch (s) {
                case "\\n" : return '\n';
                case "\\t" : return '\t';
                case "\\f" : return '\f';
                case "\\b" : return '\b';
                case "\\r" : return '\r';
                case "\\\\" : return '\\';
                case "\\\'" : return '\'';
                case "\\\"" : return '\"';
                default : return '\0';
            }
        }
    }
    
    private String generate(Tree node, Context context) {
        StringBuilder mcil = new StringBuilder();
        switch (node.getType()) {
            case CGrammarLexer.BLOCK:
                for (int i = 0; i < node.getChildCount(); i++) {
                    mcil.append(generate(node.getChild(i), context));
                }
                return mcil.toString();
            case CGrammarLexer.VARDECL: {
                if (node.getChild(0).getChild(0).getType() == CGrammarLexer.ARRAY) {
                    mcil.append(String.format("      ldc.i4.s %s\n", node.getChild(0).getChild(0).getChild(0).getText()));
                    mcil.append("      newarr [mscorlib] System.");
                    switch (node.getChild(0).getText()) {
                        case "int" : mcil.append("Int32\n"); break;
                        case "double" : mcil.append("Double\n"); break;
                        case "char" : mcil.append("Char\n"); break;
                        case "string" : mcil.append("String\n"); break;
                    }
                    mcil.append(stIdent(node.getChild(0).getChild(0).getChild(1), context));
                }
                return mcil.toString();
            }
            case CGrammarLexer.CONVERT: {
                mcil.append(generate(node.getChild(0), context));
                if (node.getChild(1).getText().equals("double"))
                    mcil.append("      conv.r8\n");
                else if (node.getChild(1).getText().equals("int"))
                    mcil.append("      conv.i4\n");
                return mcil.toString();
            }
            case CGrammarLexer.ASSIGN:
                if (node.getChild(0).getType() == CGrammarLexer.ARRAYSET) {
                    mcil.append(ldIdent(node.getChild(0).getChild(0), context));
                    mcil.append(generate(node.getChild(0).getChild(1), context));
                    //mcil.append(String.format("      ldc.i4.s %s\n", node.getChild(0).getChild(1).getText()));
                }
                
                mcil.append(generate(node.getChild(1), context));
                
                if (node.getChild(0).getType() == CGrammarLexer.ARRAYSET) {
                    DataType dataType = context.getIdent(node.getChild(0).getChild(0).getText()).getDataType();
                    if (dataType == DataType.Int)
                        mcil.append("      stelem.i4\n");
                    else if (dataType == DataType.Double)
                        mcil.append("      stelem.r8\n");
                    else if (dataType == DataType.Char)
                        mcil.append("      stelem.i2\n");
                    else if (dataType == DataType.String)
                        mcil.append("      stelem.ref\n");
                } 
                else
                    mcil.append(stIdent(node.getChild(0), context));
                return mcil.toString();
            case CGrammarLexer.ADD_ASSIGN:
            case CGrammarLexer.SUB_ASSIGN:  
            case CGrammarLexer.MUL_ASSIGN:
            case CGrammarLexer.DIV_ASSIGN:
            case CGrammarLexer.MOD_ASSIGN: {
                if (node.getChild(0).getType() == CGrammarLexer.ARRAYSET) {
                    mcil.append(ldIdent(node.getChild(0).getChild(0), context));
                    mcil.append(generate(node.getChild(0).getChild(1), context));
                    //mcil.append(String.format("      ldc.i4.s %s\n", node.getChild(0).getChild(1).getText()));
                }
                
                if (node.getChild(0).getType() == CGrammarLexer.ARRAYSET) {
                    mcil.append(ldIdent(node.getChild(0).getChild(0), context));
                    mcil.append(generate(node.getChild(0).getChild(1), context));
                    //mcil.append(String.format("      ldc.i4.s %s\n", node.getChild(0).getChild(1).getText()));
                    mcil.append(String.format("      ldelem.i4\n"));
                } else 
                    mcil.append(ldIdent(node.getChild(0), context));
                
                mcil.append(generate(node.getChild(1), context));
                
                String operation = node.getType() == CGrammarLexer.ADD_ASSIGN ? "add" :
                                   node.getType() == CGrammarLexer.SUB_ASSIGN ? "sub" :
                                   node.getType() == CGrammarLexer.DIV_ASSIGN ? "div" :
                                   node.getType() == CGrammarLexer.MOD_ASSIGN ? "rem" :
                                   node.getType() == CGrammarLexer.MUL_ASSIGN ? "mul" :
                                   "unknown";
                
                mcil.append("      ").append(operation).append("\n");
                
                if (node.getChild(0).getType() == CGrammarLexer.ARRAYSET) {
                    DataType dataType = context.getIdent(node.getChild(0).getChild(0).getText()).getDataType();
                    if (dataType == DataType.Int)
                        mcil.append("      stelem.i4\n");
                    else if (dataType == DataType.Double)
                        mcil.append("      stelem.r8\n");
                    else if (dataType == DataType.Char)
                        mcil.append("      stelem.i2\n");
                    else if (dataType == DataType.String)
                        mcil.append("      stelem.ref\n");
                } 
                else
                    mcil.append(stIdent(node.getChild(0), context));
                return mcil.toString();
            }
            case CGrammarLexer.ADD: 
            case CGrammarLexer.SUB:
            case CGrammarLexer.DIV:
            case CGrammarLexer.MOD:
            case CGrammarLexer.MUL:
            case CGrammarLexer.AND:
            case CGrammarLexer.OR:
            case CGrammarLexer.EQ:
            case CGrammarLexer.MT:
            case CGrammarLexer.LT: {
                String operation = node.getType() == CGrammarLexer.ADD ? "add" :
                                   node.getType() == CGrammarLexer.SUB ? "sub" :
                                   node.getType() == CGrammarLexer.DIV ? "div" :
                                   node.getType() == CGrammarLexer.MOD ? "rem" :
                                   node.getType() == CGrammarLexer.MUL ? "mul" :
                                   node.getType() == CGrammarLexer.AND ? "and" :
                                   node.getType() == CGrammarLexer.OR ? "or" :
                                   node.getType() == CGrammarLexer.EQ ? "ceq" :
                                   node.getType() == CGrammarLexer.MT ? "cgt" :
                                   node.getType() == CGrammarLexer.LT ? "clt" :
                                   "unknown";
                Tree arg1 = node.getChild(0);
                Tree arg2 = node.getChild(1);
                
                mcil.append(generate(arg1, context));
                mcil.append(generate(arg2, context));
                
                mcil.append("      ").append(operation).append("\n");
                return mcil.toString();
            }
            case CGrammarLexer.NE:
            case CGrammarLexer.ME:
            case CGrammarLexer.LE: {
                String operation = node.getType() == CGrammarLexer.NE ? "ceq" :
                                   node.getType() == CGrammarLexer.LE ? "cgt" :
                                   node.getType() == CGrammarLexer.ME ? "clt" :
                                   "unknown";
                Tree arg1 = node.getChild(0);
                Tree arg2 = node.getChild(1);
                
                mcil.append(generate(arg1, context));
                mcil.append(generate(arg2, context));
                
                mcil.append("      ").append(operation).append("\n");
                mcil.append("      ldc.i4.0\n")
                    .append("      ceq\n");
                return mcil.toString();
            }
            case CGrammarLexer.NOT: {
                mcil.append(generate(node.getChild(0), context));
                
                mcil.append("      ldc.i4.0\n")
                    .append("      ceq\n");
                return mcil.toString();
            }
            case CGrammarLexer.IDENT: 
                return ldIdent(node, context);
            case CGrammarLexer.NUMBER:
                if (((AstNode)node).getDataType().equals(DataType.Double))
                    mcil.append(String.format("      ldc.r8 %s\n", node.getText()));
                else
                    mcil.append(String.format("      ldc.i4.s %s\n", node.getText()));
                return mcil.toString();
            case CGrammarLexer.STR:
                mcil.append(String.format("      ldstr %s\n", node.getText()));
                return mcil.toString();
            case CGrammarLexer.CHR:
                mcil.append(String.format("      ldc.i4.s %d\n", (int)getChar(node.getText())));
                return mcil.toString();
            case CGrammarLexer.FUNCCALL:
                for (int i = 0; i < node.getChild(1).getChildCount(); i++) {
                    mcil.append(generate(node.getChild(1).getChild(i), context));
                }
                mcil.append("      call ");
                Ident ident = context.getIdent(node.getChild(0).getText());
                Tree funcNode = ident.getNode();
                mcil.append(dataTypeToStr(ident.getDataType())).append(" ");
                String funcName = "";
                switch (ident.getName()) { //todo : add functions
                    case "sin" : funcName = "[mscorlib]System.Math::Sin"; break;
                    case "cos" : funcName = "[mscorlib]System.Math::Cos"; break;
                    case "sqrt" : funcName = "[mscorlib]System.Math::Sqrt"; break;
                    case "printLine": funcName = "[mscorlib]System.Console::WriteLine"; break;
                    case "printDouble": funcName = "[mscorlib]System.Console::WriteLine"; break;
                    case "printInt": funcName = "[mscorlib]System.Console::WriteLine"; break;
                    case "readLine": funcName = "[mscorlib]System.Console::ReadLine"; break;
                    case "parseInt" : funcName = "[mscorlib]System.Int32::Parse"; break;
                    case "parseDouble" : funcName = "[mscorlib]System.Double::Parse"; break;
                    default :
                        funcName = "Program::" + ident.getName(); break;
                }
                mcil.append(funcName).append("(");
                for (int i = 0; i < funcNode.getChild(2).getChildCount(); i++) {
                    String argType = funcNode.getChild(2).getChild(i).getText();
                    if (argType.equals("int")) argType = "int32";
                    if (argType.equals("double")) argType = "float64";
                    if (funcNode.getChild(2).getChild(i).getChild(0).getText().equals("ARRAY")) 
                        argType += "[]";
                    if (i < funcNode.getChild(2).getChildCount() - 1)
                        argType += ", ";
                    mcil.append(argType);
                }
                mcil.append(")\n");
                return mcil.toString();
            case CGrammarLexer.ARRAYCALL:
                mcil.append(ldIdent(node.getChild(0), context));
                mcil.append(generate(node.getChild(1), context));
                //mcil.append(String.format("      ldc.i4.s %s\n", node.getChild(1).getText()));
                DataType dataType = context.getIdent(node.getChild(0).getText()).getDataType();
                if (dataType == DataType.Int)
                        mcil.append("      ldelem.i4\n");
                    else if (dataType == DataType.Double)
                        mcil.append("      ldelem.r8\n");
                    else if (dataType == DataType.Char)
                        mcil.append("      ldelem.i2\n");
                    else if (dataType == DataType.String)
                        mcil.append("      ldelem.ref\n");
                return mcil.toString();
            case CGrammarLexer.IF: {
                mcil.append(generate(node.getChild(0), context));
                int lblElse = lblNum++;
                int lblEndIf = lblElse;
                if (node.getChildCount() == 3) lblEndIf = lblNum++;
                mcil.append(String.format("      brfalse.s L_%04X\n", lblElse));
                if (node.getChild(1).getType() == CGrammarLexer.BLOCK) {
                    context.increaseCurrentChild();
                    mcil.append(generate(node.getChild(1), context.getCurrentChild()));
                } else mcil.append(generate(node.getChild(1), context));
                if (node.getChildCount() == 3) { // if has else
                    mcil.append(String.format("      br.s L_%04X\n", lblEndIf));
                    mcil.append(String.format("    L_%04X:\n", lblElse));
                    if (node.getChild(2).getType() == CGrammarLexer.BLOCK) {
                        context.increaseCurrentChild();
                        mcil.append(generate(node.getChild(2), context.getCurrentChild()));
                    } else mcil.append(generate(node.getChild(2), context));
                }
                mcil.append(String.format("    L_%04X:\n", lblEndIf));
                return mcil.toString();
            }      
            case CGrammarLexer.FOR: {
                mcil.append(generate(node.getChild(0), context));
                int lblBody = lblNum++;
                int lblCond = lblNum++;
                mcil.append(String.format("      br.s L_%04X\n", lblCond));
                mcil.append(String.format("    L_%04X:\n", lblBody));
                if (node.getChild(3).getType() == CGrammarLexer.BLOCK) {
                    context.increaseCurrentChild();
                    mcil.append(generate(node.getChild(3), context.getCurrentChild()));
                } else mcil.append(generate(node.getChild(3), context));
                mcil.append(generate(node.getChild(2), context));
                mcil.append(String.format("    L_%04X:\n", lblCond));
                mcil.append(generate(node.getChild(1), context));
                mcil.append(String.format("      brtrue.s L_%04X\n", lblBody));
                return mcil.toString();
            } 
            case CGrammarLexer.WHILE:
            case CGrammarLexer.DOWHILE:{
                int lblBody = lblNum++;
                int lblCond = lblNum++;
                if (node.getType() == CGrammarLexer.WHILE)
                    mcil.append(String.format("      br.s L_%04X\n", lblCond));
                mcil.append(String.format("    L_%04X:\n", lblBody));
                if (node.getChild(1).getType() == CGrammarLexer.BLOCK) {
                    context.increaseCurrentChild();
                    mcil.append(generate(node.getChild(1), context.getCurrentChild()));
                } else mcil.append(generate(node.getChild(1), context));
                mcil.append(String.format("    L_%04X:\n", lblCond));
                mcil.append(generate(node.getChild(0), context));
                mcil.append(String.format("      brtrue.s L_%04X\n", lblBody));
                return mcil.toString();
            }   
            case CGrammarLexer.RETURN: {
                mcil.append(generate(node.getChild(0), context));
                mcil.append(String.format("      br.s RL_%04X\n", methodCount));
            }
        }
        return mcil.toString();
    }
    
    public String generateMSIL(Tree root, Context context) throws Exception {
        lblNum = 0;
        
        if (root.getType() != CGrammarLexer.PROGRAM)
            throw new Exception("AST-дерево не является программой");
        StringBuilder program = new StringBuilder();
        StringBuilder globals = new StringBuilder();
        StringBuilder cctor = new StringBuilder();
        StringBuilder methods = new StringBuilder();
        cctor.append("   .method private hidebysig specialname rtspecialname static  void  .cctor() cil managed\n   {\n");
        
        for (int i = 0; i < root.getChildCount(); i++) {
            Tree node = root.getChild(i);
            switch (node.getType()) {
                case CGrammarLexer.VARDECL: //global vars declaration
                    String varName;
                    if (node.getChild(0).getChild(0).getType() == CGrammarLexer.ARRAY)
                        varName = node.getChild(0).getChild(0).getChild(1).getText();
                    else varName = node.getChild(0).getChild(0).getText();
                    Ident ident = context.inThisContext(varName);
                    if (ident != null) {
                        globals.append(String.format("   .field private static %s%s %s\n", 
                                dataTypeToStr(ident.getDataType()), ident.isArray() ? "[]" : "", ident.getName()));                    
                    }                                       
                    cctor.append(generate(node, context));
                    break;
                case CGrammarLexer.FUNC:
                    List<Context> childs = context.getChildContexts();
                    Context c = null;
                    for (Context cont : childs) {
                        if (cont.getFunction().getName().equals(node.getChild(1).getText())) {
                            c = cont; 
                            break;
                        }
                    }
                    if (c != null)
                        methods.append(generateMSILMethod(node, c.getChildContexts().get(0)));
                    break;
                case CGrammarLexer.ASSIGN: //global vars init                  
                    cctor.append(generate(node, context));
                    break;
                default:
                    break;
            }
        } 
        
        cctor.append("      ret\n   }\n");
        program.append(".assembly program\n" +
                        "{\n" +
                        "}\n" +
                        "\n" +
                        ".class public Program\n" +
                        "{\n");
        program.append(globals);
        program.append(cctor);
        program.append(methods);
        program.append("}");
        
        return program.toString();
    }
}
