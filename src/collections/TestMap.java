package collections;
import java.util.*;

	public class TestMap {

	   public static void main (String[] args) {
        
		   // Create a HashMap
           Map<String, Integer> hashMap = new HashMap<String,Integer>();
           hashMap.put("Smith", 30);
		   hashMap.put("Anderson", 31);
		   hashMap.put("Lewis", 29);
		   hashMap.put("Cook", 29);
		   hashMap.put("Cook", 100);

		   System.out.println("Display entries in HashMap");
		   System.out.println(hashMap);

		 //Create a TreeMap from the HashMap
          Map<String, Integer> treeMap = new TreeMap<String,Integer>(hashMap);
          
          System.out.println("Display entries in ascending order of key");
          System.out.println(treeMap);

		 //Create a LinkedHashMap
          Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(16, 0.75f, true);
          linkedHashMap.put("Smith", 30);
          linkedHashMap.put("Anderson", 31);
          linkedHashMap.put("Bike", 29);
          linkedHashMap.put("Cook", 11);
          linkedHashMap.put("Duke", 11);

		 //Display the age for Bike
         //System.out.println("The age for " + "Bike is " + linkedHashMap.get("Bike").intValue());
        
          System.out.println("Display entries in LinkedHashMap");
          System.out.println(linkedHashMap);
    }
}

