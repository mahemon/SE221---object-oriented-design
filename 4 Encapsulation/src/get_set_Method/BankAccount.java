package get_set_Method;

public class BankAccount {

	private String holderName;
	private String nationalId;
	private String address;
	private String accountId;
	private double initialAmount;
	private double monthlyInterest;
	private double yearlyInterest;
	
	public void setHolderName(String holderName)
	{
		this.holderName = holderName;
	}
	
	public String getHolderName()
	{
		return holderName;
	}
	
	public void setNationalId(String nationalId)
	{
		this.nationalId = nationalId;
	}
	
	public String getNationalId()
	{
		return nationalId;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setBankAccountId(String accountId)
	{
		this.accountId = accountId;
	}
	
	public String getBankAccountId()
	{
		return accountId;
	}
	
	public void setInitialAmount(double initialAmount)
	{
		this.initialAmount = initialAmount;
	}
	
	public void depositMoney(double amount)
	{
		initialAmount += amount;
	}
	
	public void withdrawAmount(double amount)
	{
		if(initialAmount > 100 && initialAmount > amount)
		{
			initialAmount -= amount;
		}
		else
		{
			System.out.println("Sorry!! Insuffient balance");
		}
	}
	
	public void calculateMonthlyInterest()
	{
		if(initialAmount > 100000)
		{
			monthlyInterest = initialAmount * .02;
		}
		else
		{
			monthlyInterest = initialAmount * .01;
		}
	}
	
	public void calculateYearlyInterest()
	{
		yearlyInterest = monthlyInterest * 12;
	}
	
	public void displayAll()
	{
		System.out.println("Account holder name is  : "+holderName);
		System.out.println("Naitonal ID             : "+nationalId);
		System.out.println("Address                 : "+address);
		System.out.println("Account number          : "+accountId);
		System.out.println("Current amount          : "+initialAmount);
		System.out.println("Monthly interest        : "+monthlyInterest);
		System.out.println("Yearly interest         : "+yearlyInterest);
	}
}
