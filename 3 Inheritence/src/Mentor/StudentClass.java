package Mentor;

public class StudentClass extends PersonClass{

	private int absent_days;
	private double cgpa;
	private double payableMoney;
	private double paidMoney;
	
	public StudentClass()
	{
		
	}
	
	public void inputStudetAdditionalAttrubute()
	{
		System.out.print("Enter absent days       : ");
		absent_days = myscanner.nextInt();
		System.out.print("Enter cgpa              : ");
		cgpa = myscanner.nextDouble();
		System.out.print("Enter payable money     : ");
		payableMoney = myscanner.nextDouble();
		System.out.print("Enter paid money        : ");
		paidMoney = myscanner.nextDouble();
	}
	
	public int getAbsentDays()
	{
		return absent_days;
	}
	
	public double getCGPA()
	{
		return cgpa;
	}
	
	public double showDue()
	{
		return payableMoney - paidMoney;
	}
}
