package superShop;
public class Owner extends Person{
    String OwnerDesignation;
    String CompanyName;
    
    public void OwerInfo(){
         PersonInfo();
        System.out.println("designation:");
        OwnerDesignation=input.nextLine();
        System.out.println("company name:");
        CompanyName=input.nextLine();
    }
    
    public void PrintOwner(){
        System.out.println("name:"+name);
        System.out.println("age: "+age);
        System.out.println("phone number: "+phoneNumber);
        System.out.println("address: "+address);
        System.out.println("designation: "+OwnerDesignation);
        System.out.println("company name: "+CompanyName);
        
    }
}
