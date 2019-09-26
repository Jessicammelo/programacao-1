package exercicio9Matriz;

public class Agenda {

	public static void teste(String[] args) {
	
		//criando agenda para 30dias e 24 horas
		Compromisso umaAgenda[][] = new Compromisso[30][24];
		
		//add um compromisso em dia e hora
		int dia = 3;
		int hora = 2;
		umaAgenda[dia-1][hora] = new Compromisso("Mandar email", "Minha casa");
		
		//Listar todos os compromissos
		for(int horas = 0; horas < umaAgenda[0].length; horas++) {
			if(umaAgenda[dia-1][horas] !=null)
			System.out.println("Dia: " + dia + "\nHora: " + horas + "\nVc tem o seguinte compromisso: " + "\n" +  umaAgenda[dia-1][horas].imprimir());
		}
		
	}

}
