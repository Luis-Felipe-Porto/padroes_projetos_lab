package atvd03_tarefa04.contatos;

public class Contato {
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return " [\n\tnome : " + nome + "\n]";
	}
	
	
}
