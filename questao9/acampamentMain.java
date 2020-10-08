package poo.lista.questao9;

import java.util.Scanner;

public final class acampamentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome=scan.nextLine();
		
		acampamento a1 = new acampamento(nome,Integer.parseInt(scan.nextLine()));
		
		a1.separarGrupo();
		
		a1.getInfo();
		
		scan.close();
	}

}
