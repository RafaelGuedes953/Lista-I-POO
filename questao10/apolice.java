package poo.lista.questao10;

public class apolice {
	private String nome;
	private int idade;
	private double premio;
	
	public apolice(String n, int i, double p) {
		nome = n;
		idade = i;
		premio = p;
	}
	
	public void imprimir() {
		System.out.println("\nInformações:");
		System.out.println("1 - Nome: " + nome);
		System.out.println("2 - Idade: " + idade);
		System.out.println("3 - Prêmio apolice: " + premio);
	}
	
	public void calcularPremio() {
		if (idade>=18 && idade<=25)
			premio+=premio*0.20;
		if (idade>25 && idade<=36)
			premio+=premio*0.15;
		if (idade>36)
			premio+=premio*0.10;
		if (idade<18 || idade>105)
			System.out.println("Premio mantido!!!");
		
		System.out.println("Valor prêmio: " + premio);
	}
	
	public void ofercerDesc(String cidade) {
		if (cidade.equals("Manaus"))
			premio-=premio*0.25;
		else
			if (cidade.equals("São Paulo"))
				premio-=premio*0.15;
			else
				if (cidade.equals("Curitiba"))
					premio-=premio*0.10;
				else
					if (cidade.equals("Rio de Janeiro"))
						premio-=premio*0.05;
					else
						System.out.println("Desconto não aplicado!!!\n");
		
		System.out.println("Prêmio atualizado: " + premio);
	}

}
