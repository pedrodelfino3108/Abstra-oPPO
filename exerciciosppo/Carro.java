package exerciciosppo;

public class Carro {
	private String modelo;
	private String cor;
	private int ano;
	private boolean ligado;

	public Carro(String modelo, String cor, int ano) {
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.ligado = false;
	}

	public void ligar() {
		this.ligado = true;
		System.out.println("Carro ligado.");
	}

	public void desligar() {
		this.ligado = false;
		System.out.println("Carro desligado.");
	}

	public void acelerar() {
		if (ligado) {
			System.out.println("Carro acelerando...");
		} else {
			System.out.println("O carro precisa estar ligado para acelerar.");
		}
	}
}
