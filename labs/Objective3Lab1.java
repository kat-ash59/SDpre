//
// Objective 3 programs
// using variables
//

public class Objective3Lab1
{
	public static void main(String[] args)
	{
		double num1, num2, num3, average;
		
		// assiging a value to variable num one 
		num1 = (double)(Math.random()*6);

		// assiging a value to variable num2 which is also a random number
		num2 = (double)(Math.random()*6);
		
		// assiging a value to variable third which is yet another random number
		num3 = (double)(Math.random()*6);

		
		System.out.println("\n\n");
		System.out.println("printing out the values for the doubles num1, num2, num3 and their average value\n");
		System.out.println("the values will change each time you run the program since you are calling random\n");
		System.out.println(num1 + " + " + num2 + " + " + num3 + " average = " + ((num1+num2+num3)/3.0));
		System.out.println("\n\n");
	}
}
		
