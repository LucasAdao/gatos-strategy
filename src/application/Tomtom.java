package application;

import acoes.Acoes;
import acoes.AcoesDesastrado;

public class Tomtom {

	public static void main(String[] args) {
		Acoes desastrado = new AcoesDesastrado();
		
		System.out.println("Tomtom, o gato da dona Gisele, é muito desastrado.");
		
		System.out.println("Quando Tomtom corre, todo mundo percebe:");
		desastrado.correr();
		System.out.println("Tomtom mia, e todo mundo sabe que ele está ali:");
		desastrado.miar();
		System.out.println("Tomtom só come e dorme, logo escala assim:");
		desastrado.escalar();
		System.out.println("E dorme como uma pedra, como uma pedra que grita:");
		desastrado.dormir();
	}

}
