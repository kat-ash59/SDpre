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

public class Objective9Lab5
{
	public static void main(String[] args)
	{
		
		// setup ability to read user input from the keyboard
		Scanner kb = new Scanner(System.in);
		
		// setup values for user input
		double num1 = 0.0, num2 = 0.0, averagevalue = 0.0, additionvalue = 0.0, taxvalue = 0.0;
		
		// setup value for menu choice
		int choice = 0;
		
		// setup value if you want to keep going
		boolean keepGoing = true;
		
				
		// print a couple of blank lines before printing output
		System.out.println("\n\n");
		System.out.println("===============================================================\n\n");
		
		// going to make sure user enters a number
		System.out.print("\n\n\tPlease give me a number ");
		while (!kb.hasNextDouble())
		{	
			// now going to ask the user to enter two numbers
		
			kb.next();
			System.out.print("\tPlease enter a number ");
		}
		num1 = kb.nextDouble();
			
		// now going to ask user for a second number
		System.out.print("\n\n\tPlease give me another number ");
		while (!kb.hasNextDouble())
		{	
			// now going to ask the user to enter two numbers
		
			kb.next();
			System.out.print("\tPlease enter a number ");
		}
		num2 = kb.nextDouble();
		
		// now going to print the menu and ask for what the user wants to do
		printMenu();
		while (!kb.hasNextDouble())
		{	
			// now going to ask the user to enter two numbers
		
			kb.next();
			System.out.print("\tPlease enter a valid menu option 1, 2, 3, or 4    ");
		}
		choice = kb.nextInt();

		while (keepGoing)
		{
			System.out.println("\n\tYou entered " + choice + " as your menu option\n");			
			switch (choice)
			{
				case 1:
				{
						System.out.println("\tYou selected to add the two numbers " + num1 + " and " + num2);
						additionvalue = addTwoNumbers(num1, num2);
						System.out.println("\tThe value of the two numbers added together is " + additionvalue + "\n\n");
						break;
				}
				case 2:
				{
					System.out.println("\tYou selected to find the average of the two numbers " + num1 + " " + num2);
					averagevalue = findAverage(num1, num2);
					System.out.println("\tThe value for the average of the two numbers is " + averagevalue + "\n\n");
					break;
					
				}
				case 3:
				{
					System.out.println("\tYou selected to calculate the tax on the value of the two numbers\n");
					taxvalue = calculateTax(num1, num2);
					System.out.println("\tThe value for the tax on the two numbers is " + taxvalue + "\n\n");
					System.out.println("\tThe total value of the bill will be " + (num1 + num2 + taxvalue) + "\n");
					break;
				}
				case 4:
				{
					System.out.println("\tAnd the answer is: Good Bye!\n");
					keepGoing = false;
					kb.close();
					System.out.println("\n\n\n");
					System.exit(0);
				}
				default:
				{
					System.out.println("\tHey silly goose please enter 1, 2, 3, or 4\n");
					break;
				}
			}
				
			// now going to print the menu again and ask for another choice
			printMenu();
			choice = kb.nextInt();
			System.out.println("\n\n");
			
			
		}
		kb.close();
							
	}

	public static void printMenu()
	{
		System.out.println("===============================================================");
		System.out.println("\n\n\tPlease enter your choice\n");
		System.out.println("\t_____Menu_____\n");
		System.out.println("\t1: Add Numbers\n");
		System.out.println("\t2: Find the Average\n");
		System.out.println("\t3: Calculate tax\n");
		System.out.println("\t4: Exit\n");
		System.out.print("\tEnter your choice : ");
	}
		
	
	public static double findAverage(double dnum1, double dnum2)
	{
		double averagevalue = 0.0;
		
		return averagevalue = ((dnum1 + dnum2) / 2);
	}
	
	public static double addTwoNumbers(double dnum1, double dnum2)
	{
		double addvalue = 0.0;
		
		return addvalue = dnum1 + dnum2;
	}
	
	public static double calculateTax(double dnum1, double dnum2)
	{
		// going to assume tax is the rate here in Boulder Colorado which is 3.86%
		double taxvalue;
		System.out.println("\n\tThe sales tax for Boulder, Colorado is 3.86%\n");
		taxvalue = ((dnum1 + dnum2) * .036);
		return taxvalue;
	}
	
}
		
