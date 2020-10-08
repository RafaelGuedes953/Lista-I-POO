package poo.lista.questao10;

public class apolice {
	private String nome;
	private int idade;
	private double premio;
	
	public apolice(String n, int i) {
		nome = n;
		idade = i;
	}
	
	public void imprimir() {
		System.out.println("\nInformações:");
		System.out.println("1 - Nome: " + nome);
		System.out.println("2 - Idade: " + idade);
		System.out.println("3 - Prêmio apolice: " + premio);
	}
	
	public void calcularPremio() {
		
	}
	
	public void ofercerDesc() {
		
	}

}
