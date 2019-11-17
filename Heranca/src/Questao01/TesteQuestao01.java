package Questao01;

import java.util.ArrayList;

public class TesteQuestao01 {

	public static void main(String[] args) {
		AlunoGraduacao umAluno = new AlunoGraduacao("João", "SIS", 2);
		AlunoGraduacao doisAluno = new AlunoGraduacao("Jessica", "SIS", 2);
		
		AlunoPosGraduacao umAlunoPos = new AlunoPosGraduacao("Ronaldo", "Data Science", 40);
		AlunoPosGraduacao doisAlunoPos = new AlunoPosGraduacao("Ricardo", "Data Science", 40);
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(umAluno);
		alunos.add(doisAluno);
		alunos.add(umAlunoPos);
		alunos.add(doisAlunoPos);

		// for (Aluno aluno : alunos) {
		// if (aluno instanceof AlunoGraduacao) {
		// AlunoGraduacao graduacao = ((AlunoGraduacao) aluno);
		// System.out.println(graduacao.exibirDados());// ou
		// } else {
		// System.out.println(((AlunoPosGraduacao) aluno).exibirDados());
		// }
		// }
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.exibirDados());// o exibir dados está no pai Aluno
		}
	}

}
