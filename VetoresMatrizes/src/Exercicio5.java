
// entregar 6 e 7
// vetor com numros positivos
import javax.swing.JOptionPane;

//5. Fa�a um programa que leia dois vetores de 10 posi��es de caracteres.
//A seguir, troque o 1� elemento do vetorA com o 10� do vetorB, o 2� do 
//vetorA com o 9� do vetorB, assim por diante, at� trocar o 10� do vetorA
//com o 1� do vetorB. Mostre os vetores antes e depois da troca.

public class Exercicio5 {

	public static void main(String[] args) {
		char vetorA[] = new char[5];
		char vetorB[] = new char[5];
		String letras = " ";
		int posicao = 5;

		for (int i = 0; i <= vetorA.length; i++) {
			vetorA[i] = letras.charAt(vetorA[i]);
			JOptionPane.showInputDialog("Digite dez letras");
			vetorB[i] = letras.charAt(vetorB[i]);
			JOptionPane.showInputDialog("Digite dez letras");
		}
		
		for (int i = 0; i <=vetorA.length; i++) {
			vetorA[i] = vetorB[i + posicao];

			vetorB[i + posicao] = vetorA[i];
			posicao--;
		}
		
		for (int i = 0; i <= vetorA.length; i++) {
			System.out.println(vetorA[i] + " " + vetorB[i] + " ");
		}

	}

}
