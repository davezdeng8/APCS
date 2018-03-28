import java.util.ArrayList;

public class Campus {
	private int size;
	private ArrayList<Building> buildings;
	private String name;

	public Campus() {
		buildings = new ArrayList<Building>();
		size = 0;
		name = "";

	}

	public Campus(String nm) {
		buildings = new ArrayList<Building>();
		size = 0;
		name = nm;

	}

	public Campus(String nm, int sz, ArrayList<Building> builds) {
		buildings = new ArrayList<Building>();
		name = nm;
		size = sz;
		buildings = builds;
	}

	public void addBuilding(Building x) {
		buildings.add(x);
		size++;
	}

	public String toString() {
		String output = "";
		output += name + "\n\n";
		for (int i = 0; i < size; i++) {
			output += buildings.get(i).toString();
		}
		return output;
	}

}
