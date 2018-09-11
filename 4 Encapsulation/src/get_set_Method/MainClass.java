package get_set_Method;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner myscanner = new Scanner(System.in);
		BankAccount bankaccount = new BankAccount();
		
		System.out.println("Enter account holder name");
		bankaccount.setHolderName(myscanner.next());
		System.out.println("Enter account holder national id");
		bankaccount.setNationalId(myscanner.next());
		System.out.println("Enter address");
		myscanner.nextLine();
		bankaccount.setAddress(myscanner.nextLine());
		System.out.println("Enter initial amount");
		bankaccount.setInitialAmount(myscanner.nextDouble());
		
		System.out.println("How much do you want to deposit?");
		bankaccount.depositMoney(myscanner.nextDouble());
		System.out.println("How much do you want to withdraw?");
		bankaccount.withdrawAmount(myscanner.nextDouble());
		
		bankaccount.calculateMonthlyInterest();
		bankaccount.calculateYearlyInterest();
		bankaccount.displayAll();
		
		myscanner.close();
	}

}
