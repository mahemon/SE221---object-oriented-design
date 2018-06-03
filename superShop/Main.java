package superShop;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
        System.out.println("id: ");
        int id=input.nextInt();
        System.out.println("name: ");
        String name= input.next();
        System.out.println("salary: ");
        double salary=input.nextDouble();
        
        Shop myShop = new Shop(id, name, salary);
        System.out.println("how many days you work: ");
        double d=input.nextDouble();
        double totalSalary= myShop.calculateMonthlySalary(d);
        
        System.out.println("how many product you sell: ");
        double p=input.nextDouble();
        double totalAmonut=myShop.calculateBonusSalary(p);
        myShop.display();
        System.out.println("total monthly salary: "+totalSalary);
        System.out.println("total monthly salary with bonus: "+totalAmonut);
        
    }  
}
