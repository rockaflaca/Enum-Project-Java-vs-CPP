package enumProject;

import java.util.Scanner;

public class ExhaustiveControlFlow 
{

	public enum DayOfWeek 
	{
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, NOTADAY
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a day of the week (in all caps):");
		String day = in.nextLine();
		in.close();
		
		switch (DayOfWeek.valueOf(day))   //depending on day entered, a different sentence is printed
		{                                 //by using "->" instead of ":" the switch becomes exhaustive
			case MONDAY -> System.out.println("The chosen day is Monday");
			case TUESDAY -> System.out.println("The chosen day is Tuesday");
			case WEDNESDAY -> System.out.println("The chosen day is Wednesday");
			case THURSDAY -> System.out.println("The chosen day is Thursday");
			case FRIDAY -> System.out.println("The chosen day is Friday");
			case SATURDAY -> System.out.println("The chosen day is Saturday");
			case SUNDAY -> System.out.println("The chosen day is Sunday");
		}
       //adding unused cases does not cause program to not run, but selecting the unused case as your chosen day will not print anything
	}

}
