//
// Objective 3 programs
// using variables
//

public class Objective3Lab2
{
	public static void main(String[] args)
	{
		double side1, side2, hypotenuse;
		
		// assiging a value to variable side1 
		side1 = (double)(Math.random()*6);

		// assiging a value to variable side2 which is also a random number
		side2 = (double)(Math.random()*6);
		
		// getting the value for the hypotenuse
		hypotenuse = Math.sqrt(side1 + side2);
		
		System.out.println("\n\n");
		System.out.println("\tprinting out the values for the sides of the triangle and then the value of the hypotenuse\n");
		System.out.println("\tthe values will change each time you run the program since you are calling random\n");
		System.out.println("\tthe value of the hypotenuse is the the squareroot of side1 plus side2\n");
		System.out.println("\tSide 1 = " + side1 );
		System.out.println("\tSide 2 = " + side2 );
		System.out.println("\tthe value for the hypotenuse is =  " + hypotenuse);
		System.out.println("\n\n");
	}
}
		
