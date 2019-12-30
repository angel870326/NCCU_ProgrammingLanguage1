
public class SquareBox extends Box {
	public SquareBox() {		
	}
	public SquareBox(int side) {
		super(side,side,side);
	}
	public void setSide(int side) {
		super.setWidth(side);
		super.setLength(side);
		super.setHeight(side);
	}
	public int getSide() {
		return super.getWidth();
	}
	@Override
	public String toString() {
		return "SquareBox[side=" + getSide() + "]" ;
	}

}
