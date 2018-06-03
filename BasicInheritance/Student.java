package basicinheritance;

// subclass
public class Student extends Person{
   private String Id;
   private double cgpa;
   
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
   public void print_student_info(){
       System.out.println("Id: "+Id);
       System.out.println("name: "+get_name());
       System.out.println("address: "+get_address());
       System.out.println("cgpa: "+cgpa);
   }
}
