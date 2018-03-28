import java.util.ArrayList;

public class Mate {
	
	private Square square1;
	private Square square2;
	private int crosspoint = (int) (Math.random()*16);
	private ArrayList<Integer> inverse1 = new ArrayList<>();
	private ArrayList<Integer> inverse2 = new ArrayList<>();

	
	public Mate(){}
	
	public Mate(Square squarea, Square squareb){
		square1=squarea;
		square2=squareb;
	}
	
	public void setcrosspoint(int val){
		crosspoint = val;
	}
	
	public int getcrosspoint(){
		return crosspoint;
	}
	
	public void inverse(){
		for(int i=1; i<=16; i++){
			int temp = 0;
			for(int j=0; j<16; j++){
				if (square1.getvalue(j)>i)
					temp++;
				else if (square1.getvalue(j)==i)
					break;
				else{}	
			}
			inverse1.add(temp);
		}
		
		for(int i=1; i<=16; i++){
			int temp = 0;
			for(int j=0; j<16; j++){
				if (square2.getvalue(j)>i)
					temp++;
				else if (square2.getvalue(j)==i)
					break;
				else{}	
			}
			inverse2.add(temp);
		}
	}
	
	public ArrayList<Integer> getinverse1(){
		return inverse1;
	}
	
	public ArrayList<Integer> getinverse2(){
		return inverse2;
	}
	
	public Square offspring1(){
		
	//Crossing over
		
		ArrayList<Integer> offinverse1 = new ArrayList<>();
		
		
		for (int i=0; i<=crosspoint; i++){
			offinverse1.add(inverse1.get(i));
		}
		
		for (int j=crosspoint+1; j<16; j++){
			offinverse1.add(inverse2.get(j));
		}
		
	// reconverting to normal
		
		ArrayList<Integer> count = new ArrayList<>();
		
		for(int i=0; i<16; i++){
			count.add(i);
		}
		
		ArrayList<Integer> offspring1 = new ArrayList<>();
		for(int i=0; i<16; i++){
			offspring1.add(0);
		}
		
		for(int i=0; i<16; i++){
			int spot = count.get(offinverse1.get(i));
			offspring1.set(spot, i+1);
			count.remove((int) (offinverse1.get(i)));

		}
		
		Square offspring = new Square(offspring1);
		offspring.mutate();
		return offspring;
	}
	
	public Square offspring2(){
		
	//Crossing over

		ArrayList<Integer> offinverse2 = new ArrayList<>();
		
		for (int i=0; i<=crosspoint; i++){
			offinverse2.add(inverse2.get(i));
		}
		
		for (int j=crosspoint+1; j<16; j++){
			offinverse2.add(inverse1.get(j));
		}
		
	// reconverting to normal
		
		ArrayList<Integer> count = new ArrayList<>();
		
		for(int i=0; i<16; i++){
			count.add(i);
		}
		
		ArrayList<Integer> offspring2 = new ArrayList<>();
		
		for(int i=0; i<16; i++){
			offspring2.add(0);
		}
		
		for(int i=0; i<16; i++){
			int spot = count.get(offinverse2.get(i));
			offspring2.set(spot, i+1);
			count.remove((int) (offinverse2.get(i)));		}
		
		Square offspring = new Square(offspring2);
		offspring.mutate();
		return offspring;
		
	}

}
