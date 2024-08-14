//
// Objective 5 programs
// using if statements
//
// Create a file called _Objective5Lab2.java_ in the _SDPre/Labs_ directory.
// Using the starter code below, add code to the commented area that would:
// Write an `if`/`else` statement that determines if `string1` is equivalent to `string3`.
// Print out the findings, e.g. `Banana is equal to Banana` or `Banana is not equal to Banana`.


// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective5Lab1
{
	public static void main(String[] args)
	{
		// now declaring variables
		// initialize them to expected values
		String string1 = "Banana";
		String string2 = "Bacon";
		String string3 = "Banana";
		
		
		// printing out original values so we know our starting point
		System.out.println("\n\n\n\tValue for String 1 = " + string1);
		System.out.println("\tValue for String 2 = " + string2);
		System.out.println("\tValue for String 3 = " + string3 + "\n\n\n");
		
		if (string1.equals(string2))
		{
			System.out.println("\n\tString 1 " + string1 + " is equivalent to String 2 "+ string2 + "\n\n");
		}
		else
		{
			System.out.println("\n\tString 1 " + string1 + " is not equivalent to String 2 " + string2 + "\n\n");
		}
		
		if (string1.equals(string3))
		{
			System.out.println("\n\tString 1 " + string1 + " is equivalent to String 3 "+ string3 + "\n\n");
		}
		else
		{
			System.out.println("\n\tString 1 " + string1 + " is not equivalent to String 3 " + string3 + "\n\n");
		}
	
		
	}
	
	
	
}
		
