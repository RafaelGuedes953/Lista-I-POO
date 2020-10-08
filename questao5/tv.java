package poo.lista.questao5;

public class tv {
	private int nCanal, volume;
	
	public tv() {
		nCanal = 22;
		volume = 25;
	}
	
	public void mudarCn(int canal) {
		if(canal>0 && canal<100)
			nCanal = canal;
		else
			System.out.println("Canal indisponível!!!");
	}
	
	public int getCn() {
		return nCanal;
	}
	
	private int getVol() {
		return volume;
	}
	
	public void aumVol() {
		if(volume<100)
			volume+=1;
		else
			System.out.println("Volume máximo alcançado!!!");
		
		System.out.println("Volume atual: "+getVol());
	}
	
	public void dimVol() {
		if(volume>0)
			volume-=1;
		else
			System.out.println("Volume mínimo alcançado!!!");
		
		System.out.println("Volume atual: "+getVol());
	}
	
	public void menuTv() {
		System.out.println("1 - Mudar de canal; ");
		System.out.println("2 - Aumentar volume; ");
		System.out.println("3 - Diminuir volume; ");
		System.out.println("Digite uma opção: ");
	}

}
