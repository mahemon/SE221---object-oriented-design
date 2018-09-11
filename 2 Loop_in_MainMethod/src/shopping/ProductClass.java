package shopping;
import java.util.Scanner;
public class ProductClass {

	private String productId;
	private String productName;
	private double productPrice;
	private int AmountOfProduct;
	
	Scanner myscanner;
	
	public ProductClass()
	{
		myscanner = new Scanner(System.in);
	}
	
	// input method
	public void inputProductInfo()
	{
		System.out.println("Input product id");
		productId = myscanner.next();
		myscanner.nextLine();
		System.out.println("Input product name");
		productName = myscanner.nextLine();
		System.out.println("Input product price");
		productPrice = myscanner.nextDouble();
		System.out.println("Input initial amount of the product");
		AmountOfProduct = myscanner.nextInt();
	}
	
	// display method
	public void displayProductInfo()
	{
		System.out.println("Product Id : "+productId);
		System.out.println("Product name : "+productName);
		System.out.println("Product price : "+productPrice);
		System.out.println("Number of available product : "+AmountOfProduct);
	}
	
	// method to check if the product quantity is sufficient or not
	public boolean productAvailability(int amount)
	{
		if(amount <= AmountOfProduct)
		{
			AmountOfProduct -= amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// getting product id
	public String getProductId()
	{
		return productId;
	}
	
	// getting product price
	public double getPrice()
	{
		return productPrice;
	}
	
	// getting remaining product amount
	public int getRemainingAmount()
	{
		return AmountOfProduct;
	}
	
}
