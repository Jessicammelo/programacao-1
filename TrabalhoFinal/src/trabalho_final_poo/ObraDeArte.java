package trabalho_final_poo;

import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;

public class ObraDeArte {

	private String titulo;
	private int ano;
	private double valor;
	private LocalDate data;
	private Path imagem;
	private Autor autor;
	private ArrayList<ProprietarioAnterior> props = new ArrayList<>();
	private Venda venda;

	public ObraDeArte() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Path getImagem() {
		return imagem;
	}

	public void setImagem(Path imagem) {
		this.imagem = imagem;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public ArrayList<ProprietarioAnterior> getProps() {
		return props;
	}

	public void setProps(ArrayList<ProprietarioAnterior> props) {
		this.props = props;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}
