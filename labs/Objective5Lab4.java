//
// Objective 5 programs
// using if statements
//
// Create a file called Objective5Lab4.java in the SDPre/Labs directory.
// Create a class structure with the name Objective5Lab4.
// Create a main method.
// Create a Scanner.
// Take in a number and assign it to a variable.
// Determine if the number is even or odd.
// Hint: The modulus operator % returns a value based on the remainder after division 
// of one number by another. For example 8 % 4 would return 0, while 9 % 2 would return 1. 
// What would you need to test for to determine if a number is even or odd?


// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective5Lab4
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
		
		
		// have the user enter a number, so we can determine if odd or even
		System.out.print("\tPlease enter your number and the program will determin if it is odd or even      ");
		userNum = keyboard.nextInt();
		
		
		
		if ((userNum % 2) == 0)
		{
			System.out.println("\n\tYour number is even " + userNum + "\n\n");
		}
		else
		{
			System.out.println("\n\tYour number is odd " + userNum + "\n\n");
		}
	
		keyboard.close();
	}
	
	
	
}
		
