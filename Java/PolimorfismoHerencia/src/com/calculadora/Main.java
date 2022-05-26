package com.calculadora;

public class Main {
	
	public static void main(String[] arg) {
		
		//instanciar
		Calculadora cal = new Calculadora(5,8);
		
		cal.sumar(5,8);
		
		Calculadora cal2 = new Calculadora (1,2,3);
		cal2.sumar(5,2,4);
		
		cal2.sumar(0, 0);
		
		Calculadora cal3 = new Calculadora(1,2,4, "Cal3");
		
	}
	 
}
