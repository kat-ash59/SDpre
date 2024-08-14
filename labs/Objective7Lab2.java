//
// Objective 7 programs
// using do while loops
//
// Create a file called Objective7Lab2.java in the SDPre/Labs directory.
// Using the starter code below, add code to the commented areas that would:
// Print the values 0 to 20.
// Print the value of counter with each iteration.
// Add 1 to counter each iteration so your loop doesn't run forever.
// Hint: If you get stuck in an infinite loop, press CTRL + C.


// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective7Lab2
{
	public static void main(String[] args)
	{
		// now declaring an integer with the value of the number 0
		int counter = 0;
		
		// printing out the counter from 1 to 20
		// using a do while loop
	
		
		while (counter <= 20)
		{
			System.out.println("\n\tThe value of counter = " + counter + "\n");
			counter = counter + 1;
		}
		
	
	}
	
	
	
}
		
