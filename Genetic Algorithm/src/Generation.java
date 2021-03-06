import java.util.ArrayList;

public class Generation {
	
	private ArrayList<Square> gen = new ArrayList<>();
	
	public Generation(ArrayList<Square> input){
		gen = input;
	}
	
	public void addSquare(Square extra){
		gen.add(extra);
	}
	
	public int length(){
		return gen.size();
	}
	
	public Square getSquare(int index){
		return gen.get(index);
	}
	
	public float genfit(){
		float avgfit=0;
		int sum = 0;
		for(int i=0; i<gen.size(); i++){
			sum = sum + gen.get(i).findfitness();
		}
		avgfit = (sum/gen.size());
		return avgfit;
	}
	
	public Generation offspring(){
		
	ArrayList<Square> offspringlist = new ArrayList<>();
	ArrayList<Square> parent = new ArrayList<>();
		for(int i=0; i<10; i++){
			int low = gen.get(0).findfitness();
			int lowindex = 0;
			for(int j=1; j<gen.size(); j++){
				if (low>gen.get(j).findfitness()){
					low = gen.get(j).findfitness();
					lowindex = j;
					
				}
			}
			parent.add(gen.get(lowindex));
			gen.remove(lowindex);
		}
		
		/*
		for (int i=0; i<5; i++){
			gen.add(parent.get(i));
		}
		*/
		
		for(int i=0; i<5; i++){
			for(int j=i+1; j<5; j++){
				Mate repro = new Mate(parent.get(i), parent.get(j));
				for(int k=0; k<16; k++){
					repro.setcrosspoint(k);
					repro.inverse();
					offspringlist.add(repro.offspring1());
					offspringlist.add(repro.offspring2());
				}
			}
		}
		
		Generation offspring = new Generation(offspringlist);
		return offspring;
	}
}
