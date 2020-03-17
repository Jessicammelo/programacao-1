package ProvaN1;
//jessica melo
public class Estabelecimento {
//deveria ter feito extends
	private int codigo;
	private String descricao;
	private String endereco;
	private HistoricoVenda historicoVenda;
	
	public Estabelecimento(int codigo, String descricao,String endereco, HistoricoVenda historicoVenda) {
		setCodigo(codigo);
		setDescricao(descricao);
		setEndereco(endereco);
		setHistoricoVenda(historicoVenda);
	}

	public HistoricoVenda getHistoricoVenda() {
		return historicoVenda;
	}

	public void setHistoricoVenda(HistoricoVenda historicoVenda) {
		this.historicoVenda = historicoVenda;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	
}
