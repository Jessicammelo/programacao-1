package trabalhoPolimorfismo;
//Jessica Melo

public class Confronto {

	public int executar(SuperHeroi superheroi, Vilao vilao) {
		return superheroi.getPoderTotal() - vilao.getPoderTotal();
	}
}
