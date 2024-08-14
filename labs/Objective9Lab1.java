//
// Objective 9 programs
// using methods
//
// In this lab, you have two methods: main and printName.
// Create a file called Objective9Lab1.java in the SDPre/Labs directory. 
// Using the starter code below, add code to the commented areas that would:
// Call the provided printName method.

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective9Lab1
{
	public static void main(String[] args)
	{
				
		// print a couple of blank lines before printing output
		System.out.println("\n\n");
		
		// now going to call the method printName to print out my name
		printName();
		
	}	
	
	public static void printName()
	{
		System.out.println("\n\tPrinting my name from inside a method called printName.\n");
		System.out.println("\tHello my name is Kat Ash!\n\n\n");
	}
	
}
		
