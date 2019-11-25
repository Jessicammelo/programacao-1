package Questao02;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
//Jessica Melo
public class TesteQuestao02 {

	public static void main(String[] args) {
		int parar = 1;
		ArrayList<Professor> dados = new ArrayList<Professor>();
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Digite 1 para artigo normal e 2 para artigo importante?");
			int tipo = teclado.nextInt();
			Artigo artigo = null;
			if (tipo == 1) {
				artigo = new Artigo("Aquecimento Global", "seis meses", new Date(), 'a');
			} else {
				artigo = new ArtigoImportante("Turismo", "\n2 meses", new Date(), 'b', 1);
			}
			System.out.println("Digite 0 para parar ou 1 para continuar: ");
			parar = teclado.nextInt();
			Professor umProfessor = new Professor("Alberto Silva", "Economia", artigo);
			dados.add(umProfessor);
		} while (parar != 0);
		teclado.close();
		System.out.println(dados);

	}

}
