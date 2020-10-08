package poo.lista.questao6;

import java.util.Scanner;

public class macacoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do macaco 1: ");
		macaco m1 = new macaco(scan.nextLine());
		System.out.println("Digite o nome do macaco 2: ");
		macaco m2 = new macaco(scan.nextLine());
		
		System.out.println("Macaco 1: " + m1.getNome());
		System.out.println("Macaco 2: " + m2.getNome());
		
		System.out.println("Macaco com fome, bucho = " + m1.verBucho());
		System.out.println("Macaco 1 come? ");
		m1.comer(scan.nextLine());
		System.out.println("Bucho do macaco 1: " + m1.verBucho());
		m1.digerir();
		System.out.println("Bucho do macaco 1: " + m1.verBucho());
		
		scan.close();
	}

}
