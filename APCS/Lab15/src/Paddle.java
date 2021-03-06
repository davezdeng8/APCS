//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y){
	   super(x,y);
	   speed = 5;
   }
   public Paddle(int x, int y, int s){
	   super(x,y);
	   speed = s;
   }
   public Paddle(int x, int y, int w, int h, int s){
	   super (x,y, w, h);
	   speed = s;
   }
   public Paddle(int x, int y, int w, int h, Color c, int s){
	   super(x, y, w, h, c);
	   speed = s;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   setY(getY() - speed);
	   setHeight(getHeight());
	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {	
	   draw(window, Color.white);
	   setY(getY() + speed);
	   setHeight(getHeight());
	   draw(window);
	   
   }
   

   //add get methods
   public Color getColor() {
		return super.getColor();
	}

	public int getX() {
		return super.getX();
	}

	public int getY() {
		return super.getY();
	}

	public int getWidth() {
		return super.getWidth();
	}

	public int getHeight() {
		return super.getHeight();
	}
   
   //add a toString() method
	public String toString(){
		return super.toString() + " " + speed;
	}
}