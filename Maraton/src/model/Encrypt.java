package model;

import java.util.Iterator;

public class Encrypt {
	
	private String [][] matriz;
	
	public Encrypt() {
	}
	
	public void setUp(String first) {
		this.matriz = new String[7][7];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = "o";
			}
		}
		//matriz[matriz.length+1/2][matriz.length+1/2] = first;
	}
	
	
	public void start(String message) {
		setUp(message);
		int moves = 1;
		int moves2 = 0;
		int iChar = 0;
		int ini = matriz.length/2;
		
		while(moves<=ini) {
			
			for (int j = ini-moves2; j <= ini+moves; j++) {
				matriz[ini-moves][j] = "#";
			}
			
			for (int i = ini-moves2; i <= ini+moves; i++) {
				matriz[i][ini+moves]= "#";
			}
			
			
			for (int j = ini+moves2; j >= ini-moves; j--) {
				matriz[ini+moves][j] = "#";
			}
			
			for (int i = ini+moves2; i >= ini-moves; i--) {
				matriz[i][ini-moves] = "#";
			}
			
			moves++;
			moves2++;
		}
	}
	
	
	public String print() {
		String box = "";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				box += matriz[i][j];
			}
			box += "\n";
		}
		return box;
	}

}
