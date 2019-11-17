package heranca;

public class TesteHeranca {
//quando for to tipo livro só vai mostrar o livro quando for publicação só vai mostrar publicação.
	public static void main(String[] args) {
		
		Publicacao umaPublicacao = new Publicacao(null, null);
		umaPublicacao.setNome("Show");
		umaPublicacao.setEditores("Abril");
		//System.out.println(umaPublicacao);

		Livro umLivro = new Livro(null, null,null);
		umLivro.setNome("As aventuras do chaves");
		umLivro.setEditores("Saraiva");
		umLivro.setISBN("125478");
		System.out.println(umLivro);
	}

}
