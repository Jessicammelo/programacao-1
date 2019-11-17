package heranca;

public class Livro extends Publicacao{
	private String ISBN;

	public Livro(String nome, String editores, String isbn) {
		super(nome, editores);
		setISBN(isbn);
	}
	

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String toString() {
		return super.toString() + 
				"Nome: " + getNome() + "\nEditora: " + getEditores() + "\nISBN: " + getISBN();
	}
}
