package poo;

import java.util.Scanner;

public class CadastroCarro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite marca do seu carro: ");
		String marca = teclado.next();
		System.out.println("Digite a placa: ");
		String placa = teclado.next();
		System.out.println("Digite a cor: ");
		String cor = teclado.next();
		teclado.close();
		Carro umCarro = new Carro(marca, placa, cor);
		System.out.println(umCarro.imprimir());
		

	}

}
