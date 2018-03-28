//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.black;
	}

	public Block(int x, int y) {
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = Color.black;
	}

	public Block(int x, int y, int w, int h) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = Color.black;
	}

	public Block(int x, int y, int w, int h, Color c) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}

	// add other Block constructors - x , y , width, height, color

	// add the other set methods

	public void setColor(Color col) {
		color = col;
	}

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void setWidth(int w) {
		width = w;
	}

	public void setHeight(int h) {
		height = h;
	}

	public void draw(Graphics window) {
		// uncomment after you write the set and get methods
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());

	}

	public boolean equals(Block obj) {
		if (color.equals(obj.getColor()) && xPos == obj.getX()
				&& yPos == obj.getY() && width == obj.getWidth()
				&& height == obj.getHeight())
			return true;

		return false;
	}

	// add the other get methods
	public Color getColor() {
		return color;
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	// add a toString() method - x , y , width, height, color
	public String toString() {
		return (xPos + " " + yPos + " " + width + " " + height + " " + color
				.toString());
	}
}