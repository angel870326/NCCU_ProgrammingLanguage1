
public class Tester8 {

	public static void main(String[] args) {
		// 1. Declare an integer array “squareValue” which can store 6 integer elements.
		int[] squareValue = new int [6];
		
		// 2. Show the length of squareValue in the console.
		System.out.println("2. The length of squareValue is " + squareValue.length);

		// 3. Use “for loop” and pow() in Math to assign following values to the array.
		for(int i = 0; i < squareValue.length ; i++) {
			squareValue[i] = (int)Math.pow(i + 1, 2);
		}
		
		// 4. Use for or while loop to iterate through the array and print the element of squareValue[i] and sum up the value as sample output.
		System.out.println("4. ");
		int sum = 0;
		for(int i = 0; i < squareValue.length; i++) {
			System.out.printf("%d: %d\n",i + 1, squareValue[i]);
			sum = sum + squareValue[i];
		}
		System.out.println("Sum: " + sum);
		
		// 5. 
		System.out.println("5. ");
		System.out.println("Average: " + calculateAvg(squareValue));

		
		// 6.  Use an array to make a multiplication table. 
		System.out.println("6. ");
		// Declare a two-dimension array “multiTable” which dimension is (3, 3).
		int[][] multiTable = new int[3][3];
		// Use nested-for loop to go through from (0, 0) to (2, 2) and assign corresponding value (i*j)
		for(int i = 0; i < multiTable.length; i++) {
			for(int j = 0; j < multiTable[i].length; j++) {
				multiTable[i][j] = (i + 1) * (j + 1);
				// Print the multiplication table.
				System.out.printf("%d * %d = %-3d", j + 1, i + 1, multiTable[i][j]);
			}
			System.out.println();
		}		
	}
	
	// 5.
	/**
	 * Calculate the average of the values in an integer array.
	 * @param arr is an integer array
	 * @return the double average
	 */
	public static double calculateAvg(int[] arr) {
		int total = 0;
		for(int element: arr) {
			total = total + element;
		}
		double avg = (double)total / arr.length;
		return avg;		
	}

}
