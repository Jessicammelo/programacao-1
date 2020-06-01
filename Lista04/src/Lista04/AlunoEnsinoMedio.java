package Lista04;

import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno{

	private int ano;
	
	
	
	public AlunoEnsinoMedio(String nome, LocalDate dataNascimento, int ano) {
		super(nome, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Destrutor de alunoensinomedio " + this.getNome());
		super.finalize();
	}

	public int getAno() {
		return ano;
	}



	public void setAno(int ano) throws IllegalAccessException {
		if(ano < 1 || ano > 3) {
			throw new IllegalAccessException("ano deve estar entre 1 e 3");
		}
		this.ano = ano;
	}



	



	@Override
	public String mostra() {
		// TODO Auto-generated method stub
		return this.getNome() + "esta cursando o "+ this.ano + "o ano do ensino medio e tem " + this.getIdade() + "anos";
	}




}
