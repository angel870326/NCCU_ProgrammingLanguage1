
public class Tester2 {

	public static void main(String[] args) {
		//1
		int var1 = 2;
		int var2 = 9;
		double var3 = 0.3;
		double var4 = 1.5;
		System.out.println("1.");
		System.out.println("Var1 = " + var1 );
		System.out.println("Var2 = " + var2 );
		System.out.println("Var3 = " + var3 );
		System.out.println("Var4 = " + var4 );

		//2
		double operate = var1*(var4-var3) + var2/var3;
		System.out.println("2.");
		System.out.println("var1*(var4-var3) + var2/var3 = "+ operate);
		
		//3
		//var1 = var3;
		//出現error，整數不能是小數
		
		//4
		var4 = var2;
		//沒有error，小數可以是整數，整數加上".0"即為小數
		
		//5
		final int DAYS_OF_YEAR = 365;
		
		//6
		byte byteVar = (byte)DAYS_OF_YEAR;
		short shortVar = DAYS_OF_YEAR;
		System.out.println("6.");
		System.out.println("byteVar = " + byteVar);
		System.out.println("shortVar = " + shortVar);
		
		//7
		final double PI = 3.1415926;
		int r = 10;
		double circleArea = PI*r*r;
		double circlePerimeter = PI*r*2;
		System.out.println("7.");
		System.out.println("circleArea = " + circleArea);
		System.out.println("circlePerimeter = " + circlePerimeter);
		
		//8
		System.out.println("8.");
		System.out.println("The ceil of circle area = " + Math.ceil(circleArea));
		System.out.println("The round of circle area = " + Math.round(circleArea));
		System.out.println("The floor of circle area = " + Math.floor(circleArea));	
		
	}

}
