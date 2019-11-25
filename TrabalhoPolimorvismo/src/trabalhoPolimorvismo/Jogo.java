package trabalhoPolimorvismo;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

		SuperHeroi chapolinColorado = new SuperHeroi(null, "Chapolin Colorado", "");

		SuperPoder anteninhasDeVinil = new SuperPoder("Anteninhas de Vinil", 4);
		SuperPoder marretaBionica = new SuperPoder("Marreta Biônica", 5);
		SuperPoder cornetaParalizadora = new SuperPoder("Corneta Paralizadora", 5);
		SuperPoder pastilhasEncolhedoras = new SuperPoder("Pastilhas Encolhedoras", 4);

		chapolinColorado.adicionaSuperPoder(anteninhasDeVinil);
		chapolinColorado.adicionaSuperPoder(marretaBionica);
		chapolinColorado.adicionaSuperPoder(cornetaParalizadora);
		chapolinColorado.adicionaSuperPoder(pastilhasEncolhedoras);

		SuperHeroi homemAranha = new SuperHeroi(null, "Homem-Aranha", "Peter Park");

		SuperPoder soltarTeia = new SuperPoder("Soltar teia", 3);
		SuperPoder andarEmParedes = new SuperPoder("Andar em Paredes", 2);

		homemAranha.adicionaSuperPoder(soltarTeia);
		homemAranha.adicionaSuperPoder(andarEmParedes);

		SuperHeroi superHomem = new SuperHeroi(null, "Super-Homem", "Clark Kent");

		SuperPoder voar = new SuperPoder("Voar", 3);
		SuperPoder forca = new SuperPoder("Força", 5);
		SuperPoder visaoRaioX = new SuperPoder("Visão de Raio X", 4);
		SuperPoder sobroCongelante = new SuperPoder("Sobro Congelante", 4);

		superHomem.adicionaSuperPoder(voar);
		superHomem.adicionaSuperPoder(forca);
		superHomem.adicionaSuperPoder(visaoRaioX);
		superHomem.adicionaSuperPoder(sobroCongelante);

		SuperHeroi capitaoAmerica = new SuperHeroi(null, "Capitão América", "Steven Rogers");

		SuperPoder superSoldado = new SuperPoder("Super Soldado", 3);
		SuperPoder escudo = new SuperPoder("Escudo", 3);

		capitaoAmerica.adicionaSuperPoder(superSoldado);
		capitaoAmerica.adicionaSuperPoder(escudo);

		SuperHeroi flash = new SuperHeroi(null, "Flash", "Barry Allen");

		SuperPoder velocidade = new SuperPoder("Velocidade", 5);

		flash.adicionaSuperPoder(velocidade);

		SuperHeroi lanternaVerde = new SuperHeroi(null, "Lanterna-Verde", "Hal Jordan");

		SuperPoder anelMagico = new SuperPoder("Anel Mágico", 5);

		lanternaVerde.adicionaSuperPoder(anelMagico);

		SuperHeroi homemDeFerro = new SuperHeroi(null, "Homem de Ferro", "Tony Stark");

		SuperPoder armadura = new SuperPoder("Armadura", 4);
		SuperPoder dispositivosEletronicos = new SuperPoder("Dispositivos Eletrônicos", 2);

		homemDeFerro.adicionaSuperPoder(armadura);
		homemDeFerro.adicionaSuperPoder(dispositivosEletronicos);
		
		//viloes
		
		Vilao duendeVerde = new Vilao("Duende Verde", "Norman Osbourne", 2);

		SuperPoder forte = new SuperPoder("Força", 5);

		duendeVerde.adicionaSuperPoder(forte);
		
		
		Vilao lexLuthor = new Vilao("Lex Luthor", "Lex Luthor", 5);

		SuperPoder menteAgucada = new SuperPoder("Mente Aguçada", 5);

		lexLuthor.adicionaSuperPoder(menteAgucada);
		
		
		Vilao bizarro = new Vilao("Bizzaro", "Bizarro", 6);

		SuperPoder voo = new SuperPoder("Voar", 3);
		SuperPoder forca2 = new SuperPoder("Força", 5);
		SuperPoder visaoRaioX2 = new SuperPoder("Visão de Raio X", 4);
		SuperPoder sobroCongelante2 = new SuperPoder("Sobro Congelante", 4);

		bizarro.adicionaSuperPoder(voo);
		bizarro.adicionaSuperPoder(forca2);
		bizarro.adicionaSuperPoder(visaoRaioX2);
		bizarro.adicionaSuperPoder(sobroCongelante2);

		
		Vilao octopus = new Vilao("Octopus", "Otto Octavius", 4);

		SuperPoder tentaculosIndestrutiveis = new SuperPoder("Tentáculos Indestrutíveis", 5);
		SuperPoder velocidade2 = new SuperPoder("Velocidade", 1);

		octopus.adicionaSuperPoder(tentaculosIndestrutiveis);
		octopus.adicionaSuperPoder(velocidade2);
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número para escolher o vilão:\n 1 Duente Verde;\n 2 Lex Luthor;\n 3 Bizarro\n 4 Octopus;");
		int vilaoInt = teclado.nextInt();
		
		System.out.println("Digite o número para escolher o heroi:\n 1 Chapolin Colorado;\n 2 Homem Aranha;\n 3 Super Homem;\n 4 Capitão América;\n 5 Flash;\n 6 Lanterna Verde;\n 7 Homem de Ferro;");
		int heroiInt = teclado.nextInt();
		
		Vilao vilao = null;
		switch(vilaoInt) {
		case 1:
			vilao = duendeVerde;
			break;
		case 2:
			vilao = lexLuthor;
			break;
		case 3:
			vilao = bizarro;
			break;
		case 4:
			vilao = octopus;
			break;
		}
		
		SuperHeroi heroi = null;
		switch (heroiInt) {
		case 1:
			heroi = chapolinColorado;			
			break;
		case 2:
			heroi = homemAranha;
			break;
		case 3:
			heroi = superHomem;
			break;
		case 4:
			heroi = capitaoAmerica;
			break;
		case 5:
			heroi = flash;
			break;
		case 6:
			heroi =  lanternaVerde;
			break;
		case 7:
			heroi = homemDeFerro;
			break;
		}
			
		Confronto confronto = new Confronto();
		System.out.println(heroi.getNome() + " versus " + vilao.getNome());
		if(confronto.executar(heroi, vilao) > 0) {
			System.out.println("O herói venceu!!\nO vilão ficará " + vilao.getTempoDePrisao() + " anos na prisão!");
		}else {
			System.out.println("O vilão venceu!!" );
		}
	}

}
