package basicinheritance;
// subclass
public class Teacher extends Student{
    private String designation;
    private String research;
    
   public void input_designation(){
       System.out.println("Enter designation:");
       designation=input.nextLine();
   }
   public void set_designation(String designation){
    this.designation=designation;
   }
   public String get_designation(){
    return designation;
   }
    public void input_research(){
       System.out.println("Enter research:");
       research=input.nextLine();
   }
   public void set_research(String research){
    this.research=research;
   }
   public String get_research(){
    return research;
   }
    public void print_Teacher_info(){
       System.out.println("name: "+get_name());
       System.out.println("address: "+get_address());
       System.out.println("designation: "+designation);
       System.out.println("research: "+research);
   }
}
