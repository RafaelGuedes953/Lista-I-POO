package poo.lista.questao1;

public class bola {
	private String cor, material;
	private double circ;
	
	public void trocaCor(String corNova) {
		this.cor = corNova;
	}
	
	public void mostraCor() {
		System.out.println("Cor atual da bola: " + cor);
	}
	
	public void setMaterial(String matNovo) {
		this.material = matNovo;
	}
	
	public void getMaterial() {
		System.out.println("Material da bola: " + material);
	}

	public void setCirc(double circA) {
		this.circ = circA;
	}
	
	public void getCirc() {
		System.out.println("Material da bola: " + circ);
	}
}
