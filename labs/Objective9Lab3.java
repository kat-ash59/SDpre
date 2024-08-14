//
// Objective 9 programs
// using methods
//
// Create a file called Objective9Lab3.java in the SDPre/Labs directory.
// Write code in the commented areas of the while loop in the starter code that would print out the menu with the provided printMenu() method.
// // Take a user's input
// Depending on the user's choice, print out the correct message
// Look back at your logic from Objective7Lab5

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective9Lab3
{
	public static void main(String[] args)
	{
		
		// setup ability to read user input from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// setup value for user input
		int selection = 0;
				
		// print a couple of blank lines before printing output
		System.out.println("\n\n");
		
		System.out.println("\tPrinting from inside main\n");
		
		// now going to call the method to print out the menu
		printMenu();
		
		while (true)
		{
			selection = keyboard.nextInt();
			System.out.println("\n\tYou entered " + selection);			
			if (selection == 1)
			{
					System.out.println("\tAnd the answer is: Hello Human!\n");
			}
			else if (selection == 2)
			{
				System.out.println("\tAnd the answer is: Apple, Banana, Coconut\n");
			}
			else if (selection == 3)
			{
					System.out.println("\tAnd the answer is: Good Bye!\n");
					break;
			}
			else
			{
				System.out.println("\tHey silly goose please enter 1, 2, or 3\n");
			}
			
			printMenu();
		}
		
		keyboard.close();
		System.out.println("===============================================================\n\n");
	
		
		
	}	
	
	public static void printMenu()
	{
		System.out.println("===============================================================");
		System.out.println("\n\n\tPlease enter your choice\n");
		System.out.println("\t_____Menu_____\n");
		System.out.println("\t1: Say Hello\n");
		System.out.println("\t2: List My favorite foods\n");
		System.out.println("\t3: Exit\n");
		System.out.print("\tEnter your choice : ");
	}
	
}
		
