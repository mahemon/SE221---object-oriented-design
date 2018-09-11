package shopping;

public class CustomerClass extends PersonClass{

	private final double tax = 0.02;   // initializing tax. (not necessary)
	private String customerType = null;
	
	public CustomerClass()
	{
		super();
	}
	
	// set customer type
	public void setTypeOfCustomer()
	{
		System.out.println("Input customer type");
		customerType = myscanner.next();
	}
	
	// get customer type
	public String getCustomerType()
	{
		return customerType;
	}
	
	// method to display customer info
	public void displayCustomerInfo(double bill)
	{
		System.out.println("Customer id : "+getPersonId());
		System.out.println("Customer name : "+getPersonName());
		System.out.println("Cutomer type : "+getCustomerType());
		System.out.println("Initial bill : "+bill);
		System.out.println("Tax is : "+calculateTax(bill));
		System.out.println("Discount is : "+calculateDiscount(bill));
		System.out.println("Final bill is : "+ (bill + calculateTax(bill) - calculateDiscount(bill)));
	}
	
	// method to calculate tax
	public double calculateTax(double currentBill)
	{
		return currentBill*tax;
	}
	
	public double calculateDiscount(double currentBill)
	{
		if(customerType.equalsIgnoreCase("member") || customerType.equalsIgnoreCase("registered"))
		{
			return currentBill * 0.05;
		}
		else
		{
			return 0.0;
		}
	}
}
