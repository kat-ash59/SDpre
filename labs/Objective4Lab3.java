//
// Objective 4 programs
// using input
//

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective4Lab3
{
	public static void main(String[] args)
	{
		// setting up variable to read from the keyboard
		
		Scanner keyboard = new Scanner(System.in);
		
		
	
			
		// now declaring variables that will be assigned by input from the keyboard 
		int birthYear, age, currentYear;
		
		// setting birth year to 0
		birthYear = 0;
		
	
	
	    // set the value for the current year here
		currentYear = Year.now().getValue();
		
		// printing out some blank lines before getting input
		System.out.println("\n\n");
	
		
		//
		// will start getting input here
		//
		System.out.print("Please enter your age ");
		age = keyboard.nextInt();
		
		
		birthYear = currentYear - age;
		
		System.out.println("\n\nYou were born in " + birthYear + "\n\n\n");

	}
	
}
		
