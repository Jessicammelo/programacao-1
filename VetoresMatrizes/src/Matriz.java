
public class Matriz {

	public static void main(String[] args) {
		//declarando matriz
		int matriz [][];
		matriz = new int [2][3];

		matriz[0][0] = 3;
		matriz[0][1] = 5;
		matriz[1][0] = 7;
		matriz[1][1] = 9;
		matriz[0][2] = 1;
		matriz[1][2] = 11;
		
		//populando/ inserindo elementos
		
		//varrendo matriz e exibindo
		for(int i = 0; i < matriz.length; i++) {//percorre linha
			for(int j = 0; j < matriz[i].length;j++) {//percorre coluna
				System.out.println(matriz[i][j] + " ");
			}
			
		}
	}

}
