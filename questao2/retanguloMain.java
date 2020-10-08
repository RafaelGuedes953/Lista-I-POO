package poo.lista.questao2;

import java.util.Scanner;

public class retanguloMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		retangulo ret = new retangulo();
		int x, y;
		
		System.out.println("Digite o valor para a altura do retangulo: ");
		x = scan.nextInt();
		System.out.println("Digite o valor para a largura do retangulo: ");
		y = scan.nextInt();
		
		ret.setLados(x, y);
		
		System.out.println("Pisos = "+ret.calcArea()+" metros quadrados | Rodapé = "+ret.calcPerim()+" metros");

		scan.close(); //fechamento do objeto scanner
	}

}
