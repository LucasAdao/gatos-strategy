package application;

import acoes.Acoes;
import acoes.AcoesCautela;

public class Cicinho {

	public static void main(String[] args) {
		Acoes cautela = new AcoesCautela();
		
		System.out.println("Este é Cicinho o gatinho quietinho!");
		
		System.out.println("É assim que cicinho corre:");
		cautela.correr();
		System.out.println("Quando cicinho mia, quase nem da para perceber:");
		cautela.miar();
		System.out.println("Cicinho também escala muito bem:");
		cautela.escalar();
		System.out.println("Quando cicinho está dormindo, quase ninguém percebe:");
		cautela.dormir();
	}

}
