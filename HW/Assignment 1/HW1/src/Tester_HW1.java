
public class Tester_HW1 {

	public static void main(String[] args) {
		
		//1.
		
		//A. Create 7 variables, all variables are primitive number types in Java
		int intVar1;
		int intVar2;
		byte byteVar3;
		double doubleVar4;
		double doubleVar5;
		short shortVar6;
		long longVar7;
		
		//B. Initialize each variable with any appropriate value.
		intVar1 = 10;
		intVar2 = 15;
		byteVar3 = 2;
		doubleVar4 = 0.9;
		doubleVar5 = 4.5;
		shortVar6 = 12345;
		longVar7 = 12345678;
		
		//C. Print out the name of each variable and its value.
		System.out.println("1.C.");
		System.out.println("intVar1 = " + intVar1);
		System.out.println("intVar2 = " + intVar2);
		System.out.println("byteVar3 = " + byteVar3);
		System.out.println("doubleVar4 = " + doubleVar4);
		System.out.println("doubleVar5 = " + doubleVar5);
		System.out.println("shortVar6 = " + shortVar6);
		System.out.println("longVar7 = " + longVar7);
		
		/*D. Modify the value of each variable with an assignment statement and print out the names of the variables and their
		new values.*/
		intVar1 = 20;
		intVar2 = 25;
		byteVar3 = 12;
		doubleVar4 = 0.1;
		doubleVar5 = 7.5;
		shortVar6 = 30000;
		longVar7 = 200000000;
		System.out.println("1.D.");
		System.out.println("intVar1 = " + intVar1);
		System.out.println("intVar2 = " + intVar2);
		System.out.println("byteVar3 = " + byteVar3);
		System.out.println("doubleVar4 = " + doubleVar4);
		System.out.println("doubleVar5 = " + doubleVar5);
		System.out.println("shortVar6 = " + shortVar6);
		System.out.println("longVar7 = " + longVar7);
		
		//2
		
		//A. Create 3 constants, each of them is primitive number types in Java. Print the name of the constant and its value.
		final int INT_CONSTANT1 = 3;
		final double DOUBLE_CONSTANT2 = 2.6;
		final short SHORT_CONSTANT3 = 19980;
		System.out.println("2.A.");
		System.out.println("INT_CONSTANT1 = " + INT_CONSTANT1);
		System.out.println("DOUBLE_CONSTANT2 = " + DOUBLE_CONSTANT2);
		System.out.println("SHORT_CONSTANT3 = " + SHORT_CONSTANT3);
		
		//B. What happens if you try to assign a value to a constant? Write your explanations in Java comment.
		//INT_CONSTANT1 = 100;     error
		//We cannot assign a new value to a constant because the initial value has been finalized and cannot be changed.
		
		
		//3.
		System.out.println("3.");
		
		//A. Use the first method to increment x in the program below. Print the value of x after incrementing.
		int x = 0;
		x = x + 1;
		System.out.println("x = " + x);
		
		//B. Use the ++ operator to increment y in the program below. Print the value of y after incrementing.
		int y = 0;
		y++ ;
		System.out.println("y = " + y);
		
		
		//4.
		double age1 = 18.0;
		double age2 = 35.0;
		double age3 = 50.0;
		double age4 = 44.0;
		double averageAge = (age1 + age2 + age3 + age4) / 4 ;
		System.out.println("4.");
		System.out.println(averageAge);

		
		//5.
		double probability = 8.70;
		int percentage = (int) Math.round(100*probability);
		System.out.println("5.");
		System.out.println(percentage);
		


	}

}
