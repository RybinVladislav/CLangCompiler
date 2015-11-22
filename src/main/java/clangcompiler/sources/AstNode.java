/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clangcompiler.sources;

import clangcompiler.antlr.CGrammarLexer;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

/**
 *
 * @author Vladislav Rybin
 */
public class AstNode extends CommonTree{
    
    private DataType dataType = DataType.Void;
    private Ident ident = null;
    
    public AstNode() {
        super();
    }
    
    public AstNode(CommonTree node) {
        super(node);
    }
    
    public AstNode(AstNode node) {
        super(node);
    }
    
    public AstNode(Token t) {
        super(t);
    }
    
    public DataType getDataType() {
        return dataType;
    }
    
    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }
    
    public Ident getIdent() {
        return ident;
    }
    
    public void setIdent(Ident ident) {
        this.ident = ident;
    }
    
    @Override
    public String toString()
    {
        String result = super.toString();
        if (dataType != DataType.Void)
            result += ", " + SemanticChecker.dataTypeToStr(dataType);
        if (ident != null) {
            result += ", " + ident.getIdentType().toString() + ", id = " + Integer.toString(ident.getId());
        }
        return result;
    }

}
