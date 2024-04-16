package exerciciosppo;

public class Cadeira {
	private String material;
	private int pernas;
	private boolean braços;

	public Cadeira(String material, int pernas, boolean braços) {
		this.material = material;
		this.pernas = pernas;
		this.braços = braços;
	}

	public void sentar() {
		System.out.println("Alguém sentou na cadeira.");
	}
}
