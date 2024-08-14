//
// Objective 8 programs
// using for loops
//
//Create a file called Objective8Lab3.java in the SDPre/Labs directory.
// Using the starter code below, add code to the commented areas that would:
// Print out the numbers from 1 to 20 while also stating whether the number is odd or even.
// Write a for loop.
// Declare and initialize your control variable to 1.
// Add a conditional statement to make the loop execute 20 times.
// Increment your control variable with each iteration.
// Write your for loop body
// Write an if statement that determines whether the number is even or odd. Think % operator.
// Print out counter is even or  is odd accordingly.
// Increment the value of counter with each iteration.
// e.g.
//   1 is odd
//   2 is even
//   3 is odd
//   4 is even
//   ...
//   20 is even

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective8Lab3
{
	public static void main(String[] args)
	{
		// now declaring an integer with the value of 1
		int counter = 1;
				
		// print a couple of blank lines before printing output
		System.out.println("\n\n");
		
		// the for loop that increase the value of the counter by 1 and printing out if it is even or odd
		for (counter = 1; counter <= 20; counter++)
		{
			
			// next determine if odd or even and print out number and if odd or even
			if ((counter % 2) == 0)
			{
				System.out.println("\tThe number " + counter + " is even\n");
			}
			else
			{
				System.out.println("\tThe number " + counter + " is odd\n");
			}
			
		}
		
		
		// printing out a few more blank lines at the end of the program
		System.out.println("\n\n");
		
	}	
	
}
		
