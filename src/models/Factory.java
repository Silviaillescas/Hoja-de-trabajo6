package models;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Factory{

	public Map<String, LinkedList<String>> getDataStructure(String type){
        
        switch(type){
            case "HashMap":
                return new HashMap<String, LinkedList<String>>();
            case "Array":
            	return new TreeMap<String, LinkedList<String>>();
            case "TreeMap":
                return new LinkedHashMap<String, LinkedList<String>>();
            default:
            	return new TreeMap<String, LinkedList<String>>();
        }
    }
	
}