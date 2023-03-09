package models;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Factory{

	public Map<String, LinkedList> getDataStructure(String type){
        
        switch(type){
            case "HashMap":
                return new HashMap<String, LinkedList>();
            case "Array":
            	return new TreeMap<String, LinkedList>();
            case "TreeMap":
                return new LinkedHashMap<String, LinkedList>();
            default:
            	return new TreeMap<String, LinkedList>();
        }
    }
	
}