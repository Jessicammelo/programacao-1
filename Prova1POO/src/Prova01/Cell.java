package Prova01;
//Jéssica Maria de Melo e Danielle Fernanda Deola
import java.util.Random;

public class Cell {

	private boolean alive;
	private Virus virus;
	
	public Cell() {
		
	}
	
	public Cell(Virus v) {
		this.virus = v;
	}

	public boolean isAlive() {
		return alive;
	}

	public Virus getVirus() {
		return virus;
	}
	
	public Cell act() throws Exception {
		Random gerador = new Random();
		int numero = gerador.nextInt();
		if (numero <= 5) {
			return null;
		}else if (numero <=8) {
			if (this.getVirus() == null) {
				return new Cell();
			}else {
				return new Cell(new Virus(this.getVirus().getRNA()));
			}
		}
		this.alive = false;
		return null;
	}
	
	public boolean infect( Virus virus) {
		Random gerador = new Random();
		int randomNum = gerador.nextInt((1 - 10) + 1) + 1;
		if ( randomNum >3 ) {
			this.virus = virus;
			return true;
		}
		return false;
	}
	
	public boolean isInfected() {
		return this.getVirus() != null;
	}
}
