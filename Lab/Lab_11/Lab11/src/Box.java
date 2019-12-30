
public class Box {
	// Instance variable
	private int width;
	private int length;
	private int height;
	
	// Constructor
	public Box() {
		
	}
	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	// Setter and Getter
	public void setWidth(int width) {
		this.width = width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setHeight(int height) {
		this.height = height;
	}	
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}	
	public int getHeight() {
		return height;
	}

	// Instance methods
	public int getVolume() {
		return width * length * height;
	}
	@Override
	public String toString() {
		String widthStr = "width=" + width + ", ";
		String lengthStr = "length=" + length + ", ";
		String heightStr = "height=" + height;	
		return "Box[" + widthStr + lengthStr + heightStr + "]" ;
	}
	
	

}
