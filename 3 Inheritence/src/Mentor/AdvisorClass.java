package Mentor;

public class AdvisorClass extends PersonClass{

	private int noOfStudents;
	
	public StudentClass student = new StudentClass();
	
	public AdvisorClass()
	{

	}
	
	/**
	 * Every time when this method is called then noOfStudent will increase by one.
	 * and checks if the total number of students exceed limit 40. 
	 * @return
	 */
	public boolean addStudent()
	{
		noOfStudents = noOfStudents + 1;
		if(noOfStudents <= 40)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public void displayAdvisorInfo()
	{
		System.out.println("Advisor id             : "+getId());
		System.out.println("Advisor name           : "+getName());
		System.out.println("Advisor contact number : "+getContactNumber());
	}
}
