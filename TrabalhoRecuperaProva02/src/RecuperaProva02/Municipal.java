package RecuperaProva02;

import java.util.ArrayList;

public class Municipal extends Onibus{


	public Municipal(String placa) {
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
		valorTotal += passageiro.getTaxa(); 
		
	}
	
}
