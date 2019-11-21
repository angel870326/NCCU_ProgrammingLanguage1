import java.util.Scanner;

public class Tester5 {

	public static void main(String[] args) {
		
		// 1. Write a program that prompts the user for a score (0 ~ 100) then convert it to letter grade.
		
		System.out.println("1.");
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a score(0~100) or q to quit the program: ");
		
		String userInput = in.next();
		
		while(!userInput.equals("q")) 
		{
			int score = Integer.parseInt(userInput);
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
			System.out.print("Please input a score(0~100) or q to quit the program: ");
			userInput = in.next();		
			
		}
		
		System.out.println();


		
		// 2. Write a program that prompts the user for a positive integer x, then prints all factors of x.
		
		System.out.println("2.");
		System.out.print("Please input a positive integer: ");
		int positiveInt	= in.nextInt();	
		System.out.printf("Factors of %d: ", positiveInt);
		for(int i = 1; i <= positiveInt - 1; i++) 
		{
			if(positiveInt % i == 0) 
			{
				System.out.print(i + " ");
			}
		}
		
		
		
		in.close();
		System.out.println();
		System.out.println();

		
		
		/* 3. Print the funnel. Please use the for loop, print(), println(), the symbol “*” , and space “ “to show a funnel on the console. */
		
		System.out.println("3.");
		int layer = 4;
		for(int i = 1; i <= layer; i++) 
		{
			for(int j = 1; j <= i - 1; j++) 
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= 2 * layer + 1 - 2 * i; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= layer; i++) 
		{
			for(int j = 1; j <= layer - i; j++) 
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i - 1; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	

	}

}
