package comparator;

import java.io.Serializable;

import java.util.Comparator;

public class Person implements Serializable { 
    private String name;
    transient private int age;
    
    
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    public String toString(){
        return "Name :"+this.name+" age:"+this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
