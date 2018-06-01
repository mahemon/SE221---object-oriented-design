package StudentCourseResult;
public class TheoryCourse extends Course{
    double PR;
    public void input_presentation_marks(){
       System.out.println("Enter the presention marks: ");
       PR = in.nextDouble();
   }
    public double get_theory_toralMarks(){
        totalMarks = CM+MT+FI+PR;
        return totalMarks;
    }
}
