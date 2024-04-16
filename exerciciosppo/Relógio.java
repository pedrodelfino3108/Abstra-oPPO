package exerciciosppo;

public class Relógio {
	private String marca;
	private String tipo;

	public Relógio(String marca, String tipo) {
		this.marca = marca;
		this.tipo = tipo;
	}

	public void mostrarHora() {
		System.out.println("Mostrando a hora atual...");
	}
}
