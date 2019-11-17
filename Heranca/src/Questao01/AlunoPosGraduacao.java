package Questao01;

public class AlunoPosGraduacao extends Aluno {

	private int posComp;

	public AlunoPosGraduacao(String nome, String curso, int posComp) {
		super(nome, curso);
		setPosComp(posComp);
	}

	public int getPosComp() {
		return posComp;
	}

	public void setPosComp(int posComp) {
		this.posComp = posComp;
	}

	public String exibirDados() {
		return "Nome: " + getNome() + "\nCurso: " + getCurso() + "\nPosComp: " + getPosComp();
	}
}
