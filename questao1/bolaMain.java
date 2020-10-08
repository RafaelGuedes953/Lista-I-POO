package poo.lista.questao1;

import java.util.Scanner;

public class bolaMain {

	public static void main(String[] args) {
		bola nova = new bola();
		Scanner esc = new Scanner(System.in);
		String input; double input2;
		
		//editar e mostrar circunferência da bola
		System.out.println("Digite uma cor para a bola: ");
		input2 = Double.parseDouble(esc.nextLine());
		//input2 = esc.nextDouble();
		nova.setCirc(input2);
		nova.getCirc();
		
		//editar e mostrar material da bola
		System.out.println("Digite um material para a bola: ");
		input = esc.nextLine();
		nova.setMaterial(input);
		nova.getMaterial();
		
		//editar e mostrar cor da bola
		System.out.println("Digite uma cor para a bola: ");
		input = esc.nextLine();
		nova.trocaCor(input);
		nova.mostraCor();
		
		esc.close();

	}

}
