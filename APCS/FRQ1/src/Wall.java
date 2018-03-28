import java.util.ArrayList;
import java.util.Scanner;

public class Wall {
	private int size;
	private ArrayList<Brick> bricks;

	public Wall() {
		size = 0;
		bricks = new ArrayList<Brick>();
	}

	public Wall(int sz, String bric) {
		size = sz;
		bricks = new ArrayList<Brick>();
		Scanner key = new Scanner(bric);
		for (int i = 0; i < size; i++) {
			int bs = key.nextInt();
			// System.out.println(bs);
			String bsh = key.next();
			// System.out.println(bsh);
			Brick thing = new Brick(bs, bsh);
			bricks.add(i, thing);
		}
	}

	public void addBrick(Brick bric) {
		bricks.add(bric);
		// System.out.println(bric);
		size++;
	}

	public void addBrick(int spot, Brick bric) {
		bricks.add(spot, bric);
		size++;
	}

	public void sort() {
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (bricks.get(i).compareTo(bricks.get(j)) > 0) {
					Brick hold = bricks.get(i);
					bricks.set(i, bricks.get(j));
					bricks.set(j, hold);
				}
			}
		}
	}

	public ArrayList<Brick> getArrayListBricks() {
		return bricks;
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < size; i++) {
			output += bricks.get(i).toString();
		}
		output += "\n";
		return output;
	}
}
