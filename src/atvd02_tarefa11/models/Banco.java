package atvd02_tarefa11.models;

public class Banco {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	
	public Banco(String nome, String endereco, String telefone, String email) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
}
