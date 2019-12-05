package exercicioCarro;

public class CarroTurbo extends Carro {

	public CarroTurbo(String placa, int ano, int combustivel, double potencia) {
		super(placa, ano, combustivel, potencia);
	}
	
	public double getPotencia() {
		return super.getPotencia() * 1.3;
	}
	
	public double calcularRendimento() {
		if (getCombustivel() == 1)
			return 10 / ((getPotencia() * 1.3) * 0.7);
		return 12 / ((getPotencia() * 1.3)* 0.6);

	} 
	
	public String toString() {
		String str = "Placa: " + getAno() + "\nAno: "  + getAno() + "\n Combustivel: (1- alcool/ 2- gasolina)" + getCombustivel() + 
				"\nPotência: " + getPotencia() + "\nRendimento: " + calcularRendimento();
		
		for(Avaliacao a : avaliacoes) {
			str += "\n"  + a.toString();
		}
		return str;
	}
}
