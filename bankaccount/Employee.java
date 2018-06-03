package bankaccount;

import java.util.Scanner;

public class Employee {
    private String employeeName;
    private String employeeAge;
    final double fixedSalary=8000.0;
    private double eidBonus;
    public double honorableBonus;
    public double salary;
    Scanner input;
    
    public Employee(){
        input=new Scanner(System.in);
    }
    
    public void inputAll(){
        System.out.println("Manager Name :");
        employeeName=input.next();
        System.out.println("Manager age :");
        employeeAge=input.next();
        eidBonus=0.0;
        honorableBonus=0.0;
        salary=0.0;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }
}
