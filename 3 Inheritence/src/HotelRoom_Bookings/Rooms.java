package HotelRoom_Bookings;

import java.util.Scanner;

public class Rooms {

    private String roomNumber;
    private int numberOfBed;
    private double roomsize;
    private double rate;
    private String customerId = null;
    
    Scanner myscanner;
    
    Customer customer = new Customer();
    
    public Rooms()
    {
        myscanner = new Scanner(System.in);
    }
    
    public void inputAll()
    {
        System.out.println("------- Input Room Information ------");
        System.out.print("Enter room number     : ");
        roomNumber = myscanner.next();
        System.out.print("Enter number of beds  : ");
        numberOfBed = myscanner.nextInt();
        System.out.print("Enter room size(sqr)  : ");
        roomsize = myscanner.nextDouble();
        System.out.print("Enter room rate(tk)   : ");
        rate = myscanner.nextDouble();
                
    }
    

    public String getRoomNumber()
    {
        return roomNumber;
    }
    
    public int getBedNumber()
    {
        return numberOfBed;
    }
    
    public double getRoomSize()
    {
        return roomsize;
    }
    
    public double getRoomRate()
    {
        return rate;
    }
    
    public void setCustomerId(String id)
    {
        customerId = id;
    }
    
    public String getCustomerId()
    {
        return customerId;
    }
    
}
