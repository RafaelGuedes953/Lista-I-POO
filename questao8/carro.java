package poo.lista.questao8;

public class carro {
	private int consumo;
	private double qtdComb;
	
	public carro(int c) {
		consumo = c;
		qtdComb = 0;
	}
	
	public void adicionarGas(double valor) {
		if(valor>0 && qtdComb<70)
			qtdComb+=valor;
		else
			System.out.println("Valor inválido ou tanque cheio!!!\n");
	}
	
	public double obterGas() {
		return qtdComb;
	}
	
	public void andar(double km) {
		qtdComb-=km/consumo;
		System.out.println("Disponibilidade do tanque: " + obterGas() + " L\n");
	}
	
	public void getInfo() {
		System.out.println("\nInformações do carro:");
		System.out.println("1 - Consumo: " + consumo + "/L");
		System.out.println("2 - Combustível atual: " + obterGas() + " L");
	}
	
	public void menuCar() {
		System.out.println("\n1 - Adicionar gasolina; ");
		System.out.println("2 - Andar; ");
		System.out.println("3 - Visualizar informações; ");
		System.out.println("Digite uma opção: ");
	}

}
