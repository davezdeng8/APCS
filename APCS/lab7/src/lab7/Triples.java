//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
package lab7;
import static java.lang.System.*;

public class Triples
{
   private int number;
   

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, double c)
	{
		int max = 0;
		
				for(int i = 2; i<=a; i++){
					if(a%i==0 && b%i==0 && c%i==0){
						return i;
			}
		}

		return 1;
	}

	public String toString()
	{
		String output="";
		
		
		for(int i=1; i<=number; i++){
			for (int j=1; j<=number; j++){
				double k = Math.pow(Math.pow(i, 2)+Math.pow(j, 2), .5);
				if(k%1==0&&k<=number){
					if((i%2==0 && j%2==1 && k%2==1) || (i%2==0 && j%2==1 && k%2==1)){
						if(greatestCommonFactor(i,j,k)==1){
							int m = (int) k;
						output+=i+" " + j + " " +m+"\n";
						}
					}
					
				}
				
			}
			
		}
		return output+"\n";
	}
}