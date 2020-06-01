package Lista04;

import java.time.LocalDate;

import javax.tools.JavaFileManager.Location;

//não tem mais como criar objeto de aluno
public abstract class Aluno{

	private String nome;
	private LocalDate dataNascimento;
	
	
	public Aluno(String nome, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	//destrutor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Passou pelo aluno: " + this.nome);
		super.finalize();
	}

	public abstract String mostra();
		
	

	public int getIdade() {
		return LocalDate.now().getYear() - this.dataNascimento.getYear();
		
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
	
	
	
	
	
	
}
