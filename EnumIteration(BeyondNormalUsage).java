package enumProject;
import java.util.Arrays;
public class EnumIteration 
{

	public enum DayOfWeek 
	{
	    MONDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args)
	{
		DayOfWeek[] days = DayOfWeek.values();   //creates an array containing each value defined in enum
		System.out.println(Arrays.toString(days));
		//NoSuchMethod error when attempting to run program with two identical enum values 
	}
}
