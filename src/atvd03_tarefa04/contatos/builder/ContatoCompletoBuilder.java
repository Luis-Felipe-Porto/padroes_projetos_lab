package atvd03_tarefa04.contatos.builder;

import atvd03_tarefa04.Pessoa;

import atvd03_tarefa04.contatos.ContatoCompleto;

public class ContatoCompletoBuilder extends ContatoBuilder{
	
	private ContatoCompleto contato = new ContatoCompleto();

	private void comNome(String nome) {
		this.contato.setNome(nome);
	}
	private void endereco(String endereco) {
		this.contato.setEndereco(endereco);
	}
	private void telefone(String telefone) {
		this.contato.setTelefone(telefone);
	}
	private void email(String email) {
		this.contato.setEmail(email);
	}
	@Override
	public String getContato() {
		return contato.toString();
		
	}
	@Override
	public void criarContato(Pessoa pessoa) {
		this.comNome(pessoa.getNome());
		this.endereco(pessoa.getEndereco());
		this.telefone(pessoa.getTelefone());
		this.email(pessoa.getEmail());
	}
}
