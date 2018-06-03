package arrayofobjects;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      System.out.println("Number of Student: ");
      int n= input.nextInt();
      // create array of objects/references
      // int a[] = new int[n];
      // here Student used as a data types
      Student std[] = new Student[n];
      
      for (int i = 0; i < n; i++) {
          std[i].input_Id(); //take input from user
          std[i].input_name();
          std[i].input_cgpa();
      }
      
      for (int i = 0; i < n; i++) {
          std[i].set_Id("172");//take input from user
          std[i].set_name("saad");
          std[i].set_cgpa(3.78);
      }
     
      for (int i = 0; i < n; i++) {
           String id=std[i].get_Id(); // getter method to get value
           String name= std[i].get_name();
           double cg= std[i].get_cgpa();
      }
      
      for (int i = 0; i < n; i++) {
          std[i].print_info();      }
  } 
}
