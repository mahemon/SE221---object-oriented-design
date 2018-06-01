
package StudentCourseResult;
import java.util.Scanner;
public class Course{
    double CM,MT,FI;
    double totalMarks,gpa;
    String courseCode, courseName;
    Scanner in = new Scanner(System.in);
    public void input_continuous_marks(){
        System.out.println("Enter the continous_assinment : ");
        CM=in.nextDouble();
    }
    public void input_course_name(){
        System.out.println("Enter Course Name:");
        courseName=in.nextLine();
    }
    public void input_course_code(){
        System.out.println("Enter Course code:");
        courseCode=in.nextLine();
    }
    public void input_mid_term(){
        System.out.println("Enter the mid_tream: ");
        MT=in.nextDouble();
    }
    public void input_final(){
        System.out.println("Enter the final: ");
        FI=in.nextDouble();
    }
    
    public void print_course_info(){
        System.out.println("course name: "+courseName);
        System.out.println("course code: "+courseCode);
    } 
}
