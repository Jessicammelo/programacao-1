package aula01;

import java.time.LocalDate;

public class Pessoa {

	//randle manipulador cooperar com o obj, envia mensagem
	private String nome;
	private LocalDate dataNascimento;
	private char sexo;
	private String estadoCivil = "solteiro";
	
	//o obj � responsavel pelo seu estado! em conseguencia do encapsulamento (que � a prote��o dos atributos)
	public Pessoa(String nome,LocalDate data,char sexo) {
		this.nome = nome;
		this.setSexo(sexo);
		this.dataNascimento = data;
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	//void n�o tem retorno
	public void setSexo(char valor) {
		if (valor =='F' || valor =='M' || valor=='X') {
			this.sexo = valor;
		}
				
	}
	public char getSexo() {
		return this.sexo;
	}
	
	public String toString() {
		String str = "Nome: " + getNome() + 
				"sexo: " + getSexo() + "data de nascimento: " + getDataNascimento() + 
				"estado civil: " + getEstadoCivil();
		
		return str;
	}
}