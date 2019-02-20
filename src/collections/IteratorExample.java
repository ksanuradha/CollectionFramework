package collections;
  import java.util.ArrayList;
  import java.util.Iterator;
  
public class IteratorExample {
  public static void main(String args[]){
    
  ArrayList<String> al = new ArrayList<String>();
  
  al.add("Jazz");
  al.add("Classical");
  al.add("Rock n Roll");

  
  System.out.println(al);
    
 Iterator<String> it=al.iterator();
 while(it.hasNext()){
     if((it.next()).equalsIgnoreCase("Classical"))
         it.remove();
 }
      System.out.println("after removing an object");
      System.out.println(al);
  }
}
