

import java.util.Scanner;

public class ExtendedBehavior 
{

	public enum DayOfWeek {
	    MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");
	    
	    private final String abbreviation;
	    
	    DayOfWeek(String abbreviation) {  //constructor for DayOfWeek, assigns abbreviation to respective days
	        this.abbreviation = abbreviation;
	    }
	    
	    public String getAbbreviation() {  //obtain a given DayOfWeek object's abbreviation
	        return abbreviation;
	    }
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a day of the week (in all caps):");
		String day = in.nextLine();
		in.close();
		
		//print a given day and its abbreviation
		System.out.println("The abbreviation for " + day + " is " + DayOfWeek.valueOf(day).getAbbreviation());

	}

}
