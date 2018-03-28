//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -


public class Maze {
	private int[][] maze;

	public Maze() {

	}

	public Maze(int size, String line) {
		// create new maze - int size size array populate the maze loop with out
		// index == rows; inner = columns maze r-c = line.charAt(index calc)
		maze = new int[size][size];
		//System.out.println(line.length());
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				maze[i][j] = line.charAt(2*size*i + 2*j)-48;
				System.out.print((line.charAt(2*size*i + 2*j)));
				
			}
		}
		//System.out.println(line.charAt(2));
	}

	public boolean hasExitPath(int r, int c) {
		// if(check r and c bounds && maze r-c ==1 if c = maze.olength -1 exit
		// found = true; else save current spot and mark as visited has
		// ExitPath;
		// up down left right
		if (r >= 0 && r < maze.length && c >= 0 && c < maze.length
				&& maze[r][c] == 1) {
			if (c == maze.length - 1) {
				return true;
			} else {
				maze[r][c] = 'x';
				if (hasExitPath(r, c + 1) || hasExitPath(r, c - 1)
						|| hasExitPath(r + 1, c) || hasExitPath(r - 1, c)) {
					return true;
				}
			}
		}
		return false;
	}

	public String toString(int r, int c) {
		String output = "";
		for(int i = 0; i<maze.length; i++){
			for(int j = 0; j<maze.length; j++){
				output+=maze[i][j];
			}
			output+="\n";
		}
		if(hasExitPath(r,c)){
			output += "\nThere is an exit\n";
		}
		else{
			output += "\nThere is no exit\n";
		}
		return output;
	}
}