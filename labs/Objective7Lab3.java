//
// Objective 7 programs
// using do while loops
//
// Create a file called Objective7Lab3.java in the SDPre/Labs directory.
// Using the starter code below, add code to the commented areas that would:
// Print out the numbers 1 to 20, while also printing whether the number is odd or even.
// Write a while loop.
// Use the provided counter variable to have the loop execute 20 times.
// Write an if statement that determines if the number is even or odd. (Think % operator.)
// Print out counter is even or  is odd accordingly.
// Increment the value of counter with each iteration.


// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective7Lab3
{
	public static void main(String[] args)
	{
		// now declaring an integer with the value of the number 0
		int counter = 0;
		
		// printing out the counter from 1 to 20
		// using a do while loop
	
		
		while (counter <= 20)
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
			
			counter = counter + 1;
		}
		
	
	}
	
	
	
}
		
