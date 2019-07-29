
package lms;

import java.util.Scanner;

public class Book  {
protected String id;
protected String title;
protected String author;
protected double price;
protected int memId;
Scanner in = new Scanner(System.in);
public Book(){   
}
public void InputAll(){
    System.out.println("Enter the book id: ");
    id = in.nextLine();
    
    System.out.println("Enter the book title: ");
    title = in.nextLine();
    
    System.out.println("Enter the book author: ");
    author = in.nextLine();
    
    System.out.println("Enter the book price: ");
    price = in.nextDouble();
}

protected void set_member_id(int m){
  memId=m;
}

public void printInfo()
{
    System.out.println("book id: "+id);
    System.out.println("book title: "+title);
    System.out.println("book author: "+author);
    System.out.println("book price: "+price);
    System.out.println("book member id: "+memId);
}

}
