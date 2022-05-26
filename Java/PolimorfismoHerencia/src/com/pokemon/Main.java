package com.pokemon;

public class Main {
	public static void main(String[] arg) {
		
		//instanciando
//		Pokemon chikorita = new Pokemon(152,1,20,"Chikorita",false);
//		
//		//utilizando los metodos de instancia
//		
//		chikorita.comer();
//		chikorita.atacar();
//		chikorita.dormir();
		System.err.println("-------------------------------------");
		
		TipoPlanta chikorita2 = new TipoPlanta(152,1,20,"Chikorita2",false,1);
		
		chikorita2.comer();
		chikorita2.atacar();
		chikorita2.dormir();
		
		chikorita2.envenenar();
		chikorita2.atacar();
		
		System.err.println("-------------------------------------");
		
		Chikorita chikorita3 = new Chikorita(152,1,20,"Chikorita3",false,1,8);
		chikorita3.comer();
		chikorita3.comer("frutos Rojas");
		chikorita3.atacar();
		chikorita3.dormir();
		
		chikorita3.envenenar();
		chikorita3.paralizar();
		
		chikorita3.latigo();
		System.err.println("-------------------------------------");
		
		Cyndaquil cyndaquil = new Cyndaquil(155,2,50,"Cyndaquil",false);
		
		cyndaquil.comer();
		cyndaquil.atacar();
		cyndaquil.dormir();
		
		cyndaquil.araniar();
		cyndaquil.lanzaLlamas();
	}
}
