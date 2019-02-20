package collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomTreeSet {
      public static void main(String[] args) {
          
            Comparator<Person> comparator = new Comparator<Person>() {
                @Override
                    public int compare(Person p1,Person p2){
                        return(p1.getAge()-p2.getAge());
                    }
                }; 
          
         //Create a Tree set
       	Set<Person> set = new TreeSet<Person>(comparator);
        
        	//Add Person objects to the set
            set.add(new Person("Raj",23));
            set.add(new Person("Kumar",25));
            set.add(new Person("Ram",18));
            set.add(new Person("Giri",21));
        
            System.out.println(set);
        
        }
	}
