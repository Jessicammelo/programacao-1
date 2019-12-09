package RecuperaProva02;

import java.util.ArrayList;

public abstract class Onibus {

	double valorTotal = 0.0;
	protected String placa;
	ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
	
	public Onibus(String placa) {
		setPlaca(placa);
		
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public ArrayList<Passageiro> getPassageiros() {
		return passageiros;
	}

	public abstract void setPassageiros(Passageiro passageiros);

	public abstract void atualizaValorTotal(Passageiro passageiro);
		
	public int getTotalAposentados() {
		int quantAposentado = 0;
		ArrayList<Passageiro> passageiros = getPassageiros();
		for (Passageiro passageiro : passageiros) {
			if (passageiro instanceof Aposentado) {
				quantAposentado++;
			}
		}
		return quantAposentado;
	}
	
}
