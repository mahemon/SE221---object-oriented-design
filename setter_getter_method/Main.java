package setter_getter_method;
public class Main_1 {
  public static void main(String[] args) {
     Student std1= new Student(); // create reference
     std1.input_Id(); //take input from user
     std1.input_name();
     std1.input_cgpa();
     
     std1.set_Id("172"); // setter method to assign value
     std1.set_name("saad");
     std1.set_cgpa(3.78);
     
     String id=std1.get_Id(); // getter method to get value
     String name= std1.get_name();
     double cg= std1.get_cgpa();
    
     std1.print_info(); // print information
  } 
}
