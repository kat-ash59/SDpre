//
// Objective 9 programs
// using methods
//
// Create a file called Objective9Lab4.java in the SDPre/Labs directory.
// Using the starter code below, add code to the commented areas that would:
// Take two numbers of type double and return the average.
// Print out the results.
// Hint: Make sure the return type of findAverage matches the data type of average.

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective9Lab4
{
	public static void main(String[] args)
	{
		
		// setup ability to read user input from the keyboard
		Scanner kb = new Scanner(System.in);
		
		// setup values for user input
		double num1 = 0.0, num2 = 0.0, average = 0.0;
				
		// print a couple of blank lines before printing output
		System.out.println("\n\n");
		System.out.println("===============================================================\n\n");

		
		// now going to ask the user to enter two numbers
		System.out.print("\n\n\tPlease give me a number ");
		num1 = kb.nextDouble();
		
		// now going to ask user for a second number
		System.out.print("\n\n\tPlease give me another number ");
		num2 = kb.nextDouble();
		
		// now going to call the method to compute the average
		average = findAverage(num1, num2);
		
		// now print out the average of the two numbers
		System.out.println("\n\tYou entered numbers " + num1 + " and " + num2 + "\n");
		System.out.println("\tThe average of the two numbers is " + average + "\n\n");
		
		kb.close();
		System.out.println("===============================================================\n\n");
	
		
		
	}	
	
	public static double findAverage(double dnum1, double dnum2)
	{
		double averagevalue = 0.0;
		
		return averagevalue = ((dnum1 + dnum2) / 2);
	}
	
}
		
