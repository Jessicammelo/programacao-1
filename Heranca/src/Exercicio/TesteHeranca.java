package Exercicio;

import java.util.ArrayList;

public class TesteHeranca {

	public static void main(String[] args) {

		//ProfDE profDe = new ProfDE("Maria", 8000);
		//System.out.println(profDe);

		//ProfHorista profHorista = new ProfHorista("Pedro ", 20, 154);
		//System.out.println(profHorista);
		
		//Professor prof1 = new ProfDE("Judas", 6666);
		//System.out.println(prof1);

		ArrayList<Professor> professores = new ArrayList<Professor>();
		for(Professor p : professores) {
			//faça o instanceof pq a classe professor não tem o metodo getSalario();
			if( p instanceof ProfDE) {
				ProfDE pDE = (ProfDE)p;
				System.out.println("pde: " + pDE.getSalario());
			}else {
				ProfHorista pH = (ProfHorista)p;
				System.out.println("ph: " + pH.getSalario());
			}
		}
		
//		ArrayList professores = new ArrayList();
//		professores.add(profDe);
//		professores.add(profHorista);
//
//		for (int i = 0; i < professores.size(); i++) {
//			if (professores.get(i) instanceof ProfDE) {
//				ProfDE umProfDE = (ProfDE) professores.get(i);
//				System.out.println(umProfDE.getSalario());
//			}else {
//				ProfHorista umProfHorista = (ProfHorista)professores.get(i);
//				System.out.println(umProfHorista.getSalario());
//			}
//
//		}
	}

}
