package application;

import acoes.Acoes;
import acoes.AcoesCautela;
import acoes.AcoesNinja;

public class Ninja {

	public static void main(String[] args) {
		Acoes ninja = new AcoesNinja();
		
		System.out.println("que gatinho é esse???");
		
		System.out.println("Quando ele corre é desse jeito:");
		ninja.correr();
		System.out.println("Mia de um jeito um tanto estranho:");
		ninja.miar();
		System.out.println("Nossa, escala de forma bem radical:");
		ninja.escalar();
		System.out.println("E dorme como um gaitnho normal:");
		ninja.dormir();
	}

}
