package exercicio13;

import javax.swing.JOptionPane;

public class Estoque {

	private int codigo;
	private double valor;
	private int quant;
	
	public Estoque() {
		
	}
	public Estoque(int quant) {
		setQuant(quant);
	}
	
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	//Este  método  não  retoma  valor  e  deverá  receber  como parâmetro 
	//a  quantidade  de  produtos  a serem  somados  ao  total  do  atributo  
	//quantidade.  Este  método  não  fará  nada  quando  o  valor  do parâmetro for menor ou igual a zero. 
	
	public int adicionarProduto(int quant) {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de produtos:"));
		
	}
			
		//Este  método  deverá  retomar  verdadeiro/false  e  receber  um  parâmetro  inteiro.
		//Será  retornado TRUE caso existam produtos disponíveis ou FALSE em caso contrário. 
		//A existência de produtos disponíveis significa que o atributo tem quantidade é maior que 0 e 
		//maior ou igual ao parâmetro recebido.
		public boolean verificarDisponibilidade(int quant) {
			boolean temProduto;
			if(quant > 0) {
				temProduto = true;
				JOptionPane.showMessageDialog(null,"true: 'Tem produto disponível'");
			}else {
				temProduto = false;
				JOptionPane.showMessageDialog(null,"False: 'Não tem produto disponível'");
			}
			return temProduto;
			
		}
		
		
		//Este método retorna verdadeiro/false e deverá receber como parâmetro a quantidade de produtos
		//a serem retirados. Antes de fazer a retirada do estoque, deve-se verificar se há disponibilidade
		//do produto  solicitado.  Caso  tenha,  poderá  diminuir  do  atributo  quantidade  o  valor  recebido
		//como parametro. Este método deverá retornar TRUE, caso tenha sucesso na retirada dos produtos.
		//Caso contrário, retomar FALSE. 
		public boolean retirarProduto(int quant) {
			int quantProdutoRetirado = Integer.parseInt(JOptionPane.showInputDialog("digite quantidade de produtos que serão retirados:"));
			if(quant > 0) {
				 double total = quant - quantProdutoRetirado;
				 JOptionPane.showMessageDialog(null,"Retirada realizada com sucesso");
				 return total > 0;
			}
			return false;
	}
}
