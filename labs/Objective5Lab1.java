//
// Objective 5 programs
// using if statements
//
//  Compare two numbers, `num1` and `num2`. Depending on what condition is true, we want different sections of code to execute. Use the Expected Output to guide you.
//  Create a class structure with the name `Objective5Lab1`.
//  Create a `main` method.
//  Declare and initialize two `int` variables, `num1` and `num2`, with appropriate values.

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective5Lab2
{
	public static void main(String[] args)
	{
		// now declaring variables 
		// initialize them to expected values
		int num1 = 5, num2 = 15;
		
		
		// printing out some blank lines before getting input
		System.out.println("\n\n");
		
		if (num1 > num2)
		{
			System.out.println("\n\tNumber 1 which is = " + num1 + " and is greater than the value for Number 2 which is = " + num2 + "\n\n");
		}
		else if (num2 > num1)
		{
			System.out.println("\n\tNumber 2 which is = " + num2 + " and is greater than the value for Number 1 which is = " + num1+ "\n\n");
		}
		else
		{
			System.out.println("\n\tNumber 1 " + num1 + " is equal to Number 2 " + num2 + "\n\n");
		}
		
	}
	
	
	
}
		
