/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clangcompiler.sources;

import org.antlr.runtime.tree.CommonTree;

/**
 *
 * @author Andrey
 */
public class Ident {
    private String name;
    private IdentType identType;
    private DataType dataType;
    private CommonTree node;
    private int id;
    
    private boolean array;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAsArray() {
        array = true;
    }
    
    public boolean isArray() {
        return array;
    }

    public IdentType getIdentType() {
        return identType;
    }

    public void setIdentType(IdentType identType) {
        this.identType = identType;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }
    
    public CommonTree getNode() {
        return this.node;
    }
    
    public void setNode(CommonTree node) {
        this.node = node;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Ident(String name, IdentType identType, DataType dataType, CommonTree node)
    {
        this.name = name;
        this.identType = identType;
        this.dataType = dataType;
        this.node = node;
        this.array = false;
        this.id = -1;
    }
}
