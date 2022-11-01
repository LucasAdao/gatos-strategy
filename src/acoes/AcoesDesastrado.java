package acoes;

public class AcoesDesastrado implements Acoes {

	@Override
	public void correr() {
		System.out.println("Corre derrubando tudo,sempre quebra um copo.");
		
	}

	@Override
	public void dormir() {
		System.out.println("zZzzZZZZZZZZZZ MIEW ZZZZZZ MIEWWW");
		
	}

	public void escalar() {
		System.out.println("Quase não consegue escalar por conta do peso, mas escala");
		
	}

	@Override
	public void miar() {
		System.out.println("RARRWRWR RWARWAR  RWARWRW MIAUUUUUUUU RWRAWR");
		
	}

}
