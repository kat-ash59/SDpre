//
// Objective 2 programs
// using variables
//

public class Objective3Lab3
{
	public static void main(String[] args)
	{
		int first, second, third;
		
		// assiging a value to variable first which is 1 + a random number
		first = 1 + (int)(Math.random()*6);

		// assiging a value to variable second which is 1 + a random number
		second = 1 + (int)(Math.random()*6);
		
		// assiging a value to variable third which is 1 + a random number
		third = 1 + (int)(Math.random()*6);

		
		System.out.println("\n\n");
		System.out.println("printing out the values for the integers first, second and third and their sum\n");
		System.out.println("the values will change each time you run the program since you are calling random\n");
		System.out.println(first + " + " + second + " + " + third + " = " + (first+second+third));
		System.out.println("\n\n");
	}
}
		
