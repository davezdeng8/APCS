//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

package lab02;

public class Lab02f
{
	public static void main( String[] args )
   {
		Line slope = new Line();
		slope.line(1, 9, 14, 2);
		slope.calculateSlope();
		slope.print();
		
		slope.line(1, 7, 18, 3);
		slope.calculateSlope();
		slope.print();
		
		slope.line(6, 4, 2, 2);
		slope.calculateSlope();
		slope.print();
		
		slope.line(4, 4, 5, 3);
		slope.calculateSlope();
		slope.print();
		
		slope.line(1, 1, 2, 9);
		slope.calculateSlope();
		slope.print();
		
		
	}
}