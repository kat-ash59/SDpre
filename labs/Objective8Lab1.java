//
// Objective 8 programs
// using for loops
//
//Create a file called Objective8Lab1.java in the SDPre/Labs directory.
// Using the starter code below, add code to the commented areas that would:
// Write a for loop that will print the numbers 1 to 10.
// Write another for loop that will print the numbers 10 to 1.

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective8Lab1
{
	public static void main(String[] args)
	{
		// now declaring an integer with the value of the user entered number default to 0
		int counter = 0;
		
		
		// print a couple of blank lines before printing output
		System.out.println("\n\n");
		
		// the for loop that and print out the value of the increasing counter
		for (counter = 0; counter <= 10; counter++)
		{
			System.out.println("\n\tYour counter increasing in the for loop. Counter = " + counter);
		}
		
		// print a couple of blank lines before printing output
		System.out.println("\n\n");

		// the for loop that and print out the value of the decreasing counter
		for (counter = 10; counter >= 0; counter--)
		{
			System.out.println("\n\tYour counter decreasing in the for loop. Counter = " + counter);
		}		
		
		// printing out a few more blank lines
		System.out.println("\n\n");
		
	}	
	
}
		
