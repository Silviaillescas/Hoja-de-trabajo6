package models;
import interfaces.IMap;
import models.HashMap;
import models.TreeMap;
import models.LinkedHashMap;


public class Factory<T> {

	public IMap<T> getDataStructure(String type){
        
        switch(type){
            case "HashMap":
                return new HashMap<T>();
            case "Array":
            	return new TreeMap<T>();
            case "TreeMap":
                return new LinkedHashMap<T>();
            default:
                return new HashMap<T>();
        }
    }
	
}