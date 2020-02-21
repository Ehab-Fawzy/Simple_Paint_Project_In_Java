package paint;

public class Square extends shape {
	/**
	 * 	Note that sideLength attribute is public so you can access it from any 
	 *  part of the code , we can make it private and make setters and getters
	 *  functions to access it from any part of the code
	 */
	
	public double sideLength;
	
	public double area() {
		return sideLength * sideLength;
	}
	
	
	
	/**
	 *	Note that the first line of print function is calling to printShape function
	 *	in the parent class (Shape) to print the common information then print the area of 
	 *	the shape
	 */
	public void print() {
		printShape();
		System.out.println( "Area: " + area() );
		System.out.println( "Type: " + toString() );
	}
	
	/**
	 * 	here the override of toString function return square word whenever we call it.
	 * 	we use it to differentiate between squares and circles objects
	 */
	public String toString() {
		return "square";
	}
}
