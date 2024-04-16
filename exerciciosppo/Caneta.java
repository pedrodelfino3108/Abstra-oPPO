package exerciciosppo;

public class Caneta {
	private String cor;
	private float ponta;
	private boolean tampa;

	public Caneta(String cor, float ponta, boolean tampa) {
		this.cor = cor;
		this.ponta = ponta;
		this.tampa = tampa;
	}

	public void escrever(String texto) {
		if (!tampa) {
			System.out.println("Escrevendo: " + texto);
		} else {
			System.out.println("Erro: A caneta está tampada!");
		}
	}

	public void tampar() {
		this.tampa = true;
	}

	public void destampar() {
		this.tampa = false;
	}
}
