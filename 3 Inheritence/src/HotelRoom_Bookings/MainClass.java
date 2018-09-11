package HotelRoom_Bookings;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        // for suit room
        System.out.println("How many suit room to input?");
        int noOfRoom = myscanner.nextInt();
        // array object of SuitRoom class
        
        SuitRoom suit[] = new SuitRoom[noOfRoom];
        
        // extra facility initialized to null
        String facility[] = null;
        for(int i=0; i<noOfRoom; i++)
        {
            suit[i] = new SuitRoom();
            suit[i].inputAll();
	            
	        System.out.print("How many extra facility?    : ");
	        int numOfFacility = myscanner.nextInt();
	        // set facility
	        facility = new String[numOfFacility];
	        
	        System.out.println("------- Input facility --------");
	
	        for (int j = 0; j < numOfFacility; j++) 
	        {
	            facility[j] = myscanner.next();
	        }
        }
        while (true) 
        {
	        Customer customer = new Customer();
	        System.out.println("Enter room number to book");
	        String number = myscanner.next();

	        for(int k=0; k<suit.length; k++)
	        {
	        	// search room number. method in Rooms class
	            if(number.equals(suit[k].getRoomNumber()))
	            {
	            	// if room is found then check if the room is available or not
		            if (suit[k].getCustomerId() == null) 
		            {
		            	// input customer information
		                customer.inputCustomerInfo();
		                
		                System.out.println();
		                System.out.println("--------- Printing all information ---------");
		                // displaying customer info
		                System.out.println("Customer id         : " + customer.getId());
		                System.out.println("Customer name       : " + customer.getCustomerName());
		                System.out.println("Customer email      : " + customer.getCustomerEmail());
		                System.out.println("Cutomer address     : " + customer.getCustomerAddress());
		                System.out.println("Booking room number : " + suit[k].getRoomNumber());
		                System.out.println("Room bed number     : " + suit[k].getBedNumber());
		                System.out.println("Room size           : " + suit[k].getRoomSize());
		                System.out.println("Room rate           : " + suit[k].getRoomRate());
		                System.out.println("---- Extra facilities ----");
		                int count = 0;
		                // display all facility of the room that were inputed before.
		                for (String facility1 : facility) 
		                {
		                    System.out.println("Facility number " + (++count) + " : "+facility1);
		                }
		                
		                // set customer id to the booked room
		                suit[k].setCustomerId(customer.getId());
		            }
		            else
		            {
		                System.out.println("Sorry. The room is already being allocated by "+ customer.getCustomerName());
		            }
		        }
	            else
	            {
	            	System.out.println("Sorry!! The requested room is not exists.");
	            	break;
	            }
	        }
	        System.out.println("Want to get another room? [yes/no]");
            String br = myscanner.next();
            if (br.equalsIgnoreCase("n")) 
            {
                break;
            }
        }
        myscanner.close();
    }
}
