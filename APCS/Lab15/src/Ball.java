//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y) {
		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;

	}

	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y, int w, int h, Color c, int xs, int ys) {
		super(x, y, w, h, c);
		xSpeed = xs;
		ySpeed = ys;

	}
	public Ball(int x, int y, int w, int h, int xs, int ys){
		super(x,y,w,h);
		xSpeed = xs;
		ySpeed = ys;
	}

	// add the other Ball constructors

	
	public void setXSpeed(int x) {
		xSpeed = x;
	}

	public void setYSpeed(int x) {
		ySpeed = x;
	}

	public void setSpeed(int x, int y) {
		xSpeed = x;
		ySpeed = y;
	}

	// add the set methods

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		draw(window, Color.WHITE);
		setX(getX() + xSpeed);
		// setY
		setY(getY() + ySpeed);
		setWidth(getWidth());
		setHeight(getHeight());
		// draw the ball at its new location
		draw(window);
	}
	public void blank(Graphics window){
		   draw(window, Color.white);
	   }
	public void fill(Graphics window){
		draw(window);
	}
	public boolean equals(Ball obj) {
		if (super.equals(obj) && xSpeed == obj.getXSpeed()
				&& ySpeed == obj.getYSpeed()) {
			return true;
		}
		return false;
	}

	// add the get methods
	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	
	// add a toString() method
	public String toString() {
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}
}