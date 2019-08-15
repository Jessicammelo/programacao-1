// duas sequencias de algarimos que se somam
//não usar switch nem if
//fazer 16
public class Exercicio17 {

	public static void main(String[] args) {

		int Seq1[] = { 8, 2, 4, 3, 4, 2, 5, 1 };
		int Seq2[] = { 2, 1, 9, 5, 2, 3, 6, 7 };
		int Result[] = new int[Seq1.length + 1];
		int valor = 0;// guardar sobra
		int estouro = 0;

		// for (int j = 7; j > Seq1.length - 1; j--) {
		for (int i = Seq1.length-1; i >= 0; i--) {
			valor = Seq1[i] + Seq2[i] + estouro;
			estouro = 0;
			if (valor > 9) {
				 estouro = 1;
			}
			Result[i+1] = valor % 10;

		}
		Result[0] = estouro;
		// }
		for (int i = 0; i < Result.length; i++) {
			System.out.println(Result[i]);

		}

	}

}
