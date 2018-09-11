package HotelRoom_Bookings;

import java.util.Scanner;

public class Customer{

    private String customerId = null;
    private String customerName;
    private String customerEmail;
    private String customerAddress;
    
    Scanner myscanner;
    
    public Customer()
    {
        myscanner = new Scanner(System.in);
    }
    
    public void inputCustomerInfo()
    {
        System.out.println("------ Input Customer Information ------");
        System.out.print("Please enter customer id      : ");
        customerId = myscanner.next();
        System.out.print("Please enter customer name    : ");
        myscanner.nextLine();
        customerName = myscanner.nextLine();
        System.out.print("Please enter customer email   : ");
        customerEmail = myscanner.next();
        System.out.print("Please enter customer address : ");
        myscanner.nextLine();
        customerAddress = myscanner.nextLine();
    }


    public String getId()
    {
        return customerId;
    }    
    
    public String getCustomerName()
    {
        return customerName;
    }
    
    public String getCustomerEmail()
    {
        return customerEmail;
    }
    
    public String getCustomerAddress()
    {
        return customerAddress;
    }
}
