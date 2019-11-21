import java.util.Scanner;

public class Tester4 {

	public static void main(String[] args) {
		
		//1. Write a program that prompts the user for a score (0 ~ 100) then convert it to letter grade.
		
		System.out.println("1.");
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a score(0~100): ");
		int score = in.nextInt();
		if(score > 100 || score < 0)
		{
			System.out.println("Out of range.");
		}
		else if (score >= 80) 
		{
			System.out.println("A");
		}
		else if (score >= 70) 
		{
			System.out.println("B");
		}
		else if (score >= 60) 
		{
			System.out.println("C");
		}
		else if (score >= 50) 
		{
			System.out.println("D");
		}
		else if (score > 0) 
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("X");
		}
		
		
		//2. Write a program that prompts the user for a letter grade then converts it to a 100-scale score.
		
		System.out.println("2.");
		System.out.println("Please input a Letter grade: ");
		String letterGrade = in.next();
		if(letterGrade.equals("A"))
		{
			System.out.println("87");
		}
		else if (letterGrade.equals("B")) 
		{
			System.out.println("75");
		}
		else if (letterGrade.equals("C")) 
		{
			System.out.println("65");
		}
		else if (letterGrade.equals("D")) 
		{
			System.out.println("55");
		}
		else if (letterGrade.equals("E")) 
		{
			System.out.println("49");
		}
		else if (letterGrade.equals("X")) 
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("Out of range.");
		}
		
		
		/*3. Unit conversion. Write a unit conversion (for g, kg, and lb) program that prompts the user input a unit and a value,
		     then convert it to the other two units. Hint: 1000g = 1kg, 1 lb = 0.45kg, 1kg = 2.2 lbs.*/
		
		System.out.println("3.");
		System.out.println("Convert from (g, kg, lb)? ");
		String string1 = in.next();
		System.out.println("Value? ");
		double double2 = in.nextDouble();
	    in.close(); 
		final double KG_TO_G = 1000;
		final double LB_TO_KG = 0.45;
		final double KG_TO_LB = 2.2;
		final double G_TO_KG = 0.001;
		final double G_TO_LB = G_TO_KG * KG_TO_LB;
		final double LB_TO_G = LB_TO_KG * KG_TO_G;

		if(string1.equals("g"))
		{
			System.out.println(double2 + " g" + " = " + double2 * G_TO_KG + " kg" + " = " + double2 * G_TO_LB + " lbs");
		}
		else if(string1.equals("kg"))
		{
			System.out.println(double2 + " kg" + " = " + double2 * KG_TO_G + " g" + " = " + double2 * KG_TO_LB + " lbs");
		}
		else if(string1.equals("lb"))
		{
			System.out.println(double2 + " lbs" + " = " + double2 * LB_TO_G + " g" + " = " + double2 * LB_TO_KG + " kg");
		}
		
	}

}
