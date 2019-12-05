package prova03;
//jessica melo
import java.util.ArrayList;

public class Ouro extends Plano{
	
	public Ouro(String nomeDoPlano, int ano, int quantDependentes) {
		super(nomeDoPlano, ano, quantDependentes);
	}

	public double desconto3(ArrayList<Consulta> umaConsulta) {
		return 250 - (400 / 100);

	}

	public double desconto4(ArrayList<Consulta> umaConsulta) {
		if (getQuantDependentes() > 2) {
			 return 250 - (500 / 100);
		}
		return 0;

	}
}
