package ProvaN1;

import java.util.HashMap;
import java.util.Map.Entry;

//Jessica Melo

public class Teste {

	public static void main(String[] args) {
		
		//Estabelecimento umEstabelecimento = new Estabelecimento(123, "Angelone", "Fonte");
		//Estabelecimento doisEstabelecimento = new Estabelecimento(874, "Giasse", "Antonio da Veiga");
		
		Produto amacianteDeRoupas = new Produto(258, "Amaciente de Roupas", 12.50, 10);
		Produto detergente = new Produto(547, "Detergente", 1.50, 50);
		Produto refrigerante = new Produto(847, "Refrigerante", 5.50, 20);
		
		Venda umaVenda = new Venda(10, amacianteDeRoupas);
		Venda segundaVenda = new Venda(10, detergente);
		Venda terceiraVenda = new Venda(20, refrigerante);
		
		HistoricoVenda historicoDeVendas = new HistoricoVenda(2547, 25, 03,umaVenda);
		HistoricoVenda historicoDeVendas2 = new HistoricoVenda(254, 26, 03, segundaVenda);
		HistoricoVenda historicoDeVendas3 = new HistoricoVenda(587, 26, 03, terceiraVenda);
		
		//umEstabelecimento.getHistoricoVenda();
		
		if(amacianteDeRoupas.getQuantEstoque() == 0 ||detergente.getQuantEstoque() == 0 || refrigerante.getQuantEstoque() == 0) {
			System.out.println("Regarregar estoque!");
		}
		
		HashMap<Integer, Estabelecimento> vendas = new HashMap<Integer, Estabelecimento>();
		//vendas.put(umEstabelecimento.getCodigo(), umEstabelecimento);
		//vendas.put(doisEstabelecimento.getCodigo(), doisEstabelecimento);

		
		Estabelecimento estabelecimento = vendas.get("123");
		System.out.println("Vendas do Angelone: " + vendas.get(estabelecimento));
		
		System.out.println("Consulta de estabelecimentos que mais vendem: " + estabelecimento.getCodigo() );
		
		Estabelecimento estabelecimento2 = null;
		for(Entry<Integer, Estabelecimento> estabelecimento3 : vendas.entrySet()) {
		
		}
			//if(estabelecimento2 == null || estabelecimento3.getValue().getHistoricoVenda().getVenda().getProduto() < estabelecimento2.getHistoricoVenda().getVenda().getProduto() {
				//estabelecimento2 = estabelecimento3.getValue();
			}
}
