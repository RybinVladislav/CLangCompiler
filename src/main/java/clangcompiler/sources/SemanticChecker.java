/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clangcompiler.sources;

/**
 *
 * @author Andrey
 */
public class SemanticChecker {
    private static DataType strToDataType(String type) throws Exception {
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
    
    private static String dataTypeToStr(DataType type) {
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
    
    
}
