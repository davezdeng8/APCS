import java.util.Scanner;
public class AirplaneFun {
	private String input;
	
	public AirplaneFun(String calc){
		calc = input;
	}
	
	public int Answer(){
		while(input.indexOf("*")>=0){
			int spot = input.indexOf("*");
			int hold = Math.multiplyExact((int) (input.charAt(spot-1)), (int) (input.charAt(spot+1)));
		}
	}
	//public static void main( String[] args ){
		
	//}
}
