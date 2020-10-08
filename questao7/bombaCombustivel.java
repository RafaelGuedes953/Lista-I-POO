package poo.lista.questao7;

public class bombaCombustivel {
	private String tipo;
	private double precoL, qtdL;
	
	public bombaCombustivel(String t) {
		tipo = t; precoL = 0; qtdL = 0;
	}
	
	private double getPreco() {
		return precoL;
	}
	
	private double getQtd() {
		return qtdL;
	}
	
	private String getTipo() {
		return tipo;
	}
	
	public void alteraTipo(String t) {
		tipo = t;
	}
	
	public void mudaPreco(double novo) { //altera preço do litro
		precoL = novo;
	}
	
	public void alteraQtd(double novo) { //altera quantidade restante na bomba
		qtdL = novo;
	}
	
	public double abastecerPlitro(double n) {
		if(n>0 && n<getQtd()) {
			qtdL-=n;
			return n*precoL;
		}
			
		else
			System.out.println("Valor indisponível nessa bomba!!!");
		return 0;
	}
	
	public double abastecerPpreco(double n) {
		double v=n/getPreco();
		if(n>0 && v<getQtd()) {
			alteraQtd(getQtd()-v);
			return v;
		}
		else
			System.out.println("Você tentou abastecer " + v + " L, valor indisponível\nValor na bomba: " + getQtd());
		return 0;
	}
	
	public void getInfo() {
		System.out.println("\nValores atuais disponíveis:");
		System.out.println("1 - Preço do litro: R$ " + getPreco());
		System.out.println("2 - Quantidade: " + getQtd() + " L");
		System.out.println("3 - Tipo: " + getTipo());
	}
	
	public void menuBomba() {
		System.out.println("\n1 - Abastecer por litro; ");
		System.out.println("2 - Abastecer por preço; ");
		System.out.println("3 - Visualizar informações; ");
		System.out.println("Digite uma opção: ");
	}

}
