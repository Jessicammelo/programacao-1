package AtividadePreparacao;

public class Comercial extends Telefone{

	protected String RamoAtividade;
	protected float custoFixo;
	
	

	public float getCustoFixo() {
		return custoFixo;
	}

	public void setCustoFixo(float custoFixo) {
		this.custoFixo = custoFixo;
	}

	public String getRamoAtividade() {
		return RamoAtividade;
	}

	public void setRamoAtividade(String ramoAtividade) {
		RamoAtividade = ramoAtividade;
	}
	
	
}
