package Exercicio05;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
			System.out.println(" 1 para Qualquer evento e 2 para show musical?");
			
		int resposta = teclado.nextInt();
		if (resposta == 2) {
			Avaliacao umaAvaliacao = new Avaliacao(250, "muito bom");
			//ShowMusical umShowMusical = new ShowMusical("antonio", "Rock", "florata", 120.0, "22/04/2020" );
			Evento evento = new Evento("Show musical", 120.0,"05/04/2020");
			System.out.println("Um show musical" + evento);
		}else {
			System.out.println("Qualquer evento");
		}

	}

}
