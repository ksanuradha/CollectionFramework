package collections;

import java.util.*;

	public class TestLinkedHashSet {
      public static void main(String[] args) {
         //Create a linked Hash set
       	Set<String> set = new LinkedHashSet<String>();
        //Add strings to the set
       	set.add("London");
       	set.add("Paris");
       	set.add("New York");
        set.add("San Francisco");
      	set.add("Beijing");
        set.add("New York");
        
      	System.out.println(set);
            
//      set.remove("San Francisco");
//      System.out.println(set);
        
        		
    	}
	}
