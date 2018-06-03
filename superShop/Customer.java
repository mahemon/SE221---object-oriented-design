
package superShop;
public class Customer extends Person{
    String cType;
    String purchaseItem;
    
    
       public void CustomerInfo(){
        PersonInfo();
        System.out.println("customer type:");
        cType=input.nextLine();
        System.out.println("purchase item:");
        purchaseItem=input.nextLine();
    }
    
    public void PrintCustomer(){
        System.out.println("name:"+name);
        System.out.println("age: "+age);
        System.out.println("phone number: "+phoneNumber);
        System.out.println("address: "+address);
        System.out.println("designation: "+cType);
        System.out.println("purchase item: "+purchaseItem);
        
    }
}
