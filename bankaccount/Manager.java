package bankaccount;

public class Manager extends Employee{
    final Double bonusRate=0.07;
    public double salaryCalculation(double allAccountAmount){
        salary+=fixedSalary+(allAccountAmount*bonusRate)+honorableBonus;
        return salary;
    }
}
