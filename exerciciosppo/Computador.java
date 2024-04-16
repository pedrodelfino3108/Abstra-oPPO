package exerciciosppo;

public class Computador {
	private String sistema_operacional;
	private int RAM;
	private int HD;

	public Computador(String sistema_operacional, int RAM, int HD) {
		this.sistema_operacional = sistema_operacional;
		this.RAM = RAM;
		this.HD = HD;
	}

	public void ligar() {
		System.out.println("Computador ligando...");
	}

	public void executarPrograma(String programa) {
		System.out.println("Executando " + programa);
	}
}
