package Exercicios;

public class Itens {

	//1° definição associação
	private Produto umProduto;
	private int quantidade;
	
	public Itens(Produto umProduto, int quantidade) {
		setUmProduto(umProduto);
		setQuantidade(quantidade);
		
	}

	public Produto getUmProduto() {
		return umProduto;
	}

	public void setUmProduto(Produto umProduto) {
		this.umProduto = umProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	 public double calcularItem() {
		 //preco unitario produto * quant
		 return getUmProduto().getPrecoUnitario() * getQuantidade();
	}
	public String toString() {
		return getUmProduto() + "\nQuantidade: " + getQuantidade() + "\nTotal: " + calcularItem(); 
	}
}
