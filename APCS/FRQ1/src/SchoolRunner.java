import java.util.ArrayList;
import java.util.Collections;

public class SchoolRunner {

	public static void main(String args[]) {

		Brick one = new Brick(1, "cylinder");
		Brick two = new Brick(2, "rectangle");
		Wall thing = new Wall();
		thing.addBrick(one);
		thing.addBrick(two);
		// System.out.println(thing);
		Wall stuff = new Wall(2, "3 rectangle 2 sphere");
		// System.out.println(stuff);
		Building test = new Building("A Building");
		test.addWall(thing);
		test.addWall(stuff);
		// System.out.println(test);
		Campus demo = new Campus("CCA");
		demo.addBuilding(test);
		System.out.println(demo);
		stuff.sort();
		thing.sort();
		System.out.println(demo);
		ArrayList<Brick> thinglist = thing.getArrayListBricks();
		System.out.println(Collections.binarySearch(thinglist, new Brick(2,
				"rectangle")));
		Brick cool = new Brick(4, "decagon");
		// System.out.println(Collections.binarySearch(thinglist, cool));
		// if (Collections.binarySearch(thinglist, cool) < 0) {
		// for (int i = 0; i < thinglist.size(); i++) {
		// if (cool.compareTo(thinglist.get(i)) < 0)
		// thing.addBrick(i, cool);
		// if (i == thinglist.size() - 1)
		// thing.addBrick(cool);
		// }
		// }
		//System.out.println(Collections.binarySearch(thinglist, cool));
		if(Collections.binarySearch(thinglist, cool)<0){
			thing.addBrick((Collections.binarySearch(thinglist, cool))*(-1)-1, cool);
		}
		else
			thing.addBrick((Collections.binarySearch(thinglist, cool)), cool);
		System.out.println(thing);
	}
}
