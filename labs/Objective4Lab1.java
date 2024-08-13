//
// Objective 4 programs
// using input
//

// need to be able to use import to get input variables
import java.util.Scanner;

public class Objective4Lab1
{
	public static void main(String[] args)
	{
		// setting up variable to read from the keyboard
		
		Scanner keyboard = new Scanner(System.in);
	
			
		// now declaring variables that will be assigned by input from the keyboard and initializing them to null values 
		String fname = "";
		String lname = "";
		String favoriteAnimal = "";
		String favoriteFood = "";
		String favoriteSong = "";
		
		// going to printout the initial values which will appear as blanks
		
		System.out.println("\n\n");
		System.out.println("\tprinting out the inital values for first name, last name, favorite animal, favorite food, and favorite song\n");
		System.out.println("\tthe inital value for first name (will show as blank) is = " + fname + "\n");
		System.out.println("\tthe inital value for last name (will show as blank) is = " + lname + "\n");
		System.out.println("\tthe inital value for favorite animal (will show as blank) is = " + favoriteAnimal + "\n");
		System.out.println("\tthe inital value for favorite food (will show as blank) is = " + favoriteFood + "\n");
		System.out.println("\tthe inital value for favorite song (will show as blank) is = " + favoriteSong + "\n");
		System.out.println("\tnow I will ask you to fill in the values\n\n");
		//
		// will start getting input here
		//
		System.out.println("Please enter your first name ");
		fname = keyboard.nextLine();
		System.out.println("Please enter your last name ");
		lname = keyboard.nextLine();
		System.out.println("What is your favorite animal?  ");
		favoriteAnimal = keyboard.nextLine();
		System.out.println("What is your favorite food to eat?  ");
		favoriteFood = keyboard.nextLine();
		System.out.println("What is your favorite song?  ");
		favoriteSong = keyboard.nextLine();
		System.out.println("\n\n\n");
		System.out.println("\tprinting out the values you entered for first name, last name, favorite animal, favorite food, and favorite song\n");
		System.out.println("\tthe value you entered for your first name is = " + fname + "\n");
		System.out.println("\tthe value you entered for your last name is = " + lname + "\n");
		System.out.println("\tthe value you entered for your favorite animal is  = " + favoriteAnimal + "\n");
		System.out.println("\tthe value you entered for your favorite food is  = " + favoriteFood + "\n");
		System.out.println("\tthe value you entered for your favorite song is  = " + favoriteSong + "\n\n\n");
	

	}
	
}
		
