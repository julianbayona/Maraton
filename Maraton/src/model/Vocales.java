package model;

import java.util.ArrayList;

public class Vocales {

	private char[] vocArray;

	public Vocales() {
		this.vocArray = new char[] { 'a', 'e', 'i', 'o', 'u' };
	}

	public String metodo(String message) {
		ArrayList<Character> amountVoc = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			for (int j = 0; j < vocArray.length; j++) {
				if (message.charAt(i) == vocArray[j]) {
					if (!amountVoc.contains(message.charAt(i))) {
						amountVoc.add(message.charAt(i));
					}
					count++;
				}
			}

		}

		return amountVoc.toString() + " " + count;
	}

}
