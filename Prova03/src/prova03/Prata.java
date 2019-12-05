package prova03;
//jessica melo
import java.util.ArrayList;

public class Prata extends Plano {

	public Prata(String nomeDoPlano, int ano, int quantDependentes) {
		super(nomeDoPlano, ano, quantDependentes);
	}

	public double desconto1(ArrayList<Consulta> umaConsulta) {
		return 250 - (200 / 100);

	}

	public double desconto2(ArrayList<Consulta> umaConsulta) {
		if(getAno()<=2000) {
			return 250 - (300/100);
		}
		return 0;
	}
	
}
