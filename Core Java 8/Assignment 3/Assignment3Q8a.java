package a3assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment3Q8a {
	Assignment3Q8a(){
		Thread t = new Thread();
	 	   t.start();
	}
	public static Map<String,String> mp = new HashMap<String,String>();
    public static void failFast(Map<String, String> cityCode){
		Set entrySet = cityCode.entrySet();
		Iterator it = entrySet.iterator();
		cityCode.put("E1", "India");
	    cityCode.put("E2", "Canada");
	    cityCode.put("E3", "England");
		
		while(it.hasNext()) {
			//Map.Entry i = (Entry) it.next();
			System.out.println(cityCode.get(it.next()));
			cityCode.put("E6","Lanka");
		}
		
    }
    public static void main(String[] args) {
	   /*mp.put("E1", "India");
	   mp.put("E2", "Canada");
	   mp.put("E3", "England");
	   failFast(mp);*/
	   
    }
}