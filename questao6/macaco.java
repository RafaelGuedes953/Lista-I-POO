package poo.lista.questao6;

public class macaco {
	private String nome, bucho; private macaco buchoCheio;
	private boolean canibal=false;
	
	public macaco(String n) {
		nome = n;
		bucho = "vazio";
	}
	
	public String getNome() {
		return nome;
	}
	
	public macaco getBuchoCheio() {
		return buchoCheio;
	}
	
	public void comer(String comida) {
		bucho = comida;
	}
	
	public void comer(macaco comida) {
		buchoCheio = comida;
		bucho = buchoCheio.nome;
		canibal=true;
		//this.verBucho();
	}
	
	public String verBucho() {
		if(canibal==true) {
			System.out.println("Macaco "+this.nome+" virou canibal! Ele comeu o macaco "+this.bucho);
		}
		return bucho;
	}
	
	public void digerir() {
		bucho = "vazio";
	}

}
