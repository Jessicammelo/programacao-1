package Trabalho02;

//nome: Jessica Melo
import java.util.HashMap;

public class DicionarioDeIP {
	public static void imprimir(HashMap<String, Site> sites) {
		for (String nome : sites.keySet()) {
			System.out.println(sites.get(nome).toString());
		}
	}

	public static void inserirSiteHash(Site site, HashMap<String, Site> sites) {
		sites.put(site.getNome(), site);
	}

	public static void acessarSiteHash(String nome, HashMap<String, Site> sites) {
		Site site = sites.get(nome);
		if (site.isStatus()) {
			System.out.println(site.toString());
		} else {
			System.out.println("[" + site.getNome() + "]" + " site não está funcionando! ");
		}

	}

	public static void main(String[] args) {

		Site siteUm = new Site("shoptime.com", "34.203.199.183", true);
		Site siteDois = new Site("netshoes.com", "20.40.112.118", false);
		Site siteTres = new Site("ieee.com", "140.98.193.152", true);

		HashMap<String, Site> sites = new HashMap<String, Site>();
		inserirSiteHash(siteUm, sites);
		inserirSiteHash(siteDois, sites);
		inserirSiteHash(siteTres, sites);

		for (String nome : sites.keySet()) {
			acessarSiteHash(nome, sites);
		}
		imprimir(sites);

	}

}
