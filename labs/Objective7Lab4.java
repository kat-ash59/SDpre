//
// Objective 7 programs
// using do while loops
//
// Create a file called Objective7Lab4.java in the SDPre/Labs directory. 
// Write a program that sums up the numbers from 1 to 20: 1 + 2 + 3 ... + 20.
// Create a class structure with the name Objective7Lab4.
// Create a main method.
// Create two variables to store the current sum total and a counter.
// Write a while loop.
// Use the count variable to have the loop execute 20 times.
// Increment the value of count with each iteration.
// Update the current sum by adding count to sum with each iteration.
// This time there is no Starter Code provided for you. 
// You are going to create the entire file structure from scratch. 
// DO NOT COPY AND PASTE. While the code is similar and it is enticing to use a solution you already have, 
// the additional repetitions will aid in impressing this process in your mind

// need to be able to use import to get input variables
import java.time.*;
import java.util.*;

public class Objective7Lab4
{
	public static void main(String[] args)
	{
		// now declaring an integer with the value of the counter number and sum to be 0
		int counter = 0;
		int sum = 0;
		
		// adding the counter to the sum
		// using a do while loop
		while (counter <= 20)
		{
						
			sum = sum + counter;
			counter = counter + 1;
			
		}
		
		// now print out the value of the sum
		System.out.println("\n\n\tThe sum of the counter added to the value of the sum should be 210 and is " + sum + "\n\n");
		
	
	}
	
	
	
}
		
