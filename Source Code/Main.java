package paint;

import java.util.Scanner;

public class Main {
	/**
	 * 	to understand the meaning of static key word read the note above menu function
	 */
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		// decleration of object from paint class
		paint paintObject = new paint();
		
		
		do {
			menu();
			int input = Integer.valueOf( scan.nextLine() );
			
			if ( input == 6 ) {
				break;
			}
			else if ( input == 1 ) {
				// Add Square Section
				
				// first make an square object
				shape squareObject = new Square();
				
				// read input from user
				System.out.print( "Enter Square Name: " );
				squareObject.name 	= scan.nextLine();
				
				System.out.print( "Enter Square ID: " );
				squareObject.ID 	= scan.nextLine();
				
				System.out.print( "Enter Square Color: " );
				squareObject.color 	= scan.nextLine();
				
				System.out.print( "Enter Square Side Length: " );
				((Square)squareObject).sideLength = Double.valueOf( scan.nextLine() );
				
				// add it to array list
				paintObject.addShape(squareObject);
			}
			else if ( input == 2 ) {
				// Add Circle Section
				
				// first make an circle object
				shape circleObject = new circle();
				
				// read input from user
				System.out.print( "Enter Circle Name: " );
				circleObject.name 	= scan.nextLine();
				
				System.out.print( "Enter Circle ID: " );
				circleObject.ID 	= scan.nextLine();
				
				System.out.print( "Enter Circle Color: " );
				circleObject.color 	= scan.nextLine();
				
				System.out.print( "Enter Circle Radius: " );
				((circle)circleObject).radius = Double.valueOf( scan.nextLine() );
				
				// add it to array list
				paintObject.addShape(circleObject);
			}
			else if ( input == 3 ) {
				// Print All Square Section
				paintObject.printSquares();
			}
			else if ( input == 4 ) {
				// Print All Circle Section
				paintObject.printCircles();
			}
			else if ( input == 5 ) {
				// Print All Shapes Section
				paintObject.printAllShapes();
			}
			
			System.out.println();
		}
		while ( true );
	}	
	
	/**
	 * 	Note that the menu function is static function (have static key word before it)
	 * 	to under standing the static key word assume we make static int counter in class 
	 * 	and two object from the same class is running concurrently and one of then edit
	 * 	change the value of the counter the other objects will affected with this change
	 * 
	 * 	static concept is important , there is no problem if you not understand it now , 
	 * 	but try to understand it from any resource 
	 */
	
	public static void menu() {
		System.out.println( "1- Add Square" );
		System.out.println( "2- Add Cirlce" );
		System.out.println( "3- Print All Squares" );
		System.out.println( "4- Print All Circles" );
		System.out.println( "5- Print All Shapes"  );
		System.out.println( "6- End" );
		System.out.print  ( "Enter Your Choice: " );
	}

}
