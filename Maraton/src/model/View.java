package model;

import java.util.Scanner;

public class View {
	
	private Scanner console;
	
	
	public View() {
		console = new Scanner(System.in);
	}
	
	public int readInt(String message){
		System.out.println(message);
		return console.nextInt();
	}
	
	public String readString(String message) {
		System.out.println(message);
		String box = console.next();
		return box;
	}
}
