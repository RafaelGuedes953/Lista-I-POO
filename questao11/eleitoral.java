package poo.lista.questao11;

public class eleitoral {
	private String nome; 
	private int idade;
	
	public eleitoral(String n, int i) {
		nome = n;
		idade = i;
	}
	
	public void imprimir() {
		System.out.println("\nInformações:");
		System.out.println("1 - Nome: " + nome);
		System.out.println("2 - Idade: " + idade);
	}
	
	public void verificar() {
		if(idade<16)
			System.out.println("\nCidadão não pode votar!!!");
		if(idade>=16 && idade<18)
			System.out.println("\nEleitor pode votar!!!");
		if(idade>=18 && idade<65)
			System.out.println("\nEleitor deve votar!!!");
		if (idade>=65)
			System.out.println("\nVoto facultativo!!!");
	}

}
