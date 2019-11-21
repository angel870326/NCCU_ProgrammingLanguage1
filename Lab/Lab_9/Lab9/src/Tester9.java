import java.util.ArrayList;

public class Tester9 {

	public static void main(String[] args) {
		// 1. Create an ArrayList named “nameList” which can store String values.
		ArrayList<String> nameList = new ArrayList<String>();
		
		// 2. Add 5 name ("Daisy", "Jasmine", "Elsa", "Ryan", "Nick") into the array list in order, try to print nameList and show the output in the console.
		nameList.add("Daisy");
		nameList.add("Jasmine");
		nameList.add("Elsa");
		nameList.add("Ryan");
		nameList.add("Nick");
		System.out.println(nameList);
		
		// 3. Use remove() to remove “Nick” from nameList.
		nameList.remove(nameList.indexOf("Nick"));
		
		// 4. Use if-else and contains() to show whether nameList contains “Ryan” in console. If contains, print “Ryan is in nameList.”. Otherwise, print “Ryan is not in nameList.”.
		if(nameList.contains("Ryan")) {
			System.out.println("Ryan is in nameList.");
		}
		else {
			System.out.println("Ryan is not in nameList.");
		}

		// 5. Use if-else and isEmpty() to show whether nameList is empty. If empty, print “nameList is empty.”. Otherwise, print “nameList is not an empty list.”.
		if(nameList.isEmpty()) {
			System.out.println("nameList is empty.");
		}
		else {
			System.out.println("nameList is not an empty list.");
		}
		
		// 6. Use indexOf() to find out the index of "Elsa", and print the result in console.
		System.out.println("Elsa is at position: " + nameList.indexOf("Elsa"));

		// 7. Use size() to get the current length of nameList, and print the result in console.
		System.out.printf("The length of nameList is %d.\n", nameList.size());

		// 8. Use get() to find out the value of nameList which index is 1, and print the result in console.
		System.out.printf("The position 1 of nameList is %s.", nameList.get(1));



	}

}
