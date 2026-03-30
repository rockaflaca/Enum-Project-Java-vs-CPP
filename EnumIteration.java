
import java.util.Arrays;
public class EnumIteration 
{

	public enum DayOfWeek 
	{
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args)
	{
		DayOfWeek[] days = DayOfWeek.values();  //creates an array containing each value in DayOfWeek enum
		System.out.println(Arrays.toString(days));
	}
}
