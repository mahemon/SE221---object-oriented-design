
package lms;

public class HardCopyBooks extends Book {
    protected int page;
   
    public HardCopyBooks() {
    }
    protected void input_page(){
     System.out.println("Enter the book page: ");
     page = in.nextInt();
     in.nextLine();
     
       // System.out.println(id);
    }

    protected void print_page(){
      System.out.println("Book page is: "+page);
    }

}
