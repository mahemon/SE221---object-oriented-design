package StudentCourseResult;
public class LabCourse extends Course{
    double labMarks;
    public void input_lab_exam(){
        System.out.println("Enter the lab exam marks: ");
        labMarks = in.nextDouble();
    }
    public double get_lab_totalMarks(){
        totalMarks = CM+MT+FI+labMarks;
        return totalMarks;
    }
}
