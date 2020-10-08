package poo.lista.questao3;

public class pessoaMain {

	public static void main(String[] args) {
		int idade=17, i; double altura=1.5, peso=45.2; String nome="Rafael";
		
		
		pessoa eu = new pessoa(idade,peso,altura,nome);
		
		System.out.println("Peso inicial = "+eu.getPeso());
		eu.emagrecer(10);
		System.out.println("Peso-10 = " + eu.getPeso());
		eu.engordar(15);
		System.out.println("Peso+15 = " + eu.getPeso());
		
		System.out.println("Altura inicial = " + eu.getAltura());
		System.out.println("Idade inicial = " + eu.getIdade());
		eu.envelhecer(); //o envelhecimento acontece de 1 em 1 ano, cada vez que o método é chamado acrescenta 1 ano a idade da pessoa
		System.out.println("Idade atual = " + eu.getIdade());
		//a altura é alterada junto com a idade (+0,5cm)
		System.out.println("Altura atual = " + eu.getAltura());
		for(i=1;i<5;i++)
			eu.envelhecer();
		
		System.out.println("Nova idade = " + eu.getIdade());
		System.out.println("Nova altura = " + eu.getAltura());
		

	}

}
