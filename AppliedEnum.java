
import java.util.Scanner;
public class AppliedEnum 
{
	public enum TrafficLights
	{
		RED("stop"), YELLOW("slow down"), GREEN("go");
		
		private String meaning;
		
		TrafficLights(String meaning)  //Constructor to create TrafficLights object
		{
			this.meaning = meaning;
		}

		public String getMeaning()  //obtain meaning of current TrafficLights object's color
		{
			return meaning;
		}
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please a valid traffic light color (in all caps):");
		String color = in.nextLine();
		in.close();
		
		try
		{
			TrafficLights currentLight = TrafficLights.valueOf(color);
			
			switch(currentLight)  //print what cars should do based on TrafficLights color
			{
				case GREEN -> System.out.println("Cars should " + currentLight.getMeaning());
				case YELLOW -> System.out.println("Cars should " + currentLight.getMeaning());
				case RED -> System.out.println("Cars should " + currentLight.getMeaning());
			}
		}
		catch (IllegalArgumentException e)  //catch invalid colors
		{
			System.out.println("Invalid Color Entered");
		}
	}
	
}
