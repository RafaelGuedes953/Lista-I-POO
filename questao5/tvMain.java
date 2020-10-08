package poo.lista.questao5;

import java.util.Scanner;

public class tvMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op, canal;
		tv minhaTv = new tv();
		
		do {
			minhaTv.menuTv();
			op = scan.nextInt();
			switch(op) {
				case 1:
					System.out.println("*****	Canal atual: " + minhaTv.getCn() + "	*****");
					System.out.println("Digite o canal desejado: ");
					canal = scan.nextInt();
					minhaTv.mudarCn(canal);
					break;
				case 2:
					minhaTv.aumVol();
					break;
				case 3:
					minhaTv.dimVol();
					break;
				case 0:
					System.out.println("A Tv foi desligada, até a próxima!!!");
					break;
				default:
					System.out.println("Opção indisponível! Tente novamente!");
			}
			
		} while(op!=0);
		
		scan.close();
	}

}
