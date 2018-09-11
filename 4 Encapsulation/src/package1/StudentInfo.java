package package1;

public class StudentInfo {

	public static String studentId;
    String studentName;
	private String studentNumber;
	public String studentBatch;
	
	public void setStudentNumber(String number)
	{
		studentNumber = number;
	}
	
	
	public void displayStudentInfo()
	{
		System.out.println("Student id : "+studentId);
		System.out.println("Student name : "+studentName);
		System.out.println("Student number : "+studentNumber);
		System.out.println("Student batch : "+studentBatch);
	}
}
