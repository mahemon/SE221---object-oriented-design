package bankaccount;
public class Main {
    public static void main(String[] args) {
    
     Account_Holder accObj=new Account_Holder();
     accObj.inputAll();
     double getAccAmount=accObj.getBalance();
     
     Account_Holder accObj2=new Account_Holder();
     accObj2.inputAll();
     double getAccAmount2=accObj2.getBalance();
     
     double totalAmount=getAccAmount+getAccAmount2;
     
     Manager objManager1=new Manager();
      System.out.println("Manager Salary Is :"+(objManager1.salaryCalculation(totalAmount)));
    }  
}
