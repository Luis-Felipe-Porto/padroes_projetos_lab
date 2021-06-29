package atvd03_tarefa05;

public class LivrariaTest {
	public static void main(String[] args) {
		Livro livro = new LivroBuilder("Java, como programar")
		.publicadoEm(2000)
		.dosAutores("Luis Felipe","Porto")
		.edicao(4)
		.cidade("São Luis")
		.editora("Devs")
		.nomeOriginal("Java how to Program")
		.tradutores("Maria Davi")
		.pagina(1386)
		.isbn(122333304L)
		.build();
		System.out.println(livro.toString());		
	}
}
