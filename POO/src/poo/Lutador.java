package poo;
// prova dia 25
public class Lutador {
//tudo acontece aqui na classe get e set
	private int idade;
	
	public void setIdade(int idade) {
		if(idade >= 0 ) {
			this.idade = idade;
		}else {
			System.out.println("Ocorreu um erro");
		}
	}
	public int getIdade() {
		return this.idade;
		
	}
}
