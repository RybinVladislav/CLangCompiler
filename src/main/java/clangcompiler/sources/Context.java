/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clangcompiler.sources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Andrey
 */
public class Context {
    private Context parentContext;
    private List<Context> childContexts;
    
    private int count = 0;
    
    private int currentChild = -1;
    
    private Map<String, Ident> idents = new HashMap<String, Ident>();
    
    public Context(Context parentContext) {
        this.childContexts = new ArrayList<Context>();
        this.parentContext = parentContext;
        if (parentContext != null)
            parentContext.getChildContexts().add(this);
    }
    
    public Ident getIdent(String name) {
        return getIdents().containsKey(name) ? getIdents().get(name) : 
                parentContext != null ? parentContext.getIdent(name) : null;
    }
    
    public void setIdent(Ident ident, String name) {
        getIdents().put(name, ident);
        if (ident.getIdentType() == IdentType.GlobalVar) {
            Context c = this;
            while (c.getParentContext() != null) c = c.parentContext;
            c.increaseCount();
        } else
        if (ident.getIdentType() == IdentType.LocalVar) {
            Context c = this;
            while (c.getParentContext().getParentContext().getParentContext() != null) c = c.parentContext;
            c.increaseCount();
        }
        if (ident.getIdentType() == IdentType.Param) {
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
        return getIdents().containsKey(name) ? getIdents().get(name) : null;
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
        if (parentContext == null || parentContext.getParentContext() == null || parentContext.getParentContext().getParentContext() == null)
            return count;
        return parentContext.getIdentCount();
    }

    public List<Context> getChildContexts() {
        return childContexts;
    }
    
    public Context getCurrentChild() {
        if (currentChild > -1)
            return childContexts.get(currentChild);
        return this;
    }
    
    public void increaseCurrentChild() {
        currentChild++;
    }

    /**
     * @return the idents
     */
    public Map<String, Ident> getIdents() {
        return idents;
    }
    
    /**
     * 
     * @return idents from this and children
     */
    public Map<String, Ident> getAllIdents() {
        Map<String, Ident> idents = new HashMap<String, Ident>();
        for (Entry<String, Ident> id : getIdents().entrySet()) {
            if (idents.get(id.getKey()) == null)
                idents.put(id.getKey(), id.getValue());
            else idents.put("V_" + id.getValue().getId(), id.getValue());
        }
        for (Context c : getChildContexts()) {   
            for (Entry<String, Ident> id : c.getAllIdents().entrySet()) {
                if (idents.get(id.getKey()) == null)
                    idents.put(id.getKey(), id.getValue());
                else idents.put("V_" + id.getValue().getId(), id.getValue());
            }
        }
        return idents;
    }
}
