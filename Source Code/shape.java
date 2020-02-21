package paint;

public class shape {
	public String ID , color , name;
	
	/**
	 * 	when you print information of square or circle you will print 
	 *  ID , Color , Name which is common for both so the print of common attributes 
	 *  will be in the parent class instead of children classes to avoid redundant of code
	 */
	
	public void printShape() {
		System.out.println( "//////////////////" );
		System.out.println( "ID: " + ID );
		System.out.println( "Name: " + name );
		System.out.println( "Color: " + color );
	}
}
