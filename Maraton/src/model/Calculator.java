package model;

public class Calculator {
	
	private int [] numberLeds;
	
	
	public Calculator() {
		this.numberLeds = new int[]{2,5,5,4,5,6,3,7,6,6};
	}
	
	
	public int numberLeds(String number) {
		int amountLeds = 0;
		for (int i = 0; i < number.length(); i++) {
			amountLeds += numberLeds[Integer.parseInt(number.charAt(i)+"") -1];
		}
		return amountLeds;
	}

}
