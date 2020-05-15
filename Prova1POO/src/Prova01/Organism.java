package Prova01;
//Jéssica Maria de Melo e Danielle Fernanda Deola
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Organism {

	private String name;
	private boolean alive;
	private ArrayList<Cell> cells = new ArrayList<Cell>();

	public Organism(String name) {
		if (name == null || "".equals(name) || name.isEmpty()) {
			throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
		}
		setName(name);
	}

	private void excecao() {
		if (isAlive()) {
			throw new IllegalArgumentException("A célula está morta!");
		}
	}

	public String getName() {
		excecao();
		return name;
	}

	public void setName(String name) {
		excecao();
		this.name = name;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		excecao();
		this.alive = alive;
	}

	public int getHealthDegree() {
		List<Cell> cellVirus = this.cells.stream().filter(cell -> cell.isInfected()).collect(Collectors.toList());
		if (cellVirus.size() == 0) {
			return 10;
		}
		float porcent = (cellVirus.size() * 100) / this.cells.size();
		if (porcent <= 10) {
			return 8;
		} else if (porcent < 30) {
			return 6;
		} else if (porcent < 50) {
			return 4;
		} else if (porcent < 70) {
			return 2;
		}
		this.alive = false;
		return 0;

	}

	public void timeToCellsCycle() throws Exception {
		excecao();
		for (Cell c : this.cells) {
			Cell cell = c.act();
			if (cell != null) {
				this.cells.add(cell);
			}
		}
	}

	public void addCell(Cell c) {
		excecao();
		this.cells.add(c);
	}
}
