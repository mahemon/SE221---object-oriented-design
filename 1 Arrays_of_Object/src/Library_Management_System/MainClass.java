package Library_Management_System;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Which type of book?[audio/hard]");
		String type = myscanner.nextLine();
		
		if(type.equalsIgnoreCase("audio"))
		{
			System.out.println("How many books do you want?");
			int amountOfbooks = myscanner.nextInt();
			Audio_Copy[] ac = new Audio_Copy[amountOfbooks];
			
			for(int i=0; i<amountOfbooks; i++)
			{
				ac[i] = new Audio_Copy();
				ac[i].inputAll();
				ac[i].input_audio_duration();
			}
			
			for(int j=0; j<ac.length; j++)
			{
				ac[j].display_All_Info_About_Audio_Type_Book();
				System.out.println();
			}
			
			while(true)
			{
				System.out.println("Enter book id to borrow");
				int idToBorrow = myscanner.nextInt();
				if(ac[idToBorrow].getBook_borrower_id().equals("0"))
				{
					Member_Class member = new Member_Class();
					member.InputAll();
					ac[idToBorrow].setNewMemberIdForABook();
				}
				else
				{
					System.out.println("Sorry!! your requested book is currently unavailable ");
				}
				
				System.out.println("Want another audio book?[yes/no]");
				String choice = myscanner.next();
				if(choice.contains("n"))
				{
					break;
				}
			}
		}
		else
		{
			System.out.println("How many books do you want?");
			int amountOfbooks = myscanner.nextInt();
			Hard_Copy[] hc = new Hard_Copy[amountOfbooks];
			
			for(int i=0; i<amountOfbooks; i++)
			{
				hc[i] = new Hard_Copy();
				hc[i].inputAll();
				hc[i].inputNumberOfPages();
				hc[i].display_All_Info_About_HardCopy_Type_Book();
			}
			System.out.println("Enter book id to borrow");
			int idToBorrow = myscanner.nextInt();
			if(hc[idToBorrow-1].getBook_borrower_id().equals("0"))
			{
				Member_Class member = new Member_Class();
				member.InputAll();
				hc[idToBorrow-1].setNewMemberIdForABook();
			}
			else
			{
				System.out.println("Sorry!! your requested book is currently unavailable ");
			}
		}
		myscanner.close();
	}

}