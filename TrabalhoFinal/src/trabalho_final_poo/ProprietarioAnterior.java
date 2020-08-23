package trabalho_final_poo;

import java.util.ArrayList;

public class ProprietarioAnterior extends PessoaFisica {
	private String nacionalidade;
	private ArrayList<ObraDeArte> obras = new ArrayList<>();
	
	public ProprietarioAnterior() {
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public ArrayList<ObraDeArte> getObras() {
		return obras;
	}

	public void setObras(ArrayList<ObraDeArte> obras) {
		this.obras = obras;
	}

}
