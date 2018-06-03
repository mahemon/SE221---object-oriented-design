package basicinheritance;

import java.util.Scanner;
// supper class
public class Person {
    private String name;
    private String address;
    Scanner input;
    public Person(){
     input=new Scanner(System.in);
    }
    public void input_name(){
       System.out.println("Enter name:");
       name=input.nextLine();
    }
    public void set_name(String name){
    this.name=name;
    }
    public String get_name(){
    return name;
    } 
    
    public void input_address(){
       System.out.println("Enter name:");
       name=input.nextLine();
    }
    public void set_address(String address){
    this.address=address;
    }
    public String get_address(){
    return address;
    }
}
