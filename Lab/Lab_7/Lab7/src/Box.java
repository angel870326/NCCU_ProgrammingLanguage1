
public class Box {
	private double height;
	private double width;
	private double depth;
	
	public Box() {
		
	}
	
	public Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	//setter
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	//getter
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getDepth() {
		return depth;
	}
	
	//calculate volume
	
	public void calculateVolume() {
		System.out.println("The volume is: " + height * width * depth);
	}
	
	//calculate surface area
	
	public void calculateSurfaceArea() {
		System.out.println("The surface area is: " + 2 * (height * width + height * depth + width * depth));
	}


}
