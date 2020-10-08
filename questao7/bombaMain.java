package poo.lista.questao7;

import java.util.Scanner;

public class bombaMain {

	public static void main(String[] args) {
		int op; double valor;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um tipo de combustível: ");
		bombaCombustivel bomb = new bombaCombustivel(scan.nextLine());
		System.out.println("Digite valor para quantidade: ");
		bomb.alteraQtd(Double.parseDouble(scan.nextLine()));
		System.out.println("Digite preço do litro: ");
		bomb.mudaPreco(Double.parseDouble(scan.nextLine()));
		
		do {
			bomb.menuBomba();
			op = scan.nextInt();
			switch(op) {
				case 1: //por litro
					System.out.println("Digite a quantidade desejada (em litros): ");
					valor = bomb.abastecerPlitro(scan.nextDouble());
					System.out.println("Valor a pagar: R$ " + valor);
					break;
				case 2: //por preço
					System.out.println("Digite a quantidade desejada (em reais): ");
					valor = bomb.abastecerPpreco(scan.nextDouble());
					if(valor>0)
						System.out.println("Valor abastecido: " + valor + " L");
					break;
				case 3: //info
					bomb.getInfo();
					break;
				case 0:
					System.out.println("A bomba foi encerrada!!!");
					break;
				default:
					System.out.println("Opção indisponível! Tente novamente!");
			}
			
		} while(op!=0);
		
		scan.close();
	}

}
