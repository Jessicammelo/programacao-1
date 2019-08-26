
public class Exercicio7 {

	public static void main(String[] args) {

		double vetor[] = { -1.7, 3.0, 0.0, 1.5, 0.0, -1.7, 2.3, -1.7 };
		int quant = 1;

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] < vetor[j]) {
					double valor = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = valor;
				}
			}
		}
		Double valorAntigo = null;
		for (int i = 0; i < vetor.length; i++) {
			if (valorAntigo == null) {
				valorAntigo = vetor[i];
				continue;
			}
			if (valorAntigo == vetor[i]) {
				quant++;
			} else {
				System.out.println(valorAntigo + " contém " + quant);
				valorAntigo = vetor[i];
				quant = 1;
			}

		}
		System.out.println(valorAntigo + " contém " + quant);
	}

}
