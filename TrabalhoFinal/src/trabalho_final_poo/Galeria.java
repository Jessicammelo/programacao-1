package trabalho_final_poo;

import java.util.HashMap;

public class Galeria {
	private HashMap<String, ObraDeArte> acervo = new HashMap<>();
	
	public Galeria() {
	}

	public HashMap<String, ObraDeArte> getAcervo() {
		return acervo;
	}

	public void setAcervo(HashMap<String, ObraDeArte> acervo) {
		this.acervo = acervo;
	}
	
	public void addObraDeArte(ObraDeArte obraDeArte) {
		this.acervo.put(obraDeArte.getTitulo(), obraDeArte);
	}
}
