package exerciciosppo;

public class Celular {
    private String marca;
    private String sistemaOperacional;
    private int capacidadeBateria;

    public Celular(String marca, String sistemaOperacional, int capacidadeBateria) {
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
        this.capacidadeBateria = capacidadeBateria;
    }

    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }
}
