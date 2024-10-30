package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double initlength, double initwidth) {
		this.length = initlength;
		this.width = initwidth;
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return (2 * length) + (2 * width);
	}
	
	public String toString() {
		return length + ", " + width;
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public boolean size(Rectangle other) {
		return this.area() < other.area();
	}
	
	/*public void draw() {
		double x = 0.5;
		double y = 0.5;
		StdDraw.setPenColor(255,109,182);
		StdDraw.rectangle(x, y, width, length);
		StdDraw.show();
	}*/
	public static void main(String[] args) {
		Rectangle a = new Rectangle(5, 8);
		System.out.println(a);
		//a.draw();
		System.out.println("Area: " + a.area());
		System.out.println("Perimeter: " + a.perimeter());
		System.out.println("Square?: " + a.isSquare());
		System.out.println("Smaller?: " + a.size(new Rectangle(7, 9)));
	}
}
