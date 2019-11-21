import java.util.Scanner;

public class Tester_HW2 {

	public static void main(String[] args) {
		
		// 1. Write a program that checks the input year is a leap year or not.
		System.out.println("1.");
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the year: "); 

		if (in.hasNextInt())
		{
		  int input = in.nextInt();
		  if(input % 4 == 0) 
		  {
			  if(input % 100 == 0) 
			  {
				  if(input % 400 == 0) 
				  {
					  System.out.println("Leap year");   
				  }
				  else 
				  {
					  System.out.println("Common year");   
				  }
			  }
			  else 
			  {
				  System.out.println("Leap year");   
			  }
		  }
		  else {
			  System.out.println("Common year"); 
		  }
		  
		}
		else
		{
		  System.out.println("Invalid input");
		}

	
		
		// 2. BMI calculator.
		System.out.println("2.");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the weight(kg): "); 
		double weight = scan.nextDouble();
		System.out.println("Please input the height(cm): "); 
		double height = scan.nextDouble();
		double bmi = weight / Math.pow(height/100.0 , 2.0) ;
		System.out.println("BMI before rounded off: " + bmi); 	
	    double roundBmi = (double) Math.round(bmi * 100) / 100;
		String roundedBmi = "The BMI is " + roundBmi + ". ";
		if (roundBmi < 18.5) 
		{
			System.out.println(roundedBmi + "Underweight"); 
		}
		else if (18.5 <= bmi && bmi <= 25.0) 
		{
			System.out.println(roundedBmi + "Normal weight"); 
		}  
		else 
		{
			System.out.println(roundedBmi + "Overweight"); 
		} 		

		
		
		// 3. Write a program that prompts the user for a letter grade then converts it to a 100-scale score.
		
		System.out.println("3.");
		System.out.println("Please input a Letter grade: ");
		String letterGrade = scan.next();
		switch(letterGrade)
		{
			case "A": System.out.println("87"); break;
			case "B": System.out.println("75"); break;
			case "C": System.out.println("65"); break;
			case "D": System.out.println("55"); break;
			case "E": System.out.println("49"); break;
			case "X": System.out.println("0"); break;	
			default: System.out.println("Out of range."); break;
		}
		
		
				
		/* 4. Unit conversion. Write a unit conversion (for g, kg, and lb) program that prompts the user input a unit and a value,
	     then convert it to the other two units. Hint: 1000g = 1kg, 1 lb = 0.45kg, 1kg = 2.2 lbs.*/
		System.out.println("4.");
		System.out.println("Convert from (g, kg, lb)? ");
		String string1 = scan.next();
		System.out.println("Value? ");
		double double2 = scan.nextDouble();
		final double KG_TO_G = 1000;
		final double LB_TO_KG = 0.45;
		final double KG_TO_LB = 2.2;
		final double G_TO_KG = 0.001;
		final double G_TO_LB = G_TO_KG * KG_TO_LB;
		final double LB_TO_G = LB_TO_KG * KG_TO_G;

		String outputG = String.format("%.2f g = %.2f kg = %.2f lbs", double2 , double2 * G_TO_KG, double2 * G_TO_LB);
		String outputKg = String.format("%.2f kg = %.2f g = %.2f lbs", double2 , double2 * KG_TO_G, double2 * KG_TO_LB);
		String outputLb = String.format("%.2f lbs = %.2f g = %.2f kg", double2 , double2 * LB_TO_G, double2 * LB_TO_KG);	
				
		switch(string1)
		{
			case "g": System.out.println(outputG); break;
			case "kg": System.out.println(outputKg); break;
			case "lb": System.out.println(outputLb); break;
		}

		
		
		in.close(); 
		scan.close(); 

				
		
	}

}
