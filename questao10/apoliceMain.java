package poo.lista.questao10;

import java.util.Scanner;

public class apoliceMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); Scanner scanNum = new Scanner(System.in);
		String temp; int idade; double premio;
		
		System.out.println("Digite seu nome: ");
		temp = scan.nextLine();
		System.out.println("Digite sua idade: ");
		idade = scanNum.nextInt();
		System.out.println("Digite o preço: ");
		premio = scanNum.nextDouble();
		
		apolice a1 = new apolice(temp, idade, premio);
		
		a1.imprimir();
		a1.calcularPremio();
		
		System.out.println("Digite sua cidade: ");
		temp = scan.nextLine();
		a1.ofercerDesc(temp);
		
		a1.equals(a1);
		
		scan.close();
		scanNum.close();
	}

}
