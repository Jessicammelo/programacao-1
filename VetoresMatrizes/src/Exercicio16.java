// usar um vetor de char com todas as letras do alfabeto 23+p
//16. Uma das formas de se enviar uma mensagem secreta � 
//por meio de c�digos matem�ticos. Onde, tanto o destinat�rio
//quanto o remetente possuem um vetor chave C. O destinat�rio 
//recebe do remetente um vetor M, tal que M+C = P, onde P � o 
//vetor mensagem a ser decodificado. Cada n�mero do P corresponde 
//a uma letra do alfabeto: 1 = a, 2 = b, 3 = c,..., 23 = z 
//(consideremos o alfabeto com 23 letras, excluindo as letras k,
//w e y e, o n�mero zero corresponde ao espa�o em branco).  

public class Exercicio16 {

	public static void tste(String[] args) {
		

		int c[] = { 1, 1, 0, 1, 0, -1, 0, 0, 2 };
		int m[] = new int[c.length];
		int p[] = { 2, -10, 1, 0, 18, 37, 17, 19, 5 };
		char letra[] = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'x', 'z' };

		for (int i = 0; i < c.length; i++) {
			if (p[i] % 23 >= 0) {
				System.out.println(letra[p[i] % 23]);

			} else {
				System.out.println(letra[24 + p[i]]);
			}

		}
	}

}
