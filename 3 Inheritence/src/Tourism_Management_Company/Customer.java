package Tourism_Management_Company;
import java.util.Scanner;
public class Customer {

	private String customerId;
	private String customerName;
	private String customerAddress;
	private String customerType;
	
	Scanner myscanner;
	
	public Customer()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void inputCustomerInfo()
	{
		System.out.println("Please enter customer id");
		customerId = myscanner.next();
		System.out.println("Please enter customer name");
		myscanner.nextLine();
		customerName = myscanner.nextLine();
		System.out.println("Please enter customer address");
		customerAddress = myscanner.nextLine();
		System.out.println("Customer type [Registered/ Non registered]");
		customerType = myscanner.nextLine();
		if(customerType.equalsIgnoreCase("registered"))
		{
			System.out.println("Customer verified.");
		}
		else
		{
			System.out.println("Customer is not registered.");
		}
	}
	
	
	public void displayCustomerInfo(double bill)
	{
		System.out.println();
		System.out.println("Customer name    : "+customerName);
		System.out.println("Customer id      : "+customerId);
		System.out.println("Customer address : "+customerAddress);
		System.out.println("Customer type    : "+customerType);
		System.out.println("Bill             : "+bill);
		System.out.println("Discount         : "+calculateDiscount(bill));
		System.out.println("Final bill       : "+ (bill - calculateDiscount(bill)));
	}
	
	public double calculateDiscount(double price)
	{
		if(customerType.equalsIgnoreCase("registered"))
		{
			return price * .10;
		}
		else
		{
			return 0.0;
		}
	}
}
