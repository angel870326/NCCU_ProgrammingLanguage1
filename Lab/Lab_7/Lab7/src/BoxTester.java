
public class BoxTester {

	public static void main(String[] args) {
		// 1. Create a Box object named box1 in BoxTester, and use setter for assigning 5.0 to height, width, and depth.
		Box box1 = new Box();
		box1.setHeight(5.0);
		box1.setWidth(5.0);
		box1.setDepth(5.0);
		
		// 2. Create a Box object named box2, and assign 10.0 to height, width, and depth in the constructor.
		Box box2 = new Box(10.0, 10.0, 10.0);
		
		// 3. Show the height, width, and depth of box2 in the console.
		System.out.println("Height: " + box2.getHeight());
		System.out.println("Width: " + box2.getWidth());
		System.out.println("Depth: " + box2.getDepth());

		// 4. Implement calculateVolume() in Box class, and show the volume of box2 in BoxTester.
		box2.calculateVolume();
		
		// 5. Implement calculateSurfaceArea() in Box class, and show the volume of box2 in BoxTester.
		box2.calculateSurfaceArea();

		// 6. Try the following code in BoxTester, what will happen? Please explain it in comment.
		//box2.height = 9;
		/*
		 * Error: The field Box.height is not visible.
		 * Because height is a private data, we cannot access to it directly. 
		 * Instead, we should use methods of the public interface to access to it.
		 */

	}

}
