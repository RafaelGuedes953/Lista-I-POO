package poo.lista.questao3;

public class pessoa {
	private int idade; 
	private double peso, altura;
	private String nome;
	
	public pessoa(int i, double p, double a, String n) { //classe construtora
		this.idade = i;
		this.peso = p;
		this.altura = a;
		this.nome = n;
	}
	
	private void crescer() { //método utilizado pelo método envelhecer
		this.altura +=0.05;
	}
	
	public void engordar(double aum) {
		this.peso += aum;
	}
	
	public void emagrecer(double dim) {
		this.peso -= dim;
	}
	
	public void envelhecer() {
		if(idade<21)
			crescer();
		this.idade +=1;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}
