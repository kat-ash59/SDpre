//
// Objective 5 programs
// using if statements
//
// Create a file called _Objective5Lab3.java_ in the _SDPre/Labs_ directory.
// Using the starter code below, add code to the commented area that would:
// Take in a number from the user.
// Determine if the number is greater than, less than, or equal to 0.
// Print the findings.


// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective5Lab3
{
	public static void main(String[] args)
	{
		// now declaring variable for a user number (needs to be an integer)
		// initialize it to 0
		int userNum = 0;
		
		// setting up variable to read from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		
		// printing out original value so we know our starting point
		System.out.println("\n\n\n\tThe original number is defaulted to " + userNum + "\n\n");
		
		
		// have the user enter a number, can be negative, 0 or greater than 0
		System.out.print("\tPlease enter your number, it can be less than 0, 0 or greater than 0      ");
		userNum = keyboard.nextInt();
		
		
		
		if (userNum == 0)
		{
			System.out.println("\n\tYour number is equal to zero, your number was " + userNum + "\n\n");
		}
		else if (userNum < 0)
		{
			System.out.println("\n\tYour number is less than zero, your number was " + userNum + "\n\n");
		}
		else
		{
			System.out.println("\n\tYour number is greater than zero, your number was " + userNum + "\n\n");
		}
	
		keyboard.close();
	}
	
	
	
}
		
