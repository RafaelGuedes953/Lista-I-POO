package poo.lista.questao4;

public class contaCorrente {
	private int nConta;
	private String nome;
	private double saldo;
	
	public contaCorrente(int c, String n) {
		nConta = c;
		nome = n;
		saldo = 0;
	}
	
	public contaCorrente(int c, String n, double s) {
		nConta = c;
		nome = n;
		saldo = s;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	private void dwSaldo(double v) {
		saldo-=v;
	}
	
	private void upSaldo(double v) {
		saldo+=v;
	}
	
	public void mudaNome(String n) {
		nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getConta() {
		return nConta;
	}
	
	public void saque(double valor) {
		if(valor<getSaldo())
			dwSaldo(valor);
		else
			System.out.println("Valor indisponível!!! ");
	}
	
	public void deposito(double valor) {
		upSaldo(valor);
	}

}
