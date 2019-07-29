
package lms;
import java.util.Scanner;

public class Member {
    Scanner in = new Scanner(System.in);
    protected int M_id;
    protected String Name;

    protected void input_memberInfo(){
        System.out.println("Enter the member id: ");
        M_id = in.nextInt();
        
        in.nextLine();
        System.out.println("Enter the member name : ");
        M_id = in.nextInt();
    }
   
    protected void printMemberInfo(){
        System.out.println("Member id is: "+M_id);
        System.out.println("Member name is: "+Name);
    }
}
