package Tourism_Management_Company;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Which type of package? [Winter/ Summer]");
		String packagename = myscanner.next();
		if(packagename.equalsIgnoreCase("winter"))
		{
			while(true)
			{
				int noOfPackage;
				System.out.println("How many packages do you want?");
				noOfPackage = myscanner.nextInt();
				
				// array object
				WinterPackage wp[] = new WinterPackage[noOfPackage];
				
				for(int i=0; i<noOfPackage; i++)
				{
					wp[i] = new WinterPackage();
					// method in in TourPackage class
					wp[i].inputPackageInfo();
					// method is in wWinterPackage class
					wp[i].inputSeasonName();
				}
				
				double price=0;
				for(int i=0; i<wp.length; i++)
				{
					wp[i].displayPackageInfo();
					// calculate package price according to package price and number of package 
					price += noOfPackage * wp[i].getPackagePrice();
					System.out.println("Season name : "+wp[i].getSeasonName());
					System.out.println();
				}
				
				Customer customer = new Customer();
				customer.inputCustomerInfo();
				customer.displayCustomerInfo(price);
				
				System.out.println("Do you wish to break the loop? [y/n]");
				String option = myscanner.next();
				if(option.contains("y"))
				{
					break;
				}
			}
		}
		else
		{
			while(true)
			{
				int noOfPackage;
				System.out.println("How many packages do you want?");
				noOfPackage = myscanner.nextInt();
				SummerPackage sp[] = new SummerPackage[noOfPackage];
				
				for(int i=0; i<noOfPackage; i++)
				{
					sp[i] = new SummerPackage();
					sp[i].inputPackageInfo();
					sp[i].inputMonthName();
				}
				
				double price=0;
				for(int i=0; i<sp.length; i++)
				{
					sp[i].displayPackageInfo();
					price += noOfPackage * sp[i].getPackagePrice();
					System.out.println("Season name : "+sp[i].getMonthName());
					System.out.println();
				}
				
				Customer customer = new Customer();
				customer.inputCustomerInfo();
				customer.displayCustomerInfo(price);
				
				System.out.println("Do you wish to break the loop? [y/n]");
				String option = myscanner.next();
				if(option.contains("y"))
				{
					break;
				}
			}
		}
		myscanner.close();
	}
}
