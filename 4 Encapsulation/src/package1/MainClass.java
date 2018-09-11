package package1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		
		StudentInfo sInfo = new StudentInfo();
		System.out.println("Enter student id ");
		// static variable can be accessed by the following way.
		// but anyone can also access static variable using object like sInfo.studentId
		StudentInfo.studentId = myscanner.next();
		
		System.out.println("Enter student name");
		sInfo.studentName = myscanner.next();
		System.out.println("Enter student phone number");
		
		//sInfo.studentNumber = myscanner.next();
		
		/**
		 * This is not possible. Because private modifier doesn't allow to get access on that 
		 * variable other than the same class. It means it is not possible to use studentNumber variable
		 * here. so to use a private variable we make a public method. 
		 */
		String number = myscanner.next();
		sInfo.setStudentNumber(number);
		System.out.println("Enter student batch ");
		sInfo.studentBatch = myscanner.next();
		
		sInfo.displayStudentInfo();
		
		myscanner.close();
	}
}
