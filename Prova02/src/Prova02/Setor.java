package Prova02;

import java.util.ArrayList;

public class Setor {

	private int codigo;
	private String descricao;
	private ArrayList<Funcionario> funcionarios; 
	
	public Setor(int codigo, String descricao) {
		setCodigo(codigo);
		setDescricao(descricao);
		funcionarios = new ArrayList<Funcionario>();
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
	
	public void adicionarFuncionario(Funcionario umFuncionario) {
		funcionarios.add(umFuncionario);
	}
	
	public ArrayList<Funcionario> getFuncionarios(){
		return funcionarios;
	}
	
}
