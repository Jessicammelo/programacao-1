package exer3;
//Jéssica Melo
public class NameGenerator {

	private char[] nome;
	private char[] nomeMae;
	private char[] cidade;
	private char[] sobrenome;

	public static String generateStarWarsName(String[] entrada) {
		NameGenerator g = new NameGenerator();
		return g.doGenerateStarWarsName(entrada[0], entrada[1], entrada[2]);
	}

	private String doGenerateStarWarsName(String nome, String nomeMae, String cidade) {
		this.sobrenome = nome.split(" ")[nome.split(" ").length - 1].toCharArray();
		this.nome = nome.toCharArray();
		this.nomeMae = nomeMae.split(" ")[nomeMae.split(" ").length - 1].toCharArray();
		this.cidade = cidade.toCharArray();
		return this.generateName();
	}
	
	private String generateName() {
		String nome = "";
		String letraNome = "" + this.nome[0];
		String letraCidade = "" + this.cidade[0];
		nome += this.sobrenome[0];
		nome += this.sobrenome[1];
		nome += this.sobrenome[2];
		nome += letraNome.toLowerCase();
		nome += this.nome[1];
		nome += " ";
		nome += this.nomeMae[0];
		nome += this.nomeMae[1];
		nome += letraCidade.toLowerCase();
		nome += this.cidade[1];
		nome += this.cidade[2];
		return nome;
	}
}
