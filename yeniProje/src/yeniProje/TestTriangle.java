package yeniProje;

import java.util.Scanner;

public class TestTriangle {
	/****(Triangle class) Design a new Triangle class that extends the abstract 
GeometricObject class. Draw the UML diagram for the classes Triangle and 
GeometricObject then implement the Triangle class. Write a test program 
that prompts the user to enter three sides of the triangle, a color, and a Boolean 
value to indicate whether the triangle is filled. The program should create a Triangle object with these sides, and set the color and filled properties using the 
input. The program should display the area, perimeter, color, and true or false to 
indicate whether it is filled or not***/

	public static void main(String[] args) {	
		Scanner input=new Scanner(System.in);
		
		System.out.println("the triangle is filled (true/false) ? ");
		boolean filled = input.nextBoolean();
		
			
		System.out.println("enter color of triangle");
		String color=input.next();
		
		
		System.out.println("enter three sides of triangle");
		double[] side =new double[4];
		
		for(int i = 0 ; i < 3; i++) {
			side[i]=input.nextDouble();
		}
		
		
		
			Triangle triangle = new Triangle(filled,color,side);
			System.out.println(triangle);

	
	
	}

}
