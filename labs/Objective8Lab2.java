//
// Objective 8 programs
// using for loops
//
// Create a file called Objective8Lab2.java in the SDPre/Labs directory. Using a for loop, write a program that sums up the numbers 1 to 20: 1 + 2 + 3 ... + 20.
// Create a class structure with the name Objective8Lab2.
// Create a main method.
// Create a variable to refer to the current sum total.
// Write a for loop.
// Increment the value of your control variable with each iteration.
// Update the current sum by adding your control variable to the sum with each iteration.

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective8Lab2
{
	public static void main(String[] args)
	{
		// now declaring an integer with the value of the user entered number default to 0
		int counter = 0;
		int sum = 0;
		
		// print a couple of blank lines before printing output
		System.out.println("\n\n");
		
		// the for loop that increase the value of the sum by adding the counter to it
		for (counter = 0; counter <= 20; counter++)
		{
			sum = sum + counter;
			// print statements used for debug purposes
			// System.out.println("the value of sum inside for loop is " + sum);
			// System.out.println("the value of counter is " + counter);
		}
		
		
		// printing out the value of the sum
		System.out.println("\n\n\tThe value of the sum should be = 210 the actual value of the sum is = " + sum + "\n\n");
		
	}	
	
}
		
