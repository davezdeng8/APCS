import java.util.ArrayList;

public class Main {

	public static void main( String[] args ){
		
	int test = 0;
	
	while(test == 0){
		
		ArrayList<Square> genlist = new ArrayList<>();

		for(int i=0; i<250; i++){
			genlist.add(new Square());
		}
		
		Generation gen = new Generation(genlist);
		Square magic = null;
		
		for(int i=0; i<30; i++){
			for(int j=0; j<gen.length(); j++){
				if(gen.getSquare(j).findfitness()==0){
					magic = gen.getSquare(j);
					break;
				}
			}
			//System.out.println(gen.genfit());
			if(magic == null){
				gen = gen.offspring();
			}
			else{
				break;
			}
			
		}
		if(magic != null){
			magic.print();
			test=1;
		}
		else{
			//System.out.println("No magic square were found in 30 generations");
		}
		
	}

		
	}
	
}
