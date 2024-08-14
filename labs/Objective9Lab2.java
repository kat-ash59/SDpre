//
// Objective 9 programs
// using methods
//
// Create a file called Objective9Lab2.java in the SDPre/Labs directory.
// Using the starter code below, add code to the commented areas that would:
// Print "In method".

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective9Lab2
{
	public static void main(String[] args)
	{
				
		// print a couple of blank lines before printing output
		System.out.println("\n\n");
		
		System.out.println("\tPrinting from inside main\n");
		
		// now going to call the method to print out that I am in the method
		message();
		
		System.out.println("\tBack in the land of Main after returing from method message\n\n");
		
	}	
	
	public static void message()
	{
		System.out.println("\n\tPrinting from inside a method called message.\n\n");
	}
	
}
		
