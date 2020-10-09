package poo.lista.questao6;

import java.util.Scanner;

public class macacoMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i; String comida;
		
		System.out.println("Digite o nome do macaco 1: ");
		macaco m1 = new macaco(scan.nextLine());
		System.out.println("Digite o nome do macaco 2: ");
		macaco m2 = new macaco(scan.nextLine());
		
		System.out.println("Macaco 1: " + m1.getNome());
		System.out.println("Macaco 2: " + m2.getNome());
		
		for(i=0;i<4;i++) {
			System.out.println("Macaco "+m1.getNome()+" come? ");
			comida = scan.nextLine();
			if(comida.equals(m2.getNome()))
				m1.comer(m2);
			else
				m1.comer(comida);
			
			if(m2.equals(m1.getBuchoCheio())) {
				m1.verBucho();
				System.out.println("O macaco " +m2.getNome()+ " já era!!!");
				break;
			}
			
			System.out.println("Macaco "+m2.getNome()+" come? ");
			comida = scan.nextLine();
			if(comida.equals(m1.getNome()))
				m2.comer(m1);
			else
				m2.comer(comida);
			
			if(m1.equals(m2.getBuchoCheio())) {
				m2.verBucho();
				System.out.println("O macaco " +m1.getNome()+ " já era!!!");
				break;
			}
			
			m1.digerir();
			System.out.println("Bucho do "+m1.getNome() + " está " + m1.verBucho());
			m2.digerir();
			System.out.println("Bucho do "+m2.getNome() + " está " + m2.verBucho());
		}
		
		scan.close();

	}

}
