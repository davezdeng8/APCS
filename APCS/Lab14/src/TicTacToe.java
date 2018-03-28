//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{


	}

	public TicTacToe(String game)
	{
		
		mat = new char [3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat[i][j] = game.charAt(3*i + j);
			}
		}


	}

	public String getWinner()
	{
		char [] winnerx = {'X', 'X', 'X'};
		char [] winnero = {'O', 'O', 'O'};
	
		for(int i = 0; i<3; i++){
			//System.out.println(mat[i]);
			if(similarArray(mat[i],winnerx)){
				return "X wins horizantally!";
			}
			if(similarArray(mat[i],winnero)){
				return "O wins horizontally!";
			}
			
		}
		for(int i = 0; i<3; i++){
			char [] hold = {mat[0][i], mat[1][i], mat[2][i]};
			if(similarArray(hold,winnerx))
				return "X wins vertically!";
			if(similarArray(hold,winnero))
				return "O wins horizantally!";
			}
		char [] hold1 = {mat[0][0], mat[1][1], mat[2][2]};
		
		char [] hold2 = {mat[0][2], mat[1][1], mat[2][0]};
		if(similarArray(hold1,winnerx) || similarArray(hold2,winnerx))
			return "X wins diagonally!";
		if(similarArray(hold1,winnero) || similarArray(hold2,winnero))
			return "O wins diagonally!";
		//if(1==1) return "cool";
		//if (mat[0][0]=='X')return "fasdf";
		return "Tie!";

	}
	public boolean similarArray(char [] a, char [] b){
		for (int i=0;i<3;i++){
			if (a[i]!=b[i])
					return false;
		}return true;
		
	}
	public String toString()
	{
		String output="";
		for(int i = 0; i<mat.length; i++){
			for(int j = 0; j<mat.length; j++){
				output+=mat[i][j];
			}
			output+="\n";
		}
		output+= getWinner();

		return output+"\n\n";
	}
}