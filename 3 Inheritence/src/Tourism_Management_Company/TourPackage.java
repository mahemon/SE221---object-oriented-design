package Tourism_Management_Company;
import java.util.Scanner;
public class TourPackage {

	private String packageId;
	private String packageName;
	private double packagePrice;
	private int seatCapacity;
	private int seat;
	
	Scanner myscanner;
	
	public TourPackage()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void inputPackageInfo()
	{
		System.out.println("Please enter package id");
		packageId = myscanner.next();
		System.out.println("Please enter package name");
		myscanner.nextLine();
		packageName = myscanner.nextLine();
		System.out.println("Please enter package price");
		packagePrice = myscanner.nextDouble();
		System.out.println("Please enter seat quantity");
		seat = myscanner.nextInt();
		seatCapacity += seat;
		if(seatCapacity <= 10)
		{
			System.out.println("Package booked successfully!!");
		}
		else
		{
			System.out.println("Sorry!! Seat is not available for the requested package.");
			System.exit(0);
		}
	}
	
	public  double getPackagePrice()
	{
		return packagePrice;
	}
	
	public void displayPackageInfo()
	{
		System.out.println("Package id          : "+packageId);
		System.out.println("Package name        : "+packageName);
		System.out.println("Package price       : "+packagePrice);
		System.out.println("Package seat booked : "+seat);
	}
}
