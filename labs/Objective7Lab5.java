//
// Objective 7 programs
// using do while loops
//
// Create a file called Objective7Lab5.java in the SDPre/Labs directory. 
// The following code simulates a menu system.
// Using the starter code below, add code to the commented areas that would:
// Inside of the endless loop, write if statements to determine if 1, 2, or 3 was selected.
// If 1 was entered, print Hello World.
// If 2 was entered, print a String of your favorite foods: Apple, Banana, Coconut.
// If 3 was entered, break the loop.

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective7Lab5
{
	public static void main(String[] args)
	{
		// now declaring an integer with the value of the user entered number default to 0
		int selection = 0;
		
		// setup reading from the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// simulating a menu entry where user inputs values from 1 to 3
		// using a do while loop
		while (true)
		{
			System.out.println("===============================================================");
			System.out.println("\n\n\tPlease enter your choice\n");
			System.out.println("\t_____Menu_____\n");
			System.out.println("\t1: Say Hello\n");
			System.out.println("\t2: List My favorite foods\n");
			System.out.println("\t3: Exit\n");
			System.out.print("\tEnter your choice : ");
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
			
		System.out.println("===============================================================");
			
			
		}

		keyboard.close();		
		
	}	
	
}
		
