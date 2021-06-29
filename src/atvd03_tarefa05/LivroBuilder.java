package atvd03_tarefa05;

import java.util.Arrays;


public class LivroBuilder {
	private Livro livro;
	

	public LivroBuilder(String nomeNacional) {
		this.livro = new Livro();
		this.livro.setNomeNacional(nomeNacional);
		
	}
	public LivroBuilder publicadoEm(int ano) {
		this.livro.setAno(ano);
		return this;
	}
	public LivroBuilder dosAutores(String ...autores ) {		
		this.livro.setAutores(Arrays.asList(autores));
		return this;
	}
	public LivroBuilder edicao(int edicao) {
		this.livro.setEdicao(edicao);
		return this;
	}
	public LivroBuilder cidade(String cidade) {
		this.livro.setCidade(cidade);
		return this;
	}
	public LivroBuilder editora(String editora) {
		this.livro.setEditora(editora);
		return this;
	}
	public LivroBuilder nomeOriginal(String nomeOriginal) {
		this.livro.setNomeOriginal(nomeOriginal);
		return this;
	}
	public LivroBuilder tradutores(String ...tradutores) {
		this.livro.setTradutores(Arrays.asList(tradutores));
		return this;
	}
	public LivroBuilder pagina(int paginas) {
		this.livro.setPaginas(paginas);
		return this;
	}
	public LivroBuilder isbn(Long isbn) {
		this.livro.setIsbn(isbn);
		return this;
	}
	public Livro build() {
		return this.livro;
	}
}
