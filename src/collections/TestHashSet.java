package collections;

import java.util.*;

	public class TestHashSet {
      public static void main(String[] args) {
         //Create a Hash set
       	HashSet<String> set = new HashSet<String>();
        
        //Add strings to the set
       	set.add("London");
       	set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        
        //Display the elements using SOP
        System.out.println(set);
        
//        //Display the elements using for each loop
//        for (String element: set)
//        System.out.print(element+ " ");
//    	  
//        
//        System.out.println();
//        //Display the elements using iterator
//        Iterator<String> it=set.iterator();
//            while(it.hasNext()){
//              System.out.print(it.next());
//            }
              
    	}
	}
