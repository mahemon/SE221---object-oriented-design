package Mentor;
import java.util.Scanner;
public class PersonClass{

	private int id;
	private String name;
	private String contact_no;
	
	Scanner myscanner;
	public PersonClass()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void inputPersonInfo()
	{
		System.out.print("Enter id             : ");
		id = myscanner.nextInt();
		myscanner.nextLine();
		System.out.print("Enter name           : ");
		name = myscanner.nextLine();
		System.out.print("Enter contact number : ");
		contact_no = myscanner.next();
	}
	
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getContactNumber()
	{
		return contact_no;
	}
}

