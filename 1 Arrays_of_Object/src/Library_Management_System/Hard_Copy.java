package Library_Management_System;

public class Hard_Copy extends Book_Class{

	private int numberOfPages;
	
	public void inputNumberOfPages()
	{
		System.out.println("How many pages in book id "+getBookId());
		numberOfPages = myscanner.nextInt();
	}
	
	public void setNewMemberIdForABook()
	{
		Member_Class member = new Member_Class();
		setBook_borrower_id(member.getMemberId());
	}
	public void display_All_Info_About_HardCopy_Type_Book()
	{
		System.out.println("\n\nBook id              : "+getBookId());
		System.out.println("Book title           : "+getBookTitle());
		System.out.println("Book author          : "+getBookAuthor());
		System.out.println("Book price           : "+getBookPrice());
		System.out.println("Book total pages     : "+numberOfPages);
		if(book_Availability())
		{
			System.out.println("Status of the book   : Available");
		}
		else
		{
			System.out.println("Status of the book   : Not available");
		}
		System.out.println("\n");
	}
}