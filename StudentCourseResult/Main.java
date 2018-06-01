package StudentCourseResult;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
        int t,s,l; 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student number: ");
        s = in.nextInt();
        System.out.println("Enter theory course number: ");
        t = in.nextInt();
        System.out.println("Enter lab course number: ");
        l = in.nextInt();
        Student stu[]= new Student[s];
        for(int i=0;i<s;i++){
            stu[i] = new Student(l,t);
            System.out.println("input for student: "+(i+1));
            stu[i].input_student_basic_info();
            stu[i].lab_course_info_input();
            stu[i].theory_Course_info_input();
        }
        System.out.println("Student Info Print: ");
        for (int i = 0; i < t; i++) {
          stu[i].print_student_basic_info();
          stu[i].course_wise_marks();
      }
    }
}
