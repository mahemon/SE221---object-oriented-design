package basicinheritance;
public class Main {
public static void main(String[] args) {
    
    Student std1 = new Student();
    std1.input_Id();
    std1.input_name();
    std1.input_cgpa();
    std1.input_address();
    
    std1.print_student_info();
    
    Teacher te1 = new Teacher();
    te1.input_name();
    te1.input_address();
    te1.input_designation();
    te1.input_research();
    
    te1.print_Teacher_info();
    
  }  
}
