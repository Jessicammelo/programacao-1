package TrabalhoPratico01;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;

//nome: Jéssica Melo
//QUESTÃO1:Quais  são  os tipos  de relacionamentos  entre  classes  e  objetos? 
//Explique  como  se  identificaa  utilização  de cada um deles.
//Resposta:

public class Camara {
	public static void projetosApresentados(ArrayList<Veriador> listaVeriador) {
		HashMap<String, Integer> projetosAprovados = new HashMap<String, Integer>();
		HashMap<String, Integer> totalProjetosApresentados = new HashMap<String, Integer>();
		for (Veriador veriador : listaVeriador) {
			if (projetosAprovados.containsKey(veriador.getPartido().getNome())) {
				projetosAprovados.put(veriador.getPartido().getNome(),
						projetosAprovados.get(veriador.getPartido().getNome()) + veriador.projetosAprovados());
			} else {
				projetosAprovados.put(veriador.getPartido().getNome(), veriador.projetosAprovados());
			}
			if (totalProjetosApresentados.containsKey(veriador.getPartido().getNome())) {
				totalProjetosApresentados.put(veriador.getPartido().getNome(),
						totalProjetosApresentados.get(veriador.getPartido().getNome()) + veriador.getProjetos().size());
			} else {
				totalProjetosApresentados.put(veriador.getPartido().getNome(), veriador.getProjetos().size());
			}
		}
		System.out.println("\n");
		for (String chave : totalProjetosApresentados.keySet()) {
			System.out.println("Total do projetos apresentados pelo partido: " + chave + " foram "
					+ totalProjetosApresentados.get(chave));
		}
		System.out.println("\n");
		for (String chave : projetosAprovados.keySet()) {
			System.out.println(
					"Total do projetos aprovados pelo partido: " + chave + " foram " + projetosAprovados.get(chave));
		}
	}

	public static void mediaPartido(ArrayList<Veriador> listaVeriador) {
		HashMap<String, Double> partidos = new HashMap<String, Double>();
		for (Veriador veriador : listaVeriador) {
			if (partidos.containsKey(veriador.getPartido().getNome())) {
				partidos.put(veriador.getPartido().getNome(),
						(partidos.get(veriador.getPartido().getNome()) + veriador.desempenho()) / 2);
			} else {
				partidos.put(veriador.getPartido().getNome(), veriador.desempenho());
			}
		}
		System.out.println("Média dos partidos: ");
		for (String chave : partidos.keySet()) {
			System.out.println("O partido " + chave + " tem desempenho " + partidos.get(chave));
		}
	}

	public static void mediaDesempenho(ArrayList<Veriador> listaVeriador) {
		double total = 0.0;
		for (Veriador veriador : listaVeriador) {
			total += veriador.desempenho();
		}
		double media = total / listaVeriador.size();
		System.out.println("Veriadores cujo desempenho seja maior que o desempenho médio de toda câmara: ");
		for (Veriador veriador : listaVeriador) {
			if (veriador.desempenho() > media) {
				System.out.println(veriador.toString());
			}
		}
	}

	public static void veriadorMenorDesempenho(ArrayList<Veriador> listaVeriador) {
		Veriador veriadorMenorDesempenho = null;
		for (Veriador veriador : listaVeriador) {
			if (veriadorMenorDesempenho == null || veriadorMenorDesempenho.desempenho() > veriador.desempenho()) {
				veriadorMenorDesempenho = veriador;
			}
		}
		System.out.println("Veriador com menor desempenho: " + veriadorMenorDesempenho);
	}

	public static void veriadorMaisProjetosAprovados(ArrayList<Veriador> listaVeriador) {
		Veriador veriadorMaisProjetosAprovados = null;
		for (Veriador veriador : listaVeriador) {
			if (veriadorMaisProjetosAprovados == null
					|| veriadorMaisProjetosAprovados.projetosAprovados() < veriador.projetosAprovados()) {
				veriadorMaisProjetosAprovados = veriador;
			}
		}
		System.out.println(
				"Desempenho do veriador com mais projetos aprovados: " + veriadorMaisProjetosAprovados.toString());
	}

	public static void main(String[] args) {

		Partido umPartido = new Partido("DCE", 17);
		Partido doisPartido = new Partido("CCEN", 15);
		Partido tresPartido = new Partido("LCI", 8);

		ArrayList<Projetos> projetosJose = new ArrayList<Projetos>();
		Projetos umProjeto = new Projetos("Obras", true);
		projetosJose.add(umProjeto);
		Projetos doisProjetos = new Projetos("Manutenção", false);
		projetosJose.add(doisProjetos);

		ArrayList<Projetos> projetosMaria = new ArrayList<Projetos>();
		projetosMaria.add(umProjeto);
		Projetos mariaProjetoUm = new Projetos("Asfalto", true);
		projetosMaria.add(mariaProjetoUm);
		Projetos mariaProjetoDois = new Projetos("Manutenção", true);
		projetosMaria.add(mariaProjetoDois);

		ArrayList<Projetos> projetosAntonio = new ArrayList<Projetos>();
		projetosAntonio.add(doisProjetos);
		Projetos projetosAntonioUm = new Projetos("Ponte", false);
		projetosAntonio.add(projetosAntonioUm);
		Projetos projetosAntonioDois = new Projetos("faixa de pedestre", true);
		projetosAntonio.add(projetosAntonioDois);

		ArrayList<Projetos> projetosMarcos = new ArrayList<Projetos>();
		Projetos projetosMarcosUm = new Projetos("Ponte", true);
		projetosMarcos.add(projetosMarcosUm);
		Projetos projetosMarcosDois = new Projetos("faixa de pedestre", true);
		projetosMarcos.add(projetosMarcosDois);

		ArrayList<Projetos> projetosMarcelo = new ArrayList<Projetos>();
		Projetos projetosMarceloUm = new Projetos("Ponte", true);
		projetosMarcelo.add(projetosMarceloUm);
		Projetos projetosMarceloDois = new Projetos("faixa de pedestre", true);
		projetosMarcelo.add(projetosMarceloDois);

		ArrayList<Projetos> projetosAna = new ArrayList<Projetos>();
		Projetos projetosAnaUm = new Projetos("Ponte", true);
		projetosAna.add(projetosAnaUm);
		Projetos projetosAnaDois = new Projetos("faixa de pedestre", true);
		projetosAna.add(projetosAnaDois);

		ArrayList<Projetos> projetosAline = new ArrayList<Projetos>();
		Projetos projetosAlineUm = new Projetos("Ponte", true);
		projetosAline.add(projetosAlineUm);
		Projetos projetosAlineDois = new Projetos("faixa de pedestre", true);
		projetosAline.add(projetosAlineDois);

		ArrayList<Projetos> projetosMatilda = new ArrayList<Projetos>();
		Projetos projetosMatildaUm = new Projetos("Ponte", true);
		projetosMatilda.add(projetosMatildaUm);
		Projetos projetosMatildaDois = new Projetos("faixa de pedestre", true);
		projetosMatilda.add(projetosMatildaDois);
		projetosMatilda.add(projetosAlineDois);
		projetosMatilda.add(projetosAnaDois);
		projetosMatilda.add(projetosMarceloUm);
		projetosMatilda.add(projetosMarcosDois);
		projetosMatilda.add(projetosAntonioDois);
		projetosMatilda.add(projetosAlineUm);

		ArrayList<Projetos> projetosJoao = new ArrayList<Projetos>();
		Projetos projetosJoaoUm = new Projetos("Ponte", true);
		projetosJoao.add(projetosJoaoUm);
		Projetos projetosJoaoDois = new Projetos("faixa de pedestre", false);
		projetosJoao.add(projetosJoaoDois);

		Veriador umVeriador = new Veriador("José", umPartido, projetosJose);
		Veriador doisVeriador = new Veriador("Maria", umPartido, projetosMaria);
		Veriador tresVeriador = new Veriador("Antonio", doisPartido, projetosAntonio);
		Veriador quartroVeriador = new Veriador("Marcos", umPartido, projetosMarcelo);
		Veriador cincoVeriador = new Veriador("Marcelo", tresPartido, projetosMarcelo);
		Veriador seisVeriador = new Veriador("Ana", umPartido, projetosAna);
		Veriador seteVeriador = new Veriador("Aline", tresPartido, projetosAline);
		Veriador oitoVeriador = new Veriador("Matilda", umPartido, projetosMatilda);
		Veriador noveVeriador = new Veriador("João", doisPartido, projetosJoao);

		ArrayList<Veriador> listaVeriador = new ArrayList<Veriador>();
		listaVeriador.add(umVeriador);
		listaVeriador.add(doisVeriador);
		listaVeriador.add(tresVeriador);
		listaVeriador.add(quartroVeriador);
		listaVeriador.add(cincoVeriador);
		listaVeriador.add(seisVeriador);
		listaVeriador.add(seteVeriador);
		listaVeriador.add(oitoVeriador);
		listaVeriador.add(noveVeriador);

		for (Veriador mostrar : listaVeriador) {
			System.out.println(mostrar.toString());
		}

		veriadorMaisProjetosAprovados(listaVeriador);
		veriadorMenorDesempenho(listaVeriador);
		mediaDesempenho(listaVeriador);
		mediaPartido(listaVeriador);
		projetosApresentados(listaVeriador);
	}

}
