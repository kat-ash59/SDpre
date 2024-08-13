//
// Objective 4 programs
// using input
//

// need to be able to use import to get input variables
import java.util.Scanner;

public class Objective4Lab2
{
	public static void main(String[] args)
	{
		// setting up variable to read from the keyboard
		
		Scanner keyboard = new Scanner(System.in);
	
			
		// now declaring variables that will be assigned by input from the keyboard and initializing them to null values 
		int num1 = 0, num2 = 0, num3 = 0;
		
		double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;
		
		// going to printout the initial values which will appear as blanks
		
		System.out.println("\n\n");
		System.out.println("\tprinting out the inital values for intergers num1, num2, num3 and doubles dub1, dub2, dub3\n");
		System.out.println("\tthe inital value for integer num1 is = " + num1 + "\n");
		System.out.println("\tthe inital value for integer num2 is = " + num2 + "\n");
		System.out.println("\tthe inital value for integer num3 is = " + num3 + "\n");
		System.out.println("\tthe inital value for double dub1 is = " + dub1 + "\n");
		System.out.println("\tthe inital value for double dub2 is = " + dub2 + "\n");
		System.out.println("\tthe inital value for double dub3 is = " + dub3 + "\n");
		System.out.println("\tnow I will ask you to fill in the values\n\n");
		//
		// will start getting input here
		//
		System.out.print("Please enter your choice for the first integer ");
		num1 = keyboard.nextInt();
		System.out.print("Please enter your choice for the second integer  ");
		num2 = keyboard.nextInt();
		System.out.print("Please enter your choice for the third integer  ");
		num3 = keyboard.nextInt();
		System.out.println("\n\n");
		System.out.print("Please enter your choice for the first double ");
		dub1 = keyboard.nextDouble();
		System.out.print("Please enter your choice for the second double  ");
		dub2 = keyboard.nextDouble();
		System.out.print("Please enter your choice for the third double  ");
		dub3 = keyboard.nextDouble();
		System.out.println("\n\n\n");
		System.out.println("\tprinting out the values you entered for your integers and doubles are\n");
		System.out.println("\tthe value you entered for your first integer is = " + num1 + "\n");
		System.out.println("\tthe value you entered for your second integer is = " + num2 + "\n");
		System.out.println("\tthe value you entered for your third integer is  = " + num3 + "\n");
		System.out.println("\tthe sum of your three integers is = " + (num1 + num2 + num3) + "\n\n\n\n");
		System.out.println("\tthe value you entered for your first double is  = " + dub1 + "\n");
		System.out.println("\tthe value you entered for your second double is  = " + dub2 + "\n");
		System.out.println("\tthe value you entered for your third double is  = " + dub3 + "\n");
		System.out.println("\tthe sum of your three doubles is = " + (dub1 + dub2 + dub3) + "\n\n\n\n");
	

	}
	
}
		
