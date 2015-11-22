/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clangcompiler.sources;

import clangcompiler.antlr.CGrammarLexer;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 *
 * @author Andrey
 */
public class SemanticChecker {
    public static DataType strToDataType(String type) throws Exception {
        switch (type){
            case "int": 
                return DataType.Int;
            case "double":
                return DataType.Double;
            case "char":
                return DataType.Char;
            case "string":
                return DataType.String;
            case "void":
                return DataType.Void;
            default:
                throw new Exception("Invalid data type");
        }
    }
    
    public static String dataTypeToStr(DataType type) {
        switch (type) {
            case Int:
                return "int";
            case Double:
                return "double";
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
    
    private static void convert(AstNode node, DataType dataType)
    {
        AstNode convert = new AstNode(new CommonToken(CGrammarLexer.FUNCCALL, "CONVERT"));
        node.getParent().setChild(node.getChildIndex(), convert);
        convert.setDataType(dataType);
        convert.addChild(node);
        convert.addChild(new AstNode(new CommonToken(CGrammarLexer.IDENT, dataTypeToStr(dataType))));
    }

    public static void checkBlock(AstNode node, Context context) throws Exception
    {
        for (int i = 0; i < node.getChildCount(); i++)
            check((AstNode)node.getChild(i), context);
    }

    public static DataType check(AstNode node, Context context) throws Exception
    {
        switch (node.getType())
        {
            case CGrammarLexer.PROGRAM:
            {
                if (context == null)
                    context = new Context(context);
                checkBlock(node, context);
                return DataType.Void;
            }
            case CGrammarLexer.BLOCK: //блок операций
            {
                context = new Context(context);
                checkBlock(node, context); 
                return DataType.Void;
            }

            case CGrammarLexer.VARDECL: { //объявление переменных
                List<AstNode> nodes = new ArrayList<>();
                
                for (int i = 0; i < node.getChildCount(); i++) {
                    CommonTree tmp = (CommonTree)node.getChild(i);
                    DataType dataType = strToDataType(tmp.getText());
                    CommonTree t = (CommonTree)tmp.getChild(0);
                    
                    if (t.getToken().getType() == CGrammarLexer.IDENT) { //если объявляется обычная переменная
                        Ident ident = context.inThisContext(t.getText());
                        if (ident != null)
                            throw new Exception(String.format("Identifier %s already exists", t.getText()));
                        AstNode var = new AstNode(new CommonToken(CGrammarLexer.VARDECL, "VARDECL"));
                        var.addChild(new AstNode(new CommonToken(CGrammarLexer.IDENT, dataTypeToStr(dataType))));
                        var.getChild(0).addChild(new AstNode(new CommonToken(CGrammarLexer.IDENT, t.getText())));
                        nodes.add(var);
                        if (t.getChildCount() != 0) { //если есть присвоение
                            AstNode assign = new AstNode(new CommonToken(CGrammarLexer.ASSIGN, "="));
                            assign.addChild(new AstNode(new CommonToken(CGrammarLexer.IDENT, t.getText())));
                            assign.addChild((AstNode)t.getChild(0));
                            nodes.add(assign);
                        }
                        
                        if (i == 0) {
                            String name = t.getText();
                            context.setIdent(new Ident(name, context.getParentContext() == null ? IdentType.GlobalVar : IdentType.LocalVar, dataType, nodes.get(0)), name);
                        }
                        
                    } else
                        if (t.getToken().getType() == CGrammarLexer.ARRAY) { // если объявляется массив
                            if (t.getChildCount() == 2) { //если задано количество
                                Ident ident = context.inThisContext(t.getChild(1).getText());
                                if (ident != null)
                                    throw new Exception(String.format("Identifier %s already exists", t.getText()));
                                if (check((AstNode)t.getChild(0), context) != DataType.Int)
                                    throw new Exception(String.format("Identifier %s has illegal count of elements", t.getText()));
                                
                                AstNode var = new AstNode(new CommonToken(CGrammarLexer.VARDECL, "VARDECL"));
                                var.addChild(new AstNode(new CommonToken(CGrammarLexer.IDENT, dataTypeToStr(dataType))));
                                var.getChild(0).addChild(new AstNode(new CommonToken(CGrammarLexer.ARRAY, "ARRAY")));
                                var.getChild(0).getChild(0).addChild(t.getChild(0));
                                var.getChild(0).getChild(0).addChild(new AstNode(new CommonToken(CGrammarLexer.IDENT, t.getChild(1).getText())));
                                
                                nodes.add(var);
                                
                                if (t.getChild(1).getChildCount() != 0) { //если есть присвоение
                                    CommonTree arr = (CommonTree)t.getChild(1).getChild(0);
                                    for (int j = 0; j < arr.getChildCount(); j++) {
                                        AstNode assign = new AstNode(new CommonToken(CGrammarLexer.ASSIGN, "="));
                                        assign.addChild(new AstNode(new CommonToken(CGrammarLexer.ARRAYCALL, "ARRAYCALL")));
                                        assign.getChild(0).addChild(new AstNode(new CommonToken(CGrammarLexer.IDENT, t.getChild(1).getText())));
                                        assign.getChild(0).addChild(new AstNode(new CommonToken(CGrammarLexer.NUMBER, Integer.toString(j))));
                                        assign.addChild((AstNode)arr.getChild(j));
                                        nodes.add(assign);
                                    }
                                }
                                
                                if (i == 0) {
                                    String name = t.getChild(1).getText();
                                    Ident idnt = new Ident(name, context.getParentContext() == null ? IdentType.GlobalVar : IdentType.LocalVar, dataType, nodes.get(0));
                                    idnt.setAsArray();
                                    context.setIdent(idnt, name);
                                }
                            } else { //не задано количество, но обязательно должно быть присваивание
                                Ident ident = context.inThisContext(t.getChild(0).getText());
                                if (ident != null)
                                    throw new Exception(String.format("Identifier %s already exists", t.getText()));
                                if (t.getChild(0).getChildCount() == 0)
                                    throw new Exception(String.format("Illegal declaration of Identifier %s", t.getText()));
                                int count = t.getChild(0).getChild(0).getChildCount();
                                AstNode var = new AstNode(new CommonToken(CGrammarLexer.VARDECL, "VARDECL"));
                                var.addChild(new AstNode(new CommonToken(CGrammarLexer.IDENT, dataTypeToStr(dataType))));
                                var.getChild(0).addChild(new AstNode(new CommonToken(CGrammarLexer.ARRAY, "ARRAY")));
                                var.getChild(0).getChild(0).addChild(new AstNode(new CommonToken(CGrammarLexer.NUMBER, Integer.toString(count))));
                                var.getChild(0).getChild(0).addChild(new AstNode(new CommonToken(CGrammarLexer.IDENT, t.getChild(0).getText())));
                                
                                nodes.add(var);

                                CommonTree arr = (CommonTree)t.getChild(0).getChild(0);
                                for (int j = 0; j < arr.getChildCount(); j++) {
                                    AstNode assign = new AstNode(new CommonToken(CGrammarLexer.ASSIGN, "="));
                                    assign.addChild(new AstNode(new CommonToken(CGrammarLexer.ARRAYCALL, "ARRAYCALL")));
                                    assign.getChild(0).addChild(new AstNode(new CommonToken(CGrammarLexer.IDENT, t.getChild(0).getText())));
                                    assign.getChild(0).addChild(new AstNode(new CommonToken(CGrammarLexer.NUMBER, Integer.toString(j))));
                                    assign.addChild((AstNode)arr.getChild(j));
                                    nodes.add(assign);
                                }
                                
                                if (i == 0) {
                                    String name = t.getChild(0).getText();
                                    Ident idnt = new Ident(name, context.getParentContext() == null ? IdentType.GlobalVar : IdentType.LocalVar, dataType, nodes.get(0));
                                    idnt.setAsArray();
                                    context.setIdent(idnt, name);
                                }
                            }
                        }
                }
                
                AstNode tree = new AstNode();
                for (AstNode n : nodes)
                    tree.addChild(n);
                node.getParent().replaceChildren(node.getChildIndex(), node.getChildIndex(), tree);
                
                return DataType.Void;
            }
            
            case CGrammarLexer.ARRAYCALL: {
                Ident ident = context.getIdent(node.getChild(0).getText());
                if (ident == null)
                    throw new Exception(String.format("Unknown identifier %s", node.getChild(0).getText()));
                if (!ident.isArray())
                    throw new Exception(String.format("Identifier %s should be array", node.getChild(0).getText()));
                if (check((AstNode)node.getChild(1), context) != DataType.Int)
                    throw new Exception(String.format("Number of calling element in array %s should be of int", node.getChild(0).getText()));
                node.setDataType(ident.getDataType());
                return ident.getDataType();
            }

            case CGrammarLexer.FUNC: //объявление функций
            {
                DataType dataType = strToDataType(node.getChild(0).getText());
                String name = node.getChild(1).getText();
                Ident ident = context.getIdent(name);
                if (ident != null)
                    throw new Exception(String.format("Identifier %s already exists", name));
                Ident func = new Ident(name, IdentType.Function, dataType, node);
                context.setIdent(func, name);
                context = new Context(context);
                CommonTree params = (CommonTree)node.getChild(2);
                for (int i = 0; i < params.getChildCount(); i++)
                {
                    DataType paramDataType = strToDataType(params.getChild(i).getText());
                    CommonTree t = (CommonTree)params.getChild(i).getChild(0);
                    String paramName = null;
                    if (t.getType() == CGrammarLexer.IDENT){ //если параметр - обычная переменная
                        paramName = t.getText();
                    } else 
                        if (t.getType() == CGrammarLexer.ARRAY) { //если параметр - массив
                            paramName = t.getChild(0).getText();
                            if (check((AstNode)t.getChild(1), context) != DataType.Int)
                                throw new Exception(String.format("In function %s illegal array param", name));
                        }
                    if (paramDataType == DataType.Void)
                        throw new Exception(String.format("In function %s void param %s", name, paramName));
                    if (paramName == null)
                        throw new Exception(String.format("In function %s illegal param", name));
                    Ident idnt = new Ident(paramName, IdentType.Param, paramDataType, (CommonTree)params.getChild(i));
                    if (t.getType() == CGrammarLexer.ARRAY) 
                        idnt.setAsArray();
                    context.setIdent(idnt, paramName);
                }
                context.setFunction(func);
                check((AstNode) node.getChild(3), context);
                return DataType.Void;
            }

            case CGrammarLexer.FUNCCALL:
            {
                Ident ident = context.getIdent(node.getChild(0).getText());
                if (ident == null)
                    throw new Exception(String.format("Unknown identifier %s", node.getChild(0).getText()));
                if (ident.getIdentType() != IdentType.Function)
                    throw new Exception(String.format("Identifier %S is not function", node.getChild(0).getText()));
                if (node.getChild(1).getChildCount() != ident.getNode().getChild(2).getChildCount())
                    throw new Exception(String.format("Not equals params count in function %s", node.getChild(0).getText()));
                for (int i = 0; i < ident.getNode().getChild(2).getChildCount(); i++) {
                    DataType formalDataType = strToDataType(ident.getNode().getChild(2).getChild(i).getText());
                    DataType factDataType = check((AstNode)node.getChild(1).getChild(i), context);
                    if (formalDataType != factDataType)
                    {
                        if (formalDataType == DataType.Double && factDataType == DataType.Int)
                            convert((AstNode)node.getChild(1).getChild(i), DataType.Double);
                        else
                            throw new Exception(String.format("In function %s param %d incompatible types %s %s", node.getChild(0).getText(), i, dataTypeToStr(formalDataType), dataTypeToStr(factDataType)));
                    }
                }
                return strToDataType(ident.getNode().getChild(0).getText());
            }

            case CGrammarLexer.IDENT:
            {
                Ident ident = context.getIdent(node.getText());
                if (ident == null)
                    throw new Exception(String.format("Unknown identifier %s", node.getText()));
                if (ident.getIdentType() == IdentType.Function) {
                    if (ident.getDataType() == DataType.Void)
                        throw new Exception(String.format("Function %s returns void", ident.getName()));
                    if (ident.getNode().getChild(1).getChildCount() > 0)
                        throw new Exception(String.format("No params for function %s call", ident.getName()));
                    AstNode call = new AstNode(new CommonToken(CGrammarLexer.FUNCCALL));
                    call.addChild(node);
                    call.addChild(new AstNode(new CommonToken(CGrammarLexer.PARAMS)));
                    node.getParent().setChild(node.getChildIndex(), call);

                    node.setDataType(ident.getDataType());
                    return node.getDataType();
                }
                else
                {
                    node.setDataType(ident.getDataType());
                    return node.getDataType();
                }
            }

            case CGrammarLexer.NUMBER:
            {
                node.setDataType(node.getText().contains(".") ? DataType.Double : DataType.Int);
                return node.getDataType();
            }
            
            case CGrammarLexer.CHR:
            {
                node.setDataType(DataType.Char);
                return node.getDataType();
            }
            
            case CGrammarLexer.STR:
            {
                node.setDataType(DataType.String);
                return node.getDataType();
            }

            case CGrammarLexer.ADD_ASSIGN:
            case CGrammarLexer.SUB_ASSIGN:
            case CGrammarLexer.MUL_ASSIGN:
            case CGrammarLexer.DIV_ASSIGN:
            case CGrammarLexer.MOD_ASSIGN:
            case CGrammarLexer.ASSIGN:
            {
                if (node.getChild(0).getType() == CGrammarLexer.IDENT) {
                    Ident ident = context.getIdent(node.getChild(0).getText());
                    if (ident == null)
                        throw new Exception(String.format("Unknown identifier %s", node.getChild(0).getText()));
                    if (ident.getIdentType() == IdentType.Function)
                        throw new Exception(String.format("Assign to function %s", node.getChild(0).getText()));
                
                    DataType rightDataType = check((AstNode) node.getChild(1), context);
                    if (ident.getDataType() != rightDataType)
                    {
                        if (ident.getDataType() == DataType.Double && rightDataType == DataType.Int)
                            convert((AstNode) node.getChild(1), DataType.Double);
                        else
                            throw new Exception(String.format("incompatible types %s %s", dataTypeToStr(ident.getDataType()), dataTypeToStr(rightDataType)));
                    }
                    return DataType.Void;
                } else
                    if (node.getChild(0).getType() == CGrammarLexer.ARRAYCALL) {
                        DataType leftDataType = check((AstNode) node.getChild(0), context);
                        DataType rightDataType = check((AstNode) node.getChild(1), context);
                        if (leftDataType != rightDataType)
                        {
                            if (leftDataType == DataType.Double && rightDataType == DataType.Int)
                                convert((AstNode) node.getChild(1), DataType.Double);
                            else
                                throw new Exception(String.format("incompatible types %s %s", dataTypeToStr(leftDataType), dataTypeToStr(rightDataType)));
                        }
                        return DataType.Void;
                    }
            }

            case CGrammarLexer.RETURN:
            {
                if (context.getFunction() == null)
                    throw new Exception(String.format("Return not in function in line %d", node.getLine()));

                DataType returnDataType = check((AstNode) node.getChild(0), context);
                if (context.getFunction().getDataType() != returnDataType)
                {
                    if (context.getFunction().getDataType() == DataType.Double && returnDataType == DataType.Int)
                        convert((AstNode) node.getChild(0), DataType.Double);
                    else
                        throw new Exception(String.format("incompatible types %s %s", dataTypeToStr(context.getFunction().getDataType()), dataTypeToStr(returnDataType)));
                }
                return DataType.Void;
            }

            case CGrammarLexer.ADD:
            case CGrammarLexer.SUB:
            case CGrammarLexer.MUL:
            case CGrammarLexer.DIV:
            case CGrammarLexer.MOD:
            case CGrammarLexer.ME:
            case CGrammarLexer.LE:
            case CGrammarLexer.NE:
            case CGrammarLexer.EQ:
            case CGrammarLexer.MT:
            case CGrammarLexer.LT:
            {
                boolean compareOperation = true;
                switch (node.getType()) {
                    case CGrammarLexer.ADD:
                    case CGrammarLexer.SUB:
                    case CGrammarLexer.MUL:
                    case CGrammarLexer.DIV:
                    case CGrammarLexer.MOD:
                        compareOperation = false;
                        break;
                }

                DataType leftDataType = check((AstNode) node.getChild(0), context);
                DataType rightDataType = check((AstNode) node.getChild(1), context);
                if (node.getType() == CGrammarLexer.EQ) {
                    if (leftDataType != rightDataType)
                        throw new Exception(String.format("Invalid types for operation %s, line = %d, pos = %d", node.getText(), node.getLine(), node.getTokenStartIndex()));
                    node.setDataType(DataType.Int);
                    return node.getDataType();
                } else {
                    if (leftDataType != DataType.Double && leftDataType != DataType.Int)
                        throw new Exception(String.format("Left operand invalid type for operation %s, line = %d, pos = %d", node.getText(), node.getLine(), node.getTokenStartIndex()));
                    if (rightDataType != DataType.Double && rightDataType != DataType.Int)
                        throw new Exception(String.format("Right operand invalid type for operation %s, line = %d, pos = %d", node.getText(), node.getLine(), node.getTokenStartIndex()));
                    if (leftDataType == DataType.Double)
                    {
                        if (rightDataType == DataType.Int)
                            convert((AstNode)node.getChild(1), DataType.Double);
                        node.setDataType(compareOperation ? DataType.Int : DataType.Double);
                        return node.getDataType();
                    }
                    if (rightDataType == DataType.Double)
                    {
                        if (leftDataType == DataType.Int)
                            convert((AstNode)node.getChild(0), DataType.Double);
                        node.setDataType(compareOperation ? DataType.Int : DataType.Double);
                        return node.getDataType();
                    }
                    node.setDataType(DataType.Int);
                    return node.getDataType();
                }
            }

            case CGrammarLexer.NOT:
            {
                DataType dataType = check((AstNode) node.getChild(0), context);
                if (dataType != DataType.Int)
                    throw new Exception(String.format("Not operator with type %s", dataTypeToStr(dataType)));
                node.setDataType(DataType.Int);
                return node.getDataType();
            }

            case CGrammarLexer.AND:
            case CGrammarLexer.OR:
            {
                DataType leftDataType = check((AstNode) node.getChild(0), context);
                DataType rightDataType = check((AstNode) node.getChild(1), context);
                if (leftDataType != DataType.Int && rightDataType != DataType.Int)
                    throw new Exception(String.format("%s operator with type %s, %s", node.getText(), dataTypeToStr(leftDataType), dataTypeToStr(rightDataType)));
                node.setDataType(DataType.Int);
                return node.getDataType();
            }

            case CGrammarLexer.WHILE:
            {
                DataType condDataType = check((AstNode)node.getChild(0), context);
                if (condDataType != DataType.Int)
                    throw new Exception(String.format("In while condition type is %s", dataTypeToStr(condDataType)));
                // context = new Context(context);
                check((AstNode)node.getChild(1), context);
                return DataType.Void;
            }
            
            case CGrammarLexer.DOWHILE:
            {
                DataType condDataType = check((AstNode)node.getChild(1), context);
                if (condDataType != DataType.Int)
                    throw new Exception(String.format("In while condition type is %s", dataTypeToStr(condDataType)));
                // context = new Context(context);
                check((AstNode)node.getChild(0), context);
                return DataType.Void;
            }

            case CGrammarLexer.IF:
            {
                DataType condDataType = check((AstNode)node.getChild(0), context);
                if (condDataType != DataType.Int)
                    throw new Exception(String.format("In if condition type is %s", dataTypeToStr(condDataType)));
                // context = new Context(context);
                check((AstNode)node.getChild(1), context);
                if (node.getChildCount() == 3)
                    check((AstNode)node.getChild(2), context);
                return DataType.Void;
            }

            case CGrammarLexer.FOR:
            {
                context = new Context(context);
                checkBlock((AstNode) node.getChild(0), context);
                DataType condDataType = check((AstNode)node.getChild(1), context);
                if (condDataType != DataType.Int)
                    throw new Exception(String.format("In while condition type is %s", dataTypeToStr(condDataType)));
                checkBlock((AstNode)node.getChild(2), context);
                check((AstNode)node.getChild(3), context);
                return DataType.Void;
            }
            
            case CGrammarLexer.BREAK:
            case CGrammarLexer.CONTINUE:
                return DataType.Void;

            default: 
                throw new Exception("Unknown token type");
        }
    }
}
