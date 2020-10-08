package poo.lista.questao4;

import java.util.Scanner;

public class contaMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome; int cont=2345; double valor;
		
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
				
		contaCorrente conta = new contaCorrente(cont, nome);
		
		System.out.println("Nome atual cadastrado: " + conta.getNome());
		//atualiza nome
		System.out.println("Atualize seu nome: ");
		nome = scan.nextLine();
		conta.mudaNome(nome);
		System.out.println("Nome atualizado: " + conta.getNome());
		
		//realizando depósito
		System.out.println("Digite um valor para depósito: ");
		valor = Double.parseDouble(scan.nextLine());
		conta.deposito(valor);
		//valor pós depósito
		System.out.println("Saldo atual: " + conta.getSaldo());
		
		//realizando saque
		System.out.println("Digite o valor do saque: ");
		valor = Double.parseDouble(scan.nextLine());
		conta.saque(valor);
		//valor pós saque
		System.out.println("Saldo atual: " + conta.getSaldo());
		
		scan.close();
	}

}
