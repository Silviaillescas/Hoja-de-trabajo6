package models;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Factory{

	public Map<String, String> getDataStructure(String type){
        
        switch(type){
            case "HashMap":
                return new HashMap<String, String>();
            case "Array":
            	return new TreeMap<String, String>();
            case "TreeMap":
                return new LinkedHashMap<String, String>();
            default:
            	return new TreeMap<String, String>();
        }
    }
	
}