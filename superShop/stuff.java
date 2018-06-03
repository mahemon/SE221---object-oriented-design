
package superShop;
public class stuff extends Person{
    String StuffDesignation;
    double salary;
    
       public void stuffInfo(){
        PersonInfo();
        System.out.println("designation:");
        StuffDesignation=input.nextLine();
        System.out.println("salary:");
        salary=input.nextDouble();
    }
    
    public void PrintStuff(){
        System.out.println("name:"+name);
        System.out.println("age: "+age);
        System.out.println("phone number: "+phoneNumber);
        System.out.println("address: "+address);
        System.out.println("designation: "+StuffDesignation);
        System.out.println("salary: "+salary);
        
    }
}
