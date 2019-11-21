import java.util.Scanner;
import java.text.DecimalFormat;


public class Tester3 {

	public static void main(String[] args) {
		//1.
		System.out.println("1.");
		Scanner in = new Scanner(System.in);
		System.out.println("Please input an integer: ");
		int int1 = in.nextInt();
		System.out.println("Please input another integer: ");
		int int2 = in.nextInt();
	    in.close(); 
		int sumInt = int1 + int2;
		int productInt = int1 * int2;
		double avgInt = (double)Math.round(int1 + int2)/2.0;
		int maxInt;
		if (int1 >= int2) {
			maxInt = int1;
		}
		else {
			maxInt = int2;
		}
		System.out.println("Sum: " + sumInt);
		System.out.println("Product: " + productInt);
		DecimalFormat avgDig2 = new DecimalFormat("##.00");
	    System.out.println("Avg: " + avgDig2.format(avgInt));
		System.out.println("Maximum: " + maxInt);
		
		//2
		System.out.println("2.");
		System.out.printf("%9s%5d\n" , "Sum: " , sumInt);
		System.out.printf("%9s%5d\n" , "Product: " , productInt);
		System.out.printf("%9s%5.2f\n" , "Avg: " , avgInt);
		System.out.printf("%9s%5d\n" , "Maximum: " , maxInt);

		//3
		System.out.println("3.");
		String firstName = "Angel";
		String lastName = "Wang";
		String fullName = firstName + " " + lastName;
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(fullName + " " + fullName.length());
		String sub = fullName.substring(6,10);
		System.out.println(sub);
			
		//4
		System.out.println("4.");
		System.out.println("x is " + int1);
		System.out.println("y is " + int2);
		int remainder = int1 % int2;
		if (remainder == 0) {
			System.out.println("it is okay!");
		}
		else {
			System.out.println(remainder);
		}




		
	
	}

}
