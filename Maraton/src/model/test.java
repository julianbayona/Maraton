package model;

import java.util.Iterator;

public class test {
	private Calculator calculator;
	private Vocales vocales;
	private Encrypt encrypt;
	private View view;
	
	public test() {
		this.calculator = new Calculator();
		this.vocales = new Vocales();
		this.encrypt = new Encrypt();
		this.view = new View();
	}
	
	public void metodo() {
		int iterations = view.readInt("Digite iteraciones");
		int i = 0;
		while ( i < iterations ) {
			String number = view.readString("Digite el numero" );
			System.out.println(calculator.numberLeds(number) + " leds");
			i++;
		}	
	}
	
	
	public void metodo3() {
		encrypt.start("hola");
		System.out.println(encrypt.print());
	}
	
	
	public void metodo2() {
		System.out.println(vocales.metodo("hola perra aaaaaaa ooooo"));
		
	}
	
	
	public void metodo4() {
		calculator.persistence();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		new test().metodo4();
	}

}
