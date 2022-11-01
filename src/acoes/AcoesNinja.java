package acoes;

public class AcoesNinja implements Acoes {

	@Override
	public void correr() {
		System.out.println("usa o shunpo, já aparece no lugar");
		
	}

	@Override
	public void dormir() {
		System.out.println("ZzZzZzZzZ");
		
	}

	public void escalar() {
		System.out.println("Coloca chakra nos pés e escala");
		
	}

	@Override
	public void miar() {
		System.out.println("Dattebayo!");
		
	}

}
