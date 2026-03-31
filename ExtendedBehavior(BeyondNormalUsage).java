package enumProject;

import java.util.Scanner;

public class ExtendedBehavior 
{

	public enum DayOfWeek {
	    MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY;
	    
	    private final String abbreviation;
	    
	    DayOfWeek(String abbreviation) {     //constructor to create a DayOfWeek object, and assign its abbreviation
	        this.abbreviation = abbreviation;
	    }
	    
	    public String getAbbreviation() {   //allows access to the abbreviation of a given DayOfWeek object
	        return abbreviation;
	    }
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a day of the week (in all caps):");
		String day = in.nextLine();
		in.close();
		
		System.out.println("The abbreviation for " + day + " is " + DayOfWeek.valueOf(day).getAbbreviation());
        //NoSuchMethod error when an enum value is missing its abbreviation field
	}

}
