package StudentCourseResult;
import java.util.Scanner;
public class Student{
    
    String id,name;
    LabCourse lc[];   // array of labCourse Type
    TheoryCourse tc[]; // array of theoryCourse Type
    Scanner in = new Scanner(System.in);
    
    public Student(int labCourseNo, int theoryCourseNo){
      lc= new LabCourse[labCourseNo];
      tc= new TheoryCourse[theoryCourseNo];
    }
    public void input_student_basic_info(){
        System.out.println("Enter student id: ");
        id= in.next();
        System.out.println("Enter student name: ");
        name= in.next();
    }
    public void lab_course_info_input(){
      for(int i=0;i<lc.length;i++){
            lc[i] = new LabCourse();
            System.out.println("input for lab course: "+(i+1));
            lc[i].input_course_name();
            lc[i].input_course_code();
            lc[i].input_continuous_marks();
            lc[i].input_mid_term();
            lc[i].input_final();
            lc[i].input_lab_exam();
            lc[i].totalMarks=lc[i].get_lab_totalMarks();
            lc[i].gpa=get_gpa(lc[i].totalMarks);
        }
    }
    
     public void theory_Course_info_input(){
      for(int i=0;i<tc.length;i++){
            tc[i] = new TheoryCourse();
            System.out.println("input for theory course:"+(i+1));
            tc[i].input_course_name();
            tc[i].input_course_code();
            tc[i].input_continuous_marks();
            tc[i].input_mid_term();
            tc[i].input_final();
            tc[i].input_presentation_marks();
            tc[i].gpa=get_gpa(tc[i].get_theory_toralMarks());
        }
     }
   public void course_wise_marks(){
       System.out.println("Lab Course gpa: ");
       for (int i = 0; i < lc.length; i++) {
         lc[i].print_course_info();
         System.out.println("gpa:"+ lc[i].gpa);
       }
       
       System.out.println("Theory Course gpa: ");
        for (TheoryCourse tc1 : tc) {    // for each loop
            tc1.print_course_info();
            System.out.println("gpa:" + tc1.gpa);
        }
   }
   public double get_gpa(double totalMarks){
    if(totalMarks>=80)
          return 4.00;
      else if(totalMarks>=75)
          return 3.75;
       else if(totalMarks>=70)
          return 3.70;
       else if(totalMarks>=65)
          return 3.25;
       else if(totalMarks>=60)
          return 3.00;
       else if(totalMarks>=55)
          return 2.75;
       else if(totalMarks>=50)
          return 2.50;
       else if(totalMarks>=45)
          return 2.25;
       else if(totalMarks>=40)
          return 2.00;
       else 
           return 0.0;
    }
    public void print_student_basic_info(){
        System.out.println("Student id is: "+id);
        System.out.println("Student name is: "+name);
    }
}
