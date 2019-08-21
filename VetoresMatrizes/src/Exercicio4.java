import javax.swing.JOptionPane;

//Ler uma variável numSoma. Ler um vetor C com 5 elementos,
//em seguida somar a variável numSomaem cada um dos elementos
//(ex.: C[i] = C[i] + numSoma) e apresentar o vetor
public class Exercicio4 {

	public static void main(String[] args) {

		int numberAdd = 0;
		int vetor[] = new int[5];
		int result[] = new int[5];
		numberAdd = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que será somado:"));

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite 5 valores:"));
			result[i] = vetor[i] + numberAdd;
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(result[i] + " ");
		}

	}

}
