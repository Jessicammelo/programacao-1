package Questao01;

public class AlunoGraduacao extends Aluno{

	
	private int fase;
	
	public AlunoGraduacao(String nome, String curso, int fase) {
		super(nome,curso);
		setFase(fase);
	}

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}
	
	public String exibirDados() {// filho tbm tem que ter o exibir dados e tem que ser o mesmo nome
		return "Nome: " + getNome() + "\nCurso: " + getCurso() + "\nFase: " + getFase();
	}
}
