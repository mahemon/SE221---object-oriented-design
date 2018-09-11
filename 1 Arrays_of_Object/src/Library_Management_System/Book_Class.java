package Library_Management_System;
import java.util.Scanner;
public class Book_Class {

	private String bookId;
	private String bookTitle;
	private String bookAuthor;
	private double bookPrice;
	private String possession_of_book = "0";
	
	Scanner myscanner;
			
	public Book_Class()
	{
		myscanner = new Scanner(System.in);
	}
	
	
	public void inputAll()
	{
		System.out.println("Please enter book id");
		bookId = myscanner.next();
		System.out.println("Book name");
		myscanner.nextLine();
		bookTitle = myscanner.nextLine();
		System.out.println("Name of the author");
		bookAuthor = myscanner.nextLine();
		System.out.println("Book Price");
		bookPrice = myscanner.nextDouble();
	}
	
	public String getBookId()
	{
		return bookId;
	}
	
	public String getBookTitle()
	{
		return bookTitle;
	}
	
	public String getBookAuthor()
	{
		return bookAuthor;
	}
	
	public double getBookPrice()
	{
		return bookPrice;
	}
	
	public boolean book_Availability()
	{
		if(possession_of_book.equals("0"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void setBook_borrower_id(String mId)
	{
		possession_of_book = mId;
	}
	public String getBook_borrower_id()
	{
		return possession_of_book;
	}
}