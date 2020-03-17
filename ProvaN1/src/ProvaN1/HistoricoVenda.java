package ProvaN1;

public class HistoricoVenda {

	private int codigo;
	private int dia;
	private int mes;
	private Venda venda;
	
	public HistoricoVenda(int codigo,int dia, int mes, Venda venda) {
		setCodigo(codigo);
		setDia(dia);
		setMes(mes);
		setVenda(venda);
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	
	
}
