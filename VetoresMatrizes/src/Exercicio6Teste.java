
public class Exercicio6Teste {

	public int[] somentePositivo(int vetor[]) {
		int vetorPositivo[] = new int[8];
		int posicao = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > 0) {
				vetorPositivo[posicao] = vetor[i];
				posicao++;
			}
			System.out.println(vetor[i]);
		}
		return vetorPositivo;
	}
	
	public void exibir(int vetor[], int vetorPositivo[]) {
		for(int i = 0; i < vetor.length;i++) {
			System.out.println(vetorPositivo[i]);
		}
	}
}
