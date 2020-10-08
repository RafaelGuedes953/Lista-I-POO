package poo.lista.questao8;

import java.util.Scanner;

public class carroMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op;
		
		System.out.println("Digite o consumo km/L do carro: ");
		carro myCar = new carro(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Selecione uma quantidade inicial de combustível: ");
		myCar.adicionarGas(Double.parseDouble(scan.nextLine()));
		
		do {
			myCar.menuCar();
			op = scan.nextInt();
			switch(op) {
				case 1: //Adicionar gasolina
					System.out.println("Digite a quantidade desejada (em litros): ");
					myCar.adicionarGas(scan.nextDouble());
					break;
				case 2: //Andar por km
					System.out.println("Digite a distância percorrida: ");
					myCar.andar(scan.nextDouble());
					break;
				case 3: //info
					myCar.getInfo();
					break;
				case 0:
					System.out.println("O carro foi desligado!!!");
					break;
				default:
					System.out.println("Opção indisponível! Tente novamente!");
			}
		} while(op!=0);
		
		
		
		myCar.andar(35);
		
		scan.close();
	}

}
