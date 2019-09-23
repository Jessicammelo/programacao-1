import javax.swing.JOptionPane;

//Ler uma variável numSoma. Ler um vetor C com 5 elementos,
//em seguida somar a variável numSomaem cada um dos elementos
//(ex.: C[i] = C[i] + numSoma) e apresentar o vetor
public class Exercicio4 {

	public static void main(String[] args) {

		// instancia e chama os metodos dentro dessa classe

		Exercicio4 exer4 = new Exercicio4();

		int numberAdd = 0;
		int vetor[] = new int[5];
		int result[] = new int[5];
		numberAdd = exer4.getValorSomado();// chamei o metodo que retornou o valor
		result = exer4.soma(vetor, numberAdd);
		exer4.mostrar(vetor, result);

	}

	public int getValorSomado() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que será somado:"));
	}

	public int[] soma(int vetor[], int numberAdd) {
		int result[] = new int[5];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite 5 valores:"));
			result[i] = vetor[i] + numberAdd;
		}
		return result;
	}

	public void mostrar(int vetor[], int result[]) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(result[i] + " ");
		}
	}

}
