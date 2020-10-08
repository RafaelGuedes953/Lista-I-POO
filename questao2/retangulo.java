package poo.lista.questao2;

public class retangulo {
	private int x, y;
	
	public void setLados(int ladoA, int ladoB) {
		this.x = ladoA; this.y = ladoB;
	}
	
	private int getLadoA() {
		return x;
	}
	
	private int getLadoB() {
		return y;
	}
	
	public int calcArea() {
		return getLadoA()*getLadoB();
	}
	
	public int calcPerim() {
		return (2*getLadoA())+(2*getLadoB());
	}

}
