import java.util.ArrayList;
import java.util.Scanner;

public class Building {
	private int size;
	private ArrayList<Wall> walls;
	private String name;

	public Building() {
		walls = new ArrayList<Wall>();
		size = 0;
		name = "";

	}

	public Building(String nm) {
		walls = new ArrayList<Wall>();
		size = 0;
		name = nm;
	}

	public Building(String nm, int sz, String wlls) {
		walls = new ArrayList<Wall>();
		name = nm;
		size = sz;
		Scanner key = new Scanner(wlls);
		for (int i = 0; i < size; i++) {
			int ws = key.nextInt();
			String wal = key.nextLine();
			walls.add(i, new Wall(ws, wal));
		}
	}

	public void addWall(Wall wal) {
		walls.add(wal);
		size++;
	}

	public String toString() {
		String output = "";
		output += name + "\n";
		for (int i = 0; i < size; i++) {
			output += walls.get(i).toString();
		}
		return output;
	}
}
