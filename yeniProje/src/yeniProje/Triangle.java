package yeniProje;

public class Triangle extends GeometricObject {
	
	private double[] side = new double[3];
	
	
	public Triangle(boolean filled,String color) {
		super(filled,color);
	}
	
	
	
	public Triangle(boolean filled,String color,double side[]){
		super(filled,color);
		this.side = side;
		
	}
	
	
	public double[] getSide() {
		return side;
	}
	
	public void setSide(double[] side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		double s = (side[0] + side[1] + side[3]) / 2;
		return Math.sqrt(s * (s - side[0]) * (s - side[1]) * (s - side[2]));	
	}

	@Override
	public double getPerimeter() {
		return side[0] + side[1] + side[2];
	}

	@Override
	public String toString() {
		return "\nArea: " + getArea() + 
			"\nPerimeter: " + getPerimeter() 
			+ "\nFilled: " + getFilled() + "\nColor: " + getColor()
			+ "\nSides: " + side[0] + " ," +  side[1] + ", " + side[2]; 
	}
	
}
