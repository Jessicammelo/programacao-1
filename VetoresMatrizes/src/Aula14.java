// ou  int vetor[] = new int [5];//
// somar os elementos do vetor nas posiçoes  0, 2, 4
// ordenar os elementos do vetor (usar enquando)
public class Aula14 {
	public static void tste(String[] args) {
		int aux = 0;
		int vetor[] = { 2, 19, 15, 6, 9 };

		for (int j = 0; j < vetor.length; j++) {
			for (int i = 0; i < vetor.length - 1; i++) {// i=i +2
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
				}
			}

		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
	}

}
