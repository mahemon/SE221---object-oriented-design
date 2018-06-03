package superShop;
public class Shop {
    int id;
    String name;
    double salary;
    double m_salary;
    double bonus;
    public Shop(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    
    public double calculateMonthlySalary(double day){
        return m_salary=day*300;
    }
    public double calculateBonusSalary(double quantity){
        if(quantity>100){
            bonus= m_salary+500.0;
            return bonus;
        }
        else  
        return m_salary;
    }
    public void display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
    }
}
