package exer1;

public class Contribuinte {

	private String nome, uf, CPF;
	private float rendaAnual;
		
	public Contribuinte(String nome, String uf, String cPF, float rendaAnual) {
		super();
		this.setNome(nome);
		this.setUf(uf);
		this.setCPF(CPF);;
		this.setRendaAnual(rendaAnual);
	}
	public float getImpostoAPagar() {
		return this.rendaAnual * this.getAliquota();
	}
	
	public float getAliquota() {
		if (this.rendaAnual < 4001) {
			return 0;
		}
		if (this.rendaAnual < 9001) {
			return 0.058f;
		}
		if (this.rendaAnual < 25001) {
			return 0.15f;
		}
		if (this.rendaAnual < 35001) {
			return 0.275f;
		}
			return 0.3f;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		if (uf.equals("RS") || uf.equals("PR") || uf.equals("SC")) {
			this.uf = uf;
		}
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public float getRendaAnual() {
		return rendaAnual;
	}
	public void setRendaAnual(float rendaAnual) {
		if (rendaAnual >= 0) {
			this.rendaAnual = rendaAnual;
		}
		
	}
	
	
}
