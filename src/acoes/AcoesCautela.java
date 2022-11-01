package acoes;

public class AcoesCautela implements Acoes {

	@Override
	public void correr() {
		System.out.println("Corre atentamente, de pontinha dos pés");
		
	}

	@Override
	public void dormir() {
		System.out.println("zzz");
		
	}

	public void escalar() {
		System.out.println("Escala de pontinha dos pés, bem rápido");
		
	}

	@Override
	public void miar() {
		System.out.println("Mew, mew, miau");
		
	}

}
