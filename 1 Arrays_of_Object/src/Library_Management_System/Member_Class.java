package Library_Management_System;
import java.util.Scanner;
public class Member_Class {
	
	private String memberName;
	private String memberId;
	
	Scanner myscanner;
		
	public Member_Class()
	{
		myscanner = new Scanner(System.in);
	}
	
	public void InputAll()
	{
		System.out.println("Please enter member name");
		memberName = myscanner.next();
		System.out.println("Enter member id");
		memberId = myscanner.next();
	}
	
	public String getMemberName()
	{
		return memberName;
	}
	
	public String getMemberId()
	{
		return memberId;
	}
}