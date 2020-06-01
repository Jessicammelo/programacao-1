package Lista04;

import java.time.LocalDate;

public class AlunoUniversitario extends Aluno {

	private char formaDeIngresso;
	private Curso curso;

	public AlunoUniversitario(String nome, LocalDate dataNascimento, char formaDeIngresso, Curso curso) {
		super(nome, dataNascimento);
		this.formaDeIngresso = formaDeIngresso;
		this.curso = curso;
	}

	public char getFormaDeIngresso() {
		return formaDeIngresso;
	}

	public void setFormaDeIngresso(char formaDeIngresso) {
		if (formaDeIngresso == 'V' || formaDeIngresso == 'E' || formaDeIngresso == 'S' || formaDeIngresso == 'T'
				|| formaDeIngresso == 'I') {
			this.formaDeIngresso = formaDeIngresso;
		}

	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String mostra() {
		// João carlos é aluno universitario do curso de SIS engressado pelo Enem
		return this.getNome() + this.curso.getSigla() + this.curso.getNome() + this.getFormaDeIngresso();
	}

}
