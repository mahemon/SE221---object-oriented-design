
package superShop;

import java.util.Scanner;

public class Person {
    String name;
    String age;
    String phoneNumber;
            
    String address;
    Scanner input= new Scanner(System.in);
    public void PersonInfo(){
        System.out.println("name: ");
        name=input.nextLine();
        System.out.println("age: ");
        age=input.nextLine();
        System.out.println("phone number: ");
        phoneNumber=input.nextLine();
        System.out.println("address: ");
        address=input.nextLine();
       
    }
    
}
