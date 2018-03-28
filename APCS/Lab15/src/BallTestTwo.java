//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

class BallTestTwo extends Canvas implements Runnable {
	private Ball ball;

	public BallTestTwo() {
		setBackground(Color.WHITE);
		setVisible(true);

		// instantiate a new Ball
		ball = new Ball();

		// test the Ball thoroughly
		ball.setX(150);
		ball.setY(150);
		ball.setHeight(20);
		ball.setWidth(20);
		ball.setColor(Color.BLUE);
		ball.setSpeed(5, 5);
		System.out.println(ball.getX());
		System.out.println(ball.getY());
		System.out.println(ball.getHeight());
		System.out.println(ball.getWidth());
		System.out.println(ball.getColor());
		System.out.println(ball.getXSpeed());
		System.out.println(ball.getYSpeed());

		// test all constructors

		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		ball.moveAndDraw(window);

		if (!(ball.getX() >= 10 && ball.getX() <= 550)) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (!(ball.getY() >= 10 && ball.getY() <= 450)) {
			ball.setYSpeed(-ball.getYSpeed());
		}
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(19);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}