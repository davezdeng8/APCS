//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

package lab02;

public class Line
{
	private float xOne,yOne, xTwo, yTwo;
	private float slope;

	public void line(int x1, int y1, int x2, int y2)
	{

		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;



	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;




	}

	public void calculateSlope( )
	{
		slope = (yOne-yTwo)/(xOne-xTwo);


	}

	public void print( )
	{

		System.out.printf("The slope is %.2f \n", slope);

	}
}