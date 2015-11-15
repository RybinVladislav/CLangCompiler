/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clangcompiler.sources;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTreeAdaptor;

/**
 *
 * @author Andrey
 */
public class AstNodeTreeAdapter extends CommonTreeAdaptor {
    @Override
    public Object create(Token payload)
    {
        return new AstNode(payload);
    }
}
