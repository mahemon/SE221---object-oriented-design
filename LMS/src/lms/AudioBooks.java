package lms;
public class AudioBooks extends Book {
    protected int duration;

    public AudioBooks() {
        //super();
    }
    
    protected void input_duration(){
     System.out.println("Enter the book duration: ");
     duration = in.nextInt();
    }

    protected void print_duration(){
        System.out.println("Book duration is: "+duration);
    }
    
}
