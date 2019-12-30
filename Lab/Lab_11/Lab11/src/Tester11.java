
public class Tester11 {

	public static void main(String[] args) {
		Box box = new Box(4, 5, 6);
		SquareBox squareBox = new SquareBox(5);
		
		System.out.println(box.getVolume());
		System.out.println(box.toString());
		System.out.println("----------");
		
		System.out.println(squareBox.getVolume());
		System.out.println(squareBox.toString());
		System.out.println("----------");
		
		Box largerOne = getLargerOne(box, squareBox);
		System.out.println(largerOne.toString());

	}
	
	public static Box getLargerOne(Box r1, Box r2) {
		if(r1.getVolume() > r2.getVolume()) {
			return r1;
		}
		else {
			return r2;
		}
	}

}
