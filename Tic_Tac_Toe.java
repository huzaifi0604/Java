/*  Muhammad Huzaifa
	National University of Compter & Emerging Sciences
	Bs CsDF
	20I-0604
	Tic Tac Toe
*/

import java.util.*;
import java.io.*;
import java.lang.Thread;			//Importing Libraries
import java.util.Random;

public class Tic_Tac_Toe{
	
	//Declaring Global Variables
	char[][] board={{'-','-','-'},{'-','-','-'},{'-','-','-'}};
	int counto=0;
	int countx=0;
	int counta=0;
	
	//Main Function
	public static void main(String[] args){
		Tic_Tac_Toe obj=new Tic_Tac_Toe();
		System.out.println("\t\tWelcome To Tic tac Toe");
		
		for(int i=0;i<obj.board.length;i++){
			for(int j=0;j<obj.board.length;j++){
				System.out.print(obj.board[i][j]+ " ");		//Printing Initial Board
			}
			System.out.println();
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("You Want to Play as\n 1- O\n 2- X\n Choose: ");	//Taking Input From User
		int a=sc.nextInt();
		switch(a){
		case 1:
		{
			//Taking Input who Player Wants To play with 
			System.out.println("You Will be Considered as Player 01\n Lets Play the Game");
			System.out.println("You Want To play With \n 1- AI \n 2- Another Player \n Choice: ");
			Scanner inp=new Scanner(System.in);
			int d=inp.nextInt();
			try{
			if(d==2){							//User Playing With Another Player
			while(obj.counto!=3 || obj.countx!=3){
			play('O', obj);					
			play('X',obj);					//Playing Game Until Any results
			}
			
			// Winning Conditions for Player 01
			if(obj.board[0][0]=='O' && obj.board[1][1]=='O' && obj.board[2][2]=='O'){
				System.out.println("Player 01 Wins");
				break;
			}
			if(obj.board[0][1]=='O' && obj.board[1][1]=='O' && obj.board[2][1]=='O'){
				System.out.println("Player 01 Wins");
				break;
			}
			if(obj.board[0][2]=='O' && obj.board[1][1]=='O' && obj.board[2][0]=='O'){
				System.out.println("Player 01 Wins");
				break;
			}
			if(obj.board[1][0]=='O' && obj.board[1][1]=='O' && obj.board[1][2]=='O'){
				System.out.println("Player 01 Wins");
				break;
			}
			// Winning Conditions for Player 02
			if(obj.board[0][0]=='X' && obj.board[1][1]=='X' && obj.board[2][2]=='X'){
				System.out.println("Player 02 Wins");
				break;
			}
			if(obj.board[0][1]=='X' && obj.board[1][1]=='X' && obj.board[2][1]=='X'){
				System.out.println("Player 02 Wins");
				break;
			}
			if(obj.board[0][2]=='X' && obj.board[1][1]=='X' && obj.board[2][0]=='X'){
				System.out.println("Player 02 Wins");
				break;
			}
			if(obj.board[1][0]=='X' && obj.board[1][1]=='X' && obj.board[1][2]=='X'){
				System.out.println("Player 02 Wins");
				break;
			}
			else{
				System.out.println("Its A Draw");
				break;
			}
			}
			//User Playing with Artificial Intelligence / Computer
			else if(d==1){
				while(obj.counta!=3){
				play('O',obj);			//Playing Until any Final Results
				System.out.println("Its AI's Turn");
				Thread.sleep(2000);//System Pause
				AIplay('X',obj);
				}
				// Winning Conditions for Player 01
				if(obj.board[0][0]=='O' && obj.board[1][1]=='O' && obj.board[2][2]=='O'){
				System.out.println("Player 01 Wins");
				break;
			}
			if(obj.board[0][1]=='O' && obj.board[1][1]=='O' && obj.board[2][1]=='O'){
				System.out.println("Player 01 Wins");
				break;
			}
			if(obj.board[0][2]=='O' && obj.board[1][1]=='O' && obj.board[2][0]=='O'){
				System.out.println("Player 01 Wins");
				break;
			}
			if(obj.board[1][0]=='O' && obj.board[1][1]=='O' && obj.board[1][2]=='O'){
				System.out.println("Player 01 Wins");
				break;
			}
			//Winning Conditions for Artificial Intelligence
			if(obj.board[0][0]=='X' && obj.board[1][1]=='X' && obj.board[2][2]=='X'){
				System.out.println("AI Wins");
				break;
			}
			if(obj.board[0][1]=='X' && obj.board[1][1]=='X' && obj.board[2][1]=='X'){
				System.out.println("AI Wins");
				break;
			}
			if(obj.board[0][2]=='X' && obj.board[1][1]=='X' && obj.board[2][0]=='X'){
				System.out.println("AI Wins");
				break;
			}
			if(obj.board[1][0]=='X' && obj.board[1][1]=='X' && obj.board[1][2]=='X'){
				System.out.println("AI Wins");
				break;
			}
			else{
				System.out.println("Its A Draw");
				break;
			}
			}
			}
			catch (Exception h) {
            
            // catching the exception
            System.out.println(h);
        }
	}
		case 2:
		{
			//Taking input Who user wants to play with
			System.out.println("You Will be Considered as Player 02\n Lets Play the Game");
			System.out.println("You Want To play With \n 1- AI \n 2- Another Player \n Choice: ");
			Scanner in=new Scanner(System.in);
			int e=in.nextInt();
			try{
			if(e==2){
			while(obj.counto!=3 || obj.countx!=3){
			play('O',obj);					//Playing until Ay Final results
			play('X',obj);
			}
			//Winning Conditions for Player 02
			if(obj.board[0][0]=='O' && obj.board[1][1]=='O' && obj.board[2][2]=='O'){
				System.out.println("Player 02 Wins");
				break;
			}
			if(obj.board[0][1]=='O' && obj.board[1][1]=='O' && obj.board[2][1]=='O'){
				System.out.println("Player 02 Wins");
				break;
			}
			if(obj.board[0][2]=='O' && obj.board[1][1]=='O' && obj.board[2][0]=='O'){
				System.out.println("Player 02 Wins");
				break;
			}
			if(obj.board[1][0]=='O' && obj.board[1][1]=='O' && obj.board[1][2]=='O'){
				System.out.println("Player 02 Wins");
				break;
			}
			//Winning Conditions For Player 01
			if(obj.board[0][0]=='X' && obj.board[1][1]=='X' && obj.board[2][2]=='X'){
				System.out.println("Player 01 Wins");
				break;
			}
			if(obj.board[0][1]=='X' && obj.board[1][1]=='X' && obj.board[2][1]=='X'){
				System.out.println("Player 01 Wins");
				break;
			}
			if(obj.board[0][2]=='X' && obj.board[1][1]=='X' && obj.board[2][0]=='X'){
				System.out.println("Player 01 Wins");
				break;
			}
			if(obj.board[1][0]=='X' && obj.board[1][1]=='X' && obj.board[1][2]=='X'){
				System.out.println("Player 01 Wins");
				break;
			}
			else{
				System.out.println("Its A Draw");
				break;
			}
			}
			else if(e==1){
				while(obj.counta!=3){//Playing Until any Final results
				System.out.println("Its AI's Turn");
				Thread.sleep(2000);		//System Pause
				AIplay('O',obj);
				Thread.sleep(500);		//System Pause
				play('X',obj);
				}
				//Winnning Conditions for AI
				if(obj.board[0][0]=='O' && obj.board[1][1]=='O' && obj.board[2][2]=='O'){
				System.out.println("AI Wins");
				break;
			}
			if(obj.board[0][1]=='O' && obj.board[1][1]=='O' && obj.board[2][1]=='O'){
				System.out.println("AI Wins");
				break;
			}
			if(obj.board[0][2]=='O' && obj.board[1][1]=='O' && obj.board[2][0]=='O'){
				System.out.println("AI Wins");
				break;
			}
			if(obj.board[1][0]=='O' && obj.board[1][1]=='O' && obj.board[1][2]=='O'){
				System.out.println("AI Wins");
				break;
			}
			//Winning Conitions for Player 02 / User
			if(obj.board[0][0]=='X' && obj.board[1][1]=='X' && obj.board[2][2]=='X'){
				System.out.println("Player 02 Wins");
				break;
			}
			if(obj.board[0][1]=='X' && obj.board[1][1]=='X' && obj.board[2][1]=='X'){
				System.out.println("Player 02 Wins");
				break;
			}
			if(obj.board[0][2]=='X' && obj.board[1][1]=='X' && obj.board[2][0]=='X'){
				System.out.println("Player 02 Wins");
				break;
			}
			if(obj.board[1][0]=='X' && obj.board[1][1]=='X' && obj.board[1][2]=='X'){
				System.out.println("Player 02 Wins");
				break;
			}
			else{
				System.out.println("Its A Draw");
				break;
			}
			}
			}
			catch (Exception i) {
            
            // catching the exception
            System.out.println(i);
        }
		}
		// Default Case for Symbol Input
		default:
		{
			System.out.println("Invalid Input \n Please Try Again");
			break;
		}
		}
	}
	
	//Play Function For each Players Turn
	static void play(char sym,Tic_Tac_Toe obj){
		if(sym=='O'){
			System.out.println("Its Player 01's Turn");
			obj.counto+=1;
		}
		else if(sym=='X'){
			obj.countx+=1;
			System.out.println("Its Player 02's Turn");
		}
				//Tic_Tac_Toe obj=new Tic_Tac_Toe();
				Scanner sc= new Scanner(System.in);
				System.out.print("Enter Where You Want to place symbol\n Enter Row no~(0-2): ");
				int b=sc.nextInt();
				System.out.print(" Enter Col no~(0-2): ");//Taking Coordinates For Symbol Placing
				int c=sc.nextInt();
				obj.board[b][c]=sym;
				for(int i=0;i<obj.board.length;i++){
					for(int j=0;j<obj.board.length;j++){
						System.out.print(obj.board[i][j] + " ");//Displaying Board After each turn
					}
					System.out.println();
				}
				System.out.println();
			}
		
	//Function For AI's Turns
	static void AIplay(char sym, Tic_Tac_Toe obj){
		obj.counta+=1;
		int f,g;
		Random rand=new Random();
		f=rand.nextInt(2);
		g=rand.nextInt(2);		//Taking Random Values Between 0 - 2
		if(obj.board[f][g]!='-'){
			f=rand.nextInt(2);
			g=rand.nextInt(2);
		}
		else{
			obj.board[f][g]=sym;//AI's Turn
			for(int i=0;i<obj.board.length;i++){
				for(int j=0;j<obj.board.length;j++){
					System.out.print(obj.board[i][j] + " ");
				}
				System.out.println();				//Printing Board After AI's Turn
			}
			System.out.println();
		}
	}
}