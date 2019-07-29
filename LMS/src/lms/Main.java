package lms;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // create object of scanner
        
        HardCopyBooks hc= new HardCopyBooks();  // creating object of hard copy book class
        
        AudioBooks oc= new AudioBooks(); // creating object of audio copy book class
        
        System.out.println("enter information for hard copy book:");
        hc.InputAll();   // take input for hard copy book 
        hc.input_page();  // take input for hard copy book 
        
        System.out.println("enter information for audio copy book:");
        oc.InputAll();  // take input for audio copy book 
        oc.input_duration(); // take input for duration
        
        Member mem1 = new Member();  // create object of three member
        Member mem2 = new Member();
        Member mem3 = new Member();
        mem1.input_memberInfo();     // take member information
        mem2.input_memberInfo();
        mem3.input_memberInfo();
        
        // now assign book to member
        System.out.println("enter member id for hard copy book:");
        int memId1= input.nextInt();   // take member id input
        //assign this member to hard copy book
        hc.set_member_id(memId1); 
        
        // now assign book to member
        System.out.println("enter member id for audio copy book:");
        int memId2= input.nextInt();
        //assign this member to audio copy book
        oc.set_member_id(memId2);
 
       
        hc.printInfo();
        hc.print_page();
        
        oc.printInfo();
        oc.print_duration();
        
    } 
}
