package comparator;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
    public static void main(String args[]){
        
        ArrayList<Person> per=new ArrayList<Person>();
    
        per.add(new Person("Raj",23));
        per.add(new Person("Kumar",25));
        per.add(new Person("Ram",18));
        per.add(new Person("Giri",21));
        
    System.out.println("Unsorted :"+per);
    
    Collections.sort(per,new AgeSort());
    
        System.out.println("Sorted :"+per);
    }
}
