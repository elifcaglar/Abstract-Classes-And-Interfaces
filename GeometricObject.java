package yeniProje;

public abstract class GeometricObject {

	private boolean filled;
	private String color;
	
	protected GeometricObject(boolean filled,String color) {
		this.filled=filled;
		this.color=color;
	}

	public abstract double getArea();
	
	public abstract double getPerimeter();

	public boolean getFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
