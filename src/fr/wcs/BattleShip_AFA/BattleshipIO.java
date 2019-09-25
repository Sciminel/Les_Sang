package fr.wcs.BattleShip_AFA;

import java.util.Scanner;

public class BattleshipIO {
	Scanner sc = new Scanner(System.in);

	public void print(String str){
		System.out.println(str);
		}

	public void printBoard(String[][] str){
		
		for(int i = 0; i < str.length; i++){
			for(int j = 0; j < str[0].length; j++) {
				System.out.print(str[i][j] + " ");
				}
			System.out.println("");
		}
	}
	public void askTarget(){
		System.out.println("Pick your target: (ex: C1 )");
		}

	public String readTarget(){
		return sc.nextLine();
		}
}