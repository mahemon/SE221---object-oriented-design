package arrayofobjects;

import java.util.Scanner;

public class Student {
   private String Id;
   private String name;
   private double cgpa;
   private Scanner input;
   public Student(){
    input= new Scanner(System.in);
   }
   public void input_Id(){
       System.out.println("Enter Id:");
       Id=input.nextLine();
   }
   public void set_Id(String Id){
    this.Id=Id;
   }
   public String get_Id(){
    return Id;
   }
   public void input_name(){
       System.out.println("Enter name:");
       name=input.nextLine();
   }
   public void set_name(String name){
    this.name=name;
   }
   public String get_name(){
    return name;
   }
   public void input_cgpa(){
       System.out.println("Enter cgpa:");
       cgpa=input.nextDouble();
   }
   public void set_cgpa(double cgpa){
    this.cgpa=cgpa;
   }
   public double get_cgpa(){
    return cgpa;
   }
   public void print_info(){
       System.out.println("Id: "+Id);
       System.out.println("name: "+name);
       System.out.println("cgpa: "+cgpa);
   }
}
