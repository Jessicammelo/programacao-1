package RecuperaProva02;

public class Intermunicipal extends Onibus{

	public Intermunicipal(String placa) {
		super(placa);
	}

	@Override
	public void setPassageiros(Passageiro passageiro) {
		if(passageiros.size() < 65) {
			passageiros.add(passageiro);
			atualizaValorTotal(passageiro);
		}else {
			System.out.println("Lotação máxima de passageiros atingida");
		}
		
	}

	@Override
	public void atualizaValorTotal(Passageiro passageiro) {
		valorTotal += (passageiro.getTaxa() + 0.70);
		
	}
	
}
