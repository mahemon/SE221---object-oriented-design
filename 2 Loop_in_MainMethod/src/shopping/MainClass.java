package shopping;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		
		// salesman info
		System.out.println("\n\tSales man info");
		System.out.println("How many salesman?");
		int noOfSalesman = myscanner.nextInt();
		
		// making array object
		SalesmanClass salesman[] = new SalesmanClass[noOfSalesman];  
		for(int j=0; j < noOfSalesman; j++)
		{
			// new class for each salesman
			salesman[j] = new SalesmanClass(); 
			
			 // inherited method from PersonClass
			salesman[j].inputPersonInfo();
			// method in SalesmanClass
			salesman[j].displaySalesmanInfo();
		}
		
		
		// product info
		System.out.println("\n\tProduct info");
		System.out.println("How many products do you want to input?");
		int noOfProducts = myscanner.nextInt();
		
		// making array object
		ProductClass product[] = new ProductClass[noOfProducts]; 
		int count = 0; // set count to 0.
		for(int i=0; i < noOfProducts; i++)
		{
			System.out.println("Product serial index "+(++count));
			// making new object for each product
			product[i] = new ProductClass(); 
			// method in ProductClass
			product[i].inputProductInfo();
		}
		
		// Customer info
		System.out.println("\n\tCustomer info");
		System.out.println("How many customer do you want to register?");
		int noOfCustomer = myscanner.nextInt();
		
		// making array object
		CustomerClass customer[] = new CustomerClass[noOfCustomer];  
		for(int c = 0; c < noOfCustomer; c++)
		{
			// new object for each customer
			customer[c] = new CustomerClass();
			// inherited method from PersonClass
			customer[c].inputPersonInfo();
			// set customer type
			customer[c].setTypeOfCustomer();  
		}
		
		while(true)
		{
			// displaying product
			System.out.println("---------- Product ---------");
			for(int i = 0; i < product.length; i++)
			{
				product[i].displayProductInfo();
				System.out.println();
			}
			
			System.out.println("Which product do you want to buy? (give product id)");
			String productId = myscanner.next();
			// assigning indexOfProduct variable to -1 as the loop starts from 0.
			int indexOfProduct = -1; 
			
			for (int p = 0; p < product.length; ++p) 
			{
				// check if the product id is available or not
                if (product[p].getProductId().equals(productId))  
                {
                	// if product id is available then the id will be assigned to indexOfProduct variable.
                    indexOfProduct = p;  
                    break; // break the loop
                }
		    }
			
			// check if the selected product is sufficient or not.
			if(product[indexOfProduct].getRemainingAmount() > 0) 
			{
				System.out.println("How much do you want?");
				int qunatity = myscanner.nextInt();
				// if the product is sufficient then required quantity will be subtracted from the main amount.
				if(product[indexOfProduct].productAvailability(qunatity))
				{
					System.out.println("Please input customer id");
					String customer_id = myscanner.next();
					// set indexOfCustomer variable to -1 as the loop starts from 0.
					int indexOfCustomer = -1;
					
					for(int q = 0; q < customer.length; q++)
					{
						// checks the person id to see that whether the person is registered or not
						if(customer[q].getPersonId().equals(customer_id))
						{
							// if the person is registered than set customer id to indexOfCustomer variable
							indexOfCustomer = q;
							break;
						}
					}
					if(indexOfCustomer == -1) // if the customer is not registered then this message will show up.
					{
						System.out.println("Sorry !! The customer is not registered.");
					}
					else
					{
						customer[indexOfCustomer].displayCustomerInfo(product[indexOfProduct].getPrice() * qunatity); // else selected customer will buy selected product.
					}
				}
				else
				{
					System.out.println("Sorry!! The requested product is out of stock"); // if the quantity exceeds then this message will show up
				}
			}
			else
			{
				System.out.println("Sorry!! The product is not currently unavailable"); // if the product is not found then this message will show up
			}
				
			System.out.println("Do you want to break? type yes to break"); // taking request to buy another one product
			String option = myscanner.next();
			if(option.equalsIgnoreCase("yes"))
			{
				break;
			}
		}
		
		myscanner.close(); // closing scanner
	}
}
