package exercicio13;

import javax.swing.JOptionPane;

public class PrincipalEstoque {

	public static void main(String[] args) {

		Estoque estoque = new Estoque();
		estoque.setQuant(20);
		estoque.adicionarProduto(estoque.getQuant());
		estoque.verificarDisponibilidade(estoque.getQuant());
		estoque.retirarProduto(estoque.getQuant());

		int codigo = 123;
		String descricao = "caderno";
		double valor = 15.00;
	}
}
