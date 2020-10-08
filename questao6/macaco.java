package poo.lista.questao6;

public class macaco {
	private String nome, bucho;
	
	public macaco(String n) {
		nome = n;
		bucho = "vazio";
	}
	
	public String getNome() {
		return nome;
	}
	
	public void comer(String comida) {
		bucho = comida;
	}
	
	public String verBucho() {
		return bucho;
	}
	
	public void digerir() {
		bucho = "vazio";
	}

}
