package shopping;

public class SalesmanClass extends PersonClass{

	public SalesmanClass()
	{
		super();
	}
	
	public void displaySalesmanInfo()
	{
		System.out.println("Salesman Id : "+getPersonId());
		System.out.println("Salesman name : "+getPersonName());
	}
}
