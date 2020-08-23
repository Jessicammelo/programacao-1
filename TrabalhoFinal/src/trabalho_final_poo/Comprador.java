package trabalho_final_poo;

import java.util.ArrayList;

public class Comprador extends PessoaFisica {
	private ArrayList<Venda> compras = new ArrayList<>();

	public Comprador() {
	}

	public ArrayList<Venda> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Venda> compras) {
		this.compras = compras;
	}

}
