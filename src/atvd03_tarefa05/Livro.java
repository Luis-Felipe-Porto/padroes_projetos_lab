package atvd03_tarefa05;

import java.util.List;

public class Livro {
	
	private String nomeNacional;
	private int ano;
	private List<String> autores;
	private int edicao;
	private String cidade;
	private String editora;
	private String nomeOriginal;
	private List<String> tradutores;
	private int paginas;
	private long isbn;
	
	public String getNomeNacional() {
		return nomeNacional;
	}
	public void setNomeNacional(String nomeNacional) {
		this.nomeNacional = nomeNacional;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public List<String> getAutores() {
		return autores;
	}
	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getNomeOriginal() {
		return nomeOriginal;
	}
	public void setNomeOriginal(String nomeOriginal) {
		this.nomeOriginal = nomeOriginal;
	}
	public List<String> getTradutores() {
		return tradutores;
	}
	public void setTradutores(List<String> tradutores) {
		this.tradutores = tradutores;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return " [\n\tnomeNacional : " + nomeNacional + ",\n\tano : " + ano + ",\n\tautores : " + autores
				+ ",\n\tedicao : " + edicao + ",\n\tcidade : " + cidade + ",\n\teditora : " + editora
				+ ",\n\tnomeOriginal : " + nomeOriginal + ",\n\ttradutores : " + tradutores + ",\n\tpaginas : "
				+ paginas + ",\n\tisbn : " + isbn + "\n]";
	}
	
}
