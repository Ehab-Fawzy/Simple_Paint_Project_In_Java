package paint;

import java.util.ArrayList;

public class paint {
	/**
	 * 	Note that the listOfShapres array list is private so no one can access it 
	 * 	from any part of code , the only class can use it is the paint class ( the class
	 *  that create it )
	 * 	
	 */
	private ArrayList<shape> listOfShapes = new ArrayList<shape>();
	
	/**
	 * 	if you want to add shape , create it in the main and pass it as parameter 
	 * 	to addShape function and this function will add it to listOfShapes array list
	 */
	public void addShape( shape item ) {
		listOfShapes.add(item);
	}
	
	/**
	 * 	iterate over all shapes and call function toString to know this object is
	 *  circle or square
	 * 
	 * 	NOTE:
	 * 	to compare between two strings we use function compareTo not (==) operator 
	 * 	
	 * 	if it return 0  -> both are equal
	 * 	if it return -1 -> (string 1 < string 2) in dictionary order (lexicographically)
	 *  if it return +1 -> (string 1 > string 2) in dictionary order (lexicographically)
	 */
	
	public void printAllShapes() {
		for ( int i = 0; i < listOfShapes.size(); i++ ) {
			if ( listOfShapes.get(i).toString().compareTo("circle") == 0 ) {
				((circle)listOfShapes.get(i)).print();
			}
			else {
				((Square)listOfShapes.get(i)).print();
			}
		}
	}
	
	public void printCircles() {
		for ( int i = 0; i < listOfShapes.size(); i++ ) {
			if ( listOfShapes.get(i).toString().compareTo("circle") == 0 ) {
				((circle)listOfShapes.get(i)).print();
			}
		}
	}
	
	public void printSquares() {
		for ( int i = 0; i < listOfShapes.size(); i++ ) {
			if ( listOfShapes.get(i).toString().compareTo("square") == 0 ) {
				((Square)listOfShapes.get(i)).print();
			}
		}
	}
}
