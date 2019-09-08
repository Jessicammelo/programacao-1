package Trabalho01;

import java.util.Scanner;

public class TestarLutador {

	public static void main(String[] args) {
		int digito = 1;
		Scanner teclado = new Scanner(System.in);
		while (digito != 0) {
			System.out.println("Digite o nome do lutador: ");
			String nome = teclado.next();
			System.out.println("Digite o peso do lutador: ");
			double peso = teclado.nextDouble();
			Lutador umLutador = new Lutador(nome, peso);
			umLutador.defineCategoria();
			System.out.println(umLutador.imprimir());
			System.out.println("Digite zero para sair ou um para continuar");
			digito = teclado.nextInt();
		}
		teclado.close();
	}
}
