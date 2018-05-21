package vn.hvcg;

import com.example.AnotherHello;
//Full vn.hvcg.HelloWorld;

public class HelloWorld {

public static void main(String[] args){
    Person a = new Person();
    
    System.out.println(a.sayCount());

    Person b = new Person();
    System.out.println(b.sayCount());

    Person c = new Person();
    System.out.println(c.sayCount());


    System.out.println(Person.sayCountStatic());
}


}