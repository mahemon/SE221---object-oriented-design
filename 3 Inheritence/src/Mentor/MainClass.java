package Mentor;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("How many advisor? ");
		int noOfAdvisor = myscanner.nextInt();
		// making advisor class array
		AdvisorClass advisor[] = new AdvisorClass[noOfAdvisor];
		
		// getting advisors
		for(int i=0; i<noOfAdvisor; i++)
		{
			System.out.println("------ Input Advisor -----");
			advisor[i] = new AdvisorClass();
			advisor[i].inputPersonInfo();
		}
		
		// printing advisor info
		System.out.println("\n------ Advisor info ------");
		for(int i=0; i<advisor.length; i++)
		{
			advisor[i].displayAdvisorInfo();
			System.out.println("-------");
		}
		
		while(true)
		{
			
			
			System.out.print("Enter advisor id to add student   : ");
			int adId = myscanner.nextInt();
			int flag = 0, flag2 =0, flag3 = 0;
			
			// initializing student class to null for later use.
			StudentClass student[] = null;
			
			for(int l=0; l<advisor.length; l++)
			{
				//if advisor id is matched with the advisor class array then do follow.
				if(adId == (advisor[l].getId()))
				{
					// if the advisor is found then set advisor id.
					adId = l;
					// if not found then go to line 76.
					flag = 1; 
					System.out.println("How many students to add?  ");
					int noOfStudents = myscanner.nextInt();
					
					if(noOfAdvisor > 40)
					{
						System.out.println("Students number must not exceeds 40.");
					}
					else
					{
						student = new StudentClass[noOfStudents];
						for(int j=0; j<noOfStudents; j++)
						{
							// adding student to certain advisor... this is used to measure the current number of students under that advisor 
							if(advisor[adId].addStudent())
							{
								// if student number exceeds limit 40 then go to line 68.
								flag2 =1;  
								student[j] = new StudentClass();
								student[j].inputPersonInfo();
								student[j].inputStudetAdditionalAttrubute();
							}
						}
						if(flag2 == 0)
						{
							System.out.println("Student limit exceeds");
						}
					} 
				}
			}
			
			if(flag == 0)
			{
				System.out.println("Advisor not found.");
			}
			
			// to get the absent student, total due, and low cgpa of the respected advisor.
			System.out.println("Enter advisor id to check id and name of absent student , due, low cgpa");
			int adId2 = myscanner.nextInt();
			for(int h=0; h<advisor.length; h++)
			{
				if(adId2 == advisor[h].getId())
				{
					flag3 = 1; // if advisor not found then go to line 112
					for(int g=0; g<student.length; g++)
					{
						// absent student list
						if(student[g].getAbsentDays() > 10)
						{
							System.out.println("Absent student id    : "+student[g].getId());
							System.out.println("Absent student name  : "+student[g].getName());
						}
						
						// due of a student
						System.out.println("Student id     : "+student[g].getId());
						System.out.println("Total due      : "+student[g].showDue());
						
						// low cgpa
						if(student[g].getCGPA() < 3)
						{
							System.out.println("Student id     : "+student[g].getId());
							System.out.println("Obtained cgpa  : "+student[g].getCGPA());
						}
						System.out.println();
					}
				}
			}
			if(flag3 == 0)
			{
				System.out.println("Advisor not found under the advisor id "+  adId2);
			}
			
			// for another trip in the code.
			System.out.println("Do you wish to break the loop??? [y/n]");
			String choice = myscanner.next();
			if(choice.contains("y"))
			{
				break;
			}
		}
		myscanner.close();
	}
}
