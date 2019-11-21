import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		// 1. Write a program that given a positive integer x, find the first the prime greater than x.

		System.out.println("1.");
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a positive integer: ");
		int positiveInt = in.nextInt();	
		int nextPrime = positiveInt + 1;
		boolean ifPrime = false;
		while(!ifPrime)
		{
			int i = 2;
			while(nextPrime % i != 0)  //find the factor
			{
				i++;
			}
			if(nextPrime == i)   //factor = nextPrime then is prime
			{
				ifPrime = true;
			}
			else    //factor < nextPrime then is not prime
			{
				nextPrime ++;
			}	
		}
		System.out.printf("The next prime that greater than %d is %d \n", positiveInt, nextPrime);


		in.close();	
		System.out.println();
		
	
		
		
		
		// 2. Print the circle. 
		
		System.out.println("2.");
		int x = 3;
		int y = 3;
		int r = 3;
		int layer = 6;
				
		for(int i = 0; i <= layer; i++) 
		{
			for(int j = 0;j <= layer ; j++) 
			{
				if((i - x)*(i - x) + (j - y)*(j - y) <= r * r)
				{
					System.out.print("*");
				}	
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
	
		
		
		
	}

}
