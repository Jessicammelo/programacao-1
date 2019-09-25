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
	
	//Este  m�todo  n�o  retoma  valor  e  dever�  receber  como par�metro 
	//a  quantidade  de  produtos  a serem  somados  ao  total  do  atributo  
	//quantidade.  Este  m�todo  n�o  far�  nada  quando  o  valor  do par�metro for menor ou igual a zero. 
	
	public int adicionarProduto(int quant) {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de produtos:"));
		
	}
			
		//Este  m�todo  dever�  retomar  verdadeiro/false  e  receber  um  par�metro  inteiro.
		//Ser�  retornado TRUE caso existam produtos dispon�veis ou FALSE em caso contr�rio. 
		//A exist�ncia de produtos dispon�veis significa que o atributo tem quantidade � maior que 0 e 
		//maior ou igual ao par�metro recebido.
		public boolean verificarDisponibilidade(int quant) {
			boolean temProduto;
			if(quant > 0) {
				temProduto = true;
				JOptionPane.showMessageDialog(null,"true: 'Tem produto dispon�vel'");
			}else {
				temProduto = false;
				JOptionPane.showMessageDialog(null,"False: 'N�o tem produto dispon�vel'");
			}
			return temProduto;
			
		}
		
		
		//Este m�todo retorna verdadeiro/false e dever� receber como par�metro a quantidade de produtos
		//a serem retirados. Antes de fazer a retirada do estoque, deve-se verificar se h� disponibilidade
		//do produto  solicitado.  Caso  tenha,  poder�  diminuir  do  atributo  quantidade  o  valor  recebido
		//como parametro. Este m�todo dever� retornar TRUE, caso tenha sucesso na retirada dos produtos.
		//Caso contr�rio, retomar FALSE. 
		public boolean retirarProduto(int quant) {
			int quantProdutoRetirado = Integer.parseInt(JOptionPane.showInputDialog("digite quantidade de produtos que ser�o retirados:"));
			if(quant > 0) {
				 double total = quant - quantProdutoRetirado;
				 JOptionPane.showMessageDialog(null,"Retirada realizada com sucesso");
				 return total > 0;
			}
			return false;
	}
}
