
// fazer um nvo vetor incrementa posicçao é amior que zero vai la e add e incrementa posição
//tirar os negativos
//valores fixos
public class Exercicio6 {

	public static void main(String[] args) {
		
		int vetor[] = {-1,7,-23,-15,9,-6,30,47};
		int vetorPositivo[] = new int[8];
		Exercicio6Teste teste = new Exercicio6Teste();		
		vetorPositivo = teste.somentePositivo(vetor);
		Exercicio6 exer6 = new Exercicio6();
		exer6.dizOi();
		
		System.out.println();
		
		teste.exibir(vetor, vetorPositivo);
			
	}
	
	public void dizOi() {
		System.out.println("oi");
	}

}
