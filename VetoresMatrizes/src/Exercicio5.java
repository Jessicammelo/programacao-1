
// entregar 6 e 7
// vetor com numros positivos
import javax.swing.JOptionPane;

//5. Faça um programa que leia dois vetores de 10 posições de caracteres.
//A seguir, troque o 1º elemento do vetorA com o 10º do vetorB, o 2º do 
//vetorA com o 9º do vetorB, assim por diante, até trocar o 10º do vetorA
//com o 1º do vetorB. Mostre os vetores antes e depois da troca.

public class Exercicio5 {

	public static void main(String[] args) {
		char vetorA[] = new char[10];
		char vetorB[] = new char[10];

		String vet1 = JOptionPane.showInputDialog("Digite dez letras");
		vetorA = vet1.toCharArray();
		String vet2 = JOptionPane.showInputDialog("Digite dez letras");
		vetorB = vet2.toCharArray();
		
		for (int i = 0; i < 10; i++) {
			char valorA = vetorA[i];
			char valorB = vetorB[9-i];
			vetorA[i] = valorB;
			vetorB[9-i] = valorA;
		}

		for (int i = 0; i <10; i++) {
			System.out.println(vetorA[i] + " " + vetorB[i] + " ");
		}

	}

}
