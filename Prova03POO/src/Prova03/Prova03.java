package Prova03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prova03 {

	public static void main(String[] args) {
		new 
	}
	public static void importar(String arqOrigem, String arqDestino) throws EArquivoOrigemNaoExiste {
		try {
			BufferedReader br;
			try {
				br = new BufferedReader(new FileReader(arqOrigem));
			} catch (FileNotFoundException e) {
				throw new EArquivoOrigemNaoExiste();
			}
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		} catch (IOException e) {
			throw new EArquivoOrigemNaoExiste();
		}
	}
	
	private static void parse(String text) {
		String[] arr = text.split(";");
		EventoBeneficente eb = null;
		if (arr[0].equals("D")) {
			
		}
	}
}
