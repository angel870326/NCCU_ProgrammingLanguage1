import java.util.Scanner;

public class Tester6 {

	public static void main(String[] args) {
		
		/* 
		   1. Based on lab4 question 1, rewrite the program as a static method named toLetterGrade 
		      that print the corresponding letter grade of the input parameter score which type is integer.
		*/
		System.out.println("1.");	
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a score (0~100): ");
		toLetterGrade(in.nextInt());
		
		
		/*
		    2. Write a static method named findHCF that find the highest common factor (HCF) of two input parameters, 
		       num1 and num2 which type are integer, then return the HCF.
		*/
		System.out.println("2.");	
		System.out.print("Please input a positive integer: ");
		int num1 = in.nextInt();
		System.out.print("Please input another positive integer: ");
		int num2 = in.nextInt();
		int hcf = findHCF(num1,num2);
		System.out.printf("The HCF of %d and %d is %d\n", num1, num2, hcf);

			
		/*
	    	4. Write a static method named findLCM that find the least common multiple (LCM) of two input parameters, 
	    	   num1 and num2 which type are integer, then return the LCM.
		*/
		System.out.println("4.");	
		System.out.print("Please input a positive integer: ");
		int num3 = in.nextInt();
		System.out.print("Please input another positive integer: ");
		int num4 = in.nextInt();
		int lcm = findLCM(num3,num4);
		System.out.printf("The LCM of %d and %d is %d\n", num3, num4, lcm);	
		
		
		
		in.close();
		
	}
	
		
	// 1.
	public static void toLetterGrade(int score) {
		
		if(score > 100 || score < 0){
			System.out.println(score + " is out of range.");
		}
		else if (score >= 80) {
			System.out.println(score + " = A");
		}
		else if (score >= 70) {
			System.out.println(score + " = B");
		}
		else if (score >= 60) {
			System.out.println(score + " = C");
		}
		else if (score >= 50) {
			System.out.println(score + " = D");
		}
		else if (score > 0) {
			System.out.println(score + " = E");
		}
		else{
			System.out.println(score + " = X");
		}		
		
	}
	
	
	
	// 2. & 3.
	
	/**
	   Find the highest common factor.
	   @param num1 a positive integer input
	   @param num2 another positive integer input
	   @return the highest common factor
	*/
	
	public static int findHCF(int num1, int num2) {
		
		int hcf = 1;
		for(int i = 1; i <= Math.min(num1, num2); i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}
		}
		return hcf;	
		
	}
	
	
	// 4.
	public static int findLCM(int num1, int num2) {
		
		int lcm = 1;
		boolean isLCM = false;
		while(!isLCM) {
			int i = Math.max(num1, num2);
			while(i % num1 != 0 || i % num2 != 0) {
				i++;
			}
			if(i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				isLCM = true;
			}			
		}
		return lcm;	
		
	}
	

}
