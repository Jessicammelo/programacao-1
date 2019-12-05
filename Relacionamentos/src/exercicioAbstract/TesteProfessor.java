package exercicioAbstract;

import java.util.ArrayList;

public class TesteProfessor {

	public static void main(String[] args) {
		Professor umProfessor;
		ProfessorDE umProfDE = new ProfessorDE();
		ProfHorista umProfHo = new ProfHorista();
		
		ArrayList<Professor> professores = new ArrayList<Professor>();
		professores.add(umProfDE);
		professores.add(umProfHo);
		for(Professor p : professores) {
			System.out.println(p.getSalario());
		}
	}
}
