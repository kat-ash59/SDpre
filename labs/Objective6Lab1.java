//
// Objective 6 programs
// using switch statements
//
// Create a file called Objective6Lab1.java in the SDPre/Labs directory.
// Using the starter code below, add code to the commented areas that would:
// Given the month variable provided, write a switch statement that would print 
// the appropriate String value representation of the month: e.g. 6 -> June


// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective6Lab1
{
	public static void main(String[] args)
	{
		// now declaring an integer value for a month, defaulting to 6 or June
		int month = 6;
		
		// setting up variable to read from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		
		// printing out original value so we know our starting point
		System.out.println("\n\n\n\tThe original numeric value for the month is defaulted to " + month + "\n\n");
		
		
		// have the user enter a number number representing a month
		// so we can later convert it to a named month
		System.out.print("\tPlease enter a numeric value for a month (1 - 12) ");
		month = keyboard.nextInt();
		
		
		
		if (month < 1 || month > 12)
		{
			System.out.print("\n\tPlease enter a number between 1 and 12  ");
			month = keyboard.nextInt();
		}
		
		// setup the case statements to test for the month determination from number to string
		switch (month)
		{
			case 1:
				System.out.println("\n\tYou entered 1 for January\n\n");
				break;
			case 2:
				System.out.println("\n\tYou entered 2 for February\n\n");
				break;
			case 3:
				System.out.println("\n\tYou entered 3 for March\n\n");
				break;
			case 4:
				System.out.println("\n\tYou entered 4 for April\n\n");
				break;
			case 5:
				System.out.println("\n\tYou entered 5 for May\n\n");
				break;
			case 6:
				System.out.println("\n\tYou entered 6 for June\n\n");
				break;
			case 7:
				System.out.println("\n\tYou entered 7 for July\n\n");
				break;
			case 8:
				System.out.println("\n\tYou entered 8 for August\n\n");
				break;
			case 9:
				System.out.println("\n\tYou entered 9 for September\n\n");
				break;
			case 10:
				System.out.println("\n\tYou entered 10 for October\n\n");
				break;
			case 11:
				System.out.println("\n\tYou entered 11 for November\n\n");
				break;
			case 12:
				System.out.println("\n\tYou entered 12 for December\n\n");
				break;
			default:
				System.out.println("\n\tThat is not a valid month\n\n");
				break;
		}
		
		// close out the scanner		
		keyboard.close();
	}
	
	
	
}
		
