package a4assignments;

import java.util.HashMap;

/*
 * Convert every key-value pair of the map into a string and append them all into a single string, in iteration order. 
 * HINT: Use Map.entrySet() method & a StringBuilder to construct the result String.

*/

public class Assignment4Q7 {
    public static void main(String[] args) {
    	
    }
    public String convertKeyValueToString(HashMap<String, Integer> map) {
    	StringBuilder res = new StringBuilder();
    	for(HashMap.Entry<String,Integer> mp:map.entrySet()) {
    		res.append(mp.getKey()+mp.getValue());
    	}
    	return res.toString();
    }
}