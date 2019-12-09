package RecuperaProva02;

//Jéssica Melo
import java.util.HashMap;
import java.util.Map.Entry;

public class Teste {

	public static void main(String[] args) {

		Passageiro motorista = new Motorista(0.0, "Roberto", "MHF8475");
		Passageiro aposentado = new Aposentado("5687145", 4.10, "João");
		Passageiro estudante = new Estudante("5478", 4.10, "Maria");

		Municipal umOnibusMunicipal = new Municipal("MHD2547");
		Intermunicipal umOnibusIntermunicipal = new Intermunicipal("MGD6584");
		umOnibusIntermunicipal.setPassageiros(estudante);
		umOnibusIntermunicipal.setPassageiros(aposentado);
		umOnibusIntermunicipal.setPassageiros(motorista);
		umOnibusIntermunicipal.setPassageiros(estudante);
		
		umOnibusMunicipal.setPassageiros(estudante);
		umOnibusMunicipal.setPassageiros(aposentado);
		umOnibusMunicipal.setPassageiros(motorista);

		HashMap<String, Onibus> adicionaOnibus = new HashMap<String, Onibus>();
		adicionaOnibus.put(umOnibusIntermunicipal.getPlaca(), umOnibusIntermunicipal);
		adicionaOnibus.put(umOnibusMunicipal.getPlaca(), umOnibusMunicipal);

		
		Onibus onibus = adicionaOnibus.get("MHD2547");
		System.out.println("Valor total arrecadado por um ônibus: " + onibus.getValorTotal());

		int quantAposentado = onibus.getTotalAposentados();
		
		System.out.println("Quantidade de Aposentados no ônibus de placa: " + onibus.getPlaca() + " : " + quantAposentado);
		
		Onibus onibus3 = null;
		for(Entry<String, Onibus> onibus2 : adicionaOnibus.entrySet()) {
			if(onibus3 == null || onibus2.getValue().getPassageiros().size() < onibus3.getPassageiros().size()) {
				onibus3 = onibus2.getValue();
			}
		}
		
		
		System.out.println("O ônibus com menor quantidade de passageiros no ônibus placa: " + onibus3.getPlaca()) ;
	}

}
