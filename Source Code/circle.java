package paint;

public class circle extends shape {
	/**
	 * 	Please read the notes in Square Class first.
	 */
	
	public double radius;
	
	public double area() {
		/// note that PI  = Math.acos(-1)
		/// Math.acos(-1) = 3.141592653589793
		
		double PI = Math.acos(-1);
		return PI * PI * radius;
	}
	
	public void print() {
		printShape();
		System.out.println( "Area: " + area() );
		System.out.println( "Type: " + toString() );
	}
	
	public String toString() {
		return "circle";
	}
	
}
