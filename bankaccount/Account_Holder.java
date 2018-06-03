package bankaccount;

import java.util.Scanner;

public class Account_Holder {
   private String Account_Holder_Name;
   private double balance;
   private double depositAmount;
   private double withdrawAmount;
   final double interestPercent=0.1;
   
   private double loanTaken;
   Scanner sc;
   
   public Account_Holder(){
       sc=new Scanner(System.in);
   }
   
   public void inputAll(){
       System.out.println("Enter Name :");
       Account_Holder_Name=sc.next();
       
       
       System.out.println("Enter Initial Balance :");
       balance=sc.nextDouble();
       
       depositAmount=0.0;
       withdrawAmount=0.0;
       loanTaken=0.0;
   }
   
   public void depositeInBalance(){
       System.out.println("Enter Deposit Amount :");
       depositAmount=sc.nextDouble();
       balance+=this.depositAmount;
   }
   
   public void withdrawFromBalance(double w){
       withdrawAmount+=w;
       if(balance>=w)
       {
           balance-=this.withdrawAmount;
       }
       else
       {
           System.out.println("Withdraw is not possible !!!");
       }
   }   
   
   public boolean isEligibleForLoan()
   {
       return balance>500.0;
   }
   
   public void inputLoan(double l){
       if(isEligibleForLoan()){
           loanTaken+=l;
       }
       else
       {
           System.out.println("Loan is not available !!!");
       }
   }
   
   public double calculateInterest(){
       return balance*interestPercent;
   }

    public double getBalance() {
        return balance;
    } 
}
