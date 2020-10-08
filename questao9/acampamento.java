package poo.lista.questao9;

public class acampamento {
	private String nome, equipe;
	private int idade;
	
	public acampamento(String n, int i) {
		nome = n;
		if(i>0 && i<90)
			idade = i;
	}
	
	public void separarGrupo() {
		if(idade>=6 && idade<=10)
			equipe="A";
		else {
			if(idade>=11 && idade<=20)
				equipe="B";
			else
				equipe="C";
		}
	}
	
	public void getInfo() {
		System.out.println("\nInformações:");
		System.out.println("1 - Nome: " + nome);
		System.out.println("2 - Idade: " + idade);
		System.out.println("3 - Equipe: " + equipe);
	}

}
