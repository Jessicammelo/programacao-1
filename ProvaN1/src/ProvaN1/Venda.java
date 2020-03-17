package ProvaN1;

import java.util.ArrayList;


public class Venda{

	private int quantidade;
	private Produto produto;
	
	public Venda(int quantidade, Produto produto) {
		setQuantidade(quantidade);
		setProduto(produto);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double valorTotal() {
		int quantProdutos = 0;
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		for (Produto produto : produtos) {
			if (produto instanceof Produto) {
				quantProdutos++;
			}
		}
		return quantProdutos;
	}
}
