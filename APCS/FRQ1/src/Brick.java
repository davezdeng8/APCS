public class Brick implements Comparable<Brick> {
	private int size;
	private String shape;

	public Brick() {
		size = 0;
		shape = "rectangle";
	}

	public Brick(int sz, String shp) {
		size = sz;
		shape = shp;
	}

	public void setSize(int sz) {
		size = sz;
	}

	public void setShape(String shp) {
		shape = shp;
	}

	public int getSize() {
		return size;
	}

	public String getShape() {
		return shape;
	}

	public int compareTo(Brick thing) {
		if (size > thing.getSize())
			return 1;
		if (size < thing.getSize())
			return -1;
		else
			return 0;
	}

	public boolean equals(Brick thing) {
		return (size == thing.getSize() && shape == thing.getShape());
	}

	public String toString() {
		return "[" + size + ", " + shape + "]";
	}

}
