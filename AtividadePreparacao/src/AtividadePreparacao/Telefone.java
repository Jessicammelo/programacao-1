package AtividadePreparacao;

import java.util.Date;
//J�ssica Maria de Melo e Danielle Fernanda Deola
public class Telefone {

	protected String nome;
	protected String endereco;
	protected Date dataInstalacao = new Date();
	protected String numero;
	protected Float valorBasico;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataInstalacao() {
		return dataInstalacao;
	}
	public void setDataInstalacao(Date dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Float getValorBasico() {
		return valorBasico;
	}
	public void setValorBasico(float valorBasico) {
		this.valorBasico = valorBasico;
	}
	
	
}
