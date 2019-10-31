package Exercicios;

import java.util.ArrayList;

public class Pedido {

	private int nrPedido;
	private Cliente umCliente; // associação
	private ArrayList<Itens> itens;// = new ArrayList<Itens>();// composição

	public Pedido(int nrPedido, Cliente umCliente) {
		setNrPedido(nrPedido);
		setUmCliente(umCliente);
		setItens(new ArrayList<Itens>());
	}

	public int getNrPedido() {
		return nrPedido;
	}

	public void setNrPedido(int nrPedido) {
		this.nrPedido = nrPedido;
	}

	public Cliente getUmCliente() {
		return umCliente;
	}

	public void setUmCliente(Cliente umCliente) {
		this.umCliente = umCliente;
	}

	public ArrayList<Itens> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Itens> itens) {
		this.itens = itens;
	}

	public void adicionarItem(Itens umItem) {
		getItens().add(umItem);
	}
	
	public double calcularTotalPedidos() {
		double total = 0.0;
		for (Itens umItem : itens) {
			total += umItem.calcularItem();
		}
		return total;
	}

	public String toString() {
		String str = "Número do pedido: " + getNrPedido() + "\n" + getUmCliente() + "\n\n";
		
		for(Itens umItem : itens) {
			str += umItem + "\n";
		}
		
		return str + "\n\nTotal: " + calcularTotalPedidos();
	}
}
