/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clangcompiler.sources;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Andrey
 */
public class Context {
    private Context parentContext;
    
    private int count = 0;
    
    private Map<String, Ident> idents = new HashMap<String, Ident>();
    
    public Context(Context parentContext) {
        this.parentContext = parentContext;
    }
    
    public Ident getIdent(String name) {
        return idents.containsKey(name) ? idents.get(name) : 
                parentContext != null ? parentContext.getIdent(name) : null;
    }
    
    public void setIdent(Ident ident, String name) {
        idents.put(name, ident);
        if (ident.getIdentType() == IdentType.GlobalVar) {
            Context c = this;
            while (c.getParentContext() != null) c = c.parentContext;
            c.increaseCount();
        } else
        if (ident.getIdentType() == IdentType.LocalVar){
            Context c = this;
            while (c.getParentContext().getParentContext() != null) c = c.parentContext;
            c.increaseCount();
        }
    }
    
    public void increaseCount(){
        count++;
    }
    
    public Ident inThisContext(String name)
    {
        return idents.containsKey(name) ? idents.get(name) : null;
    }
        
    private Ident function = null;
    
    public Ident getFunction(){
        return (Ident)(function != null ? function : 
                parentContext != null ? parentContext.getFunction() : null);
    }
    
    public void setFunction(Ident value){
        function = value;
    }
    
    public Context getParentContext(){
        return parentContext;
    }
    public int getIdentCount() {        
        if (parentContext == null || parentContext.getParentContext() == null)
            return count;
        return parentContext.getIdentCount();
    }
}
