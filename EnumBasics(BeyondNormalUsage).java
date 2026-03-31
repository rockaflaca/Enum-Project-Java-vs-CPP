package enumProject;
import java.util.Scanner;
public class EnumBasics 
{
	
	public enum DayOfWeek 
	{
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a day of the week (in all caps):");
		String day = in.nextLine();
		in.close();
		
		System.out.println(DayOfWeek.valueOf(day));   //prints out the day entered by user input
		//IllegalArgumentException when selecting a day not defined in enum
	}

}


