package collections;
import java.util.*;

import comparator.Person;
public class TestTreeSet {
  public static void main(String[] args) {
         //Create a hash set
       	Set<String> set = new TreeSet<String>();
        
        //Add strings to the set
       	set.add("London");
       	set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        
    	System.out.println(set);
  }
 }
  