package Exercicios;


public class TestePedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente umCliente = new Cliente("Maria");
		Produto umProduto = new Produto("X salada", 15.0);
		Itens umItem = new Itens(umProduto,3);
		Pedido umPedido = new Pedido(1, umCliente);
		
		umPedido.adicionarItem(umItem);
		System.out.println(umPedido);
	}
	
	

}
