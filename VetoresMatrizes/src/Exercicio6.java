
// fazer um nvo vetor incrementa posicçao é amior que zero vai la e add e incrementa posição
//tirar os negativos
//valores fixos
public class Exercicio6 {

	public static void main(String[] args) {
		
		int vetor[] = {-1,7,-23,-15,9,-6,30,47};
		int vetorPositivo[] = new int[8];
		int posicao = 0;
		
		for(int i = 0; i < vetor.length;i++) {
			if(vetor[i] > 0 ) {
				vetorPositivo[posicao] = vetor[i];
				posicao++;
			}
			System.out.println(vetor[i]);
		}
		System.out.println();
		for(int i = 0; i < vetor.length;i++) {
			System.out.println(vetorPositivo[i]);
		}
			
	}

}
