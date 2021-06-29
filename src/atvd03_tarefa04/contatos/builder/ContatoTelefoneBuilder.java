package atvd03_tarefa04.contatos.builder;

import atvd03_tarefa04.Pessoa;

import atvd03_tarefa04.contatos.ContatoTelefone;

public class ContatoTelefoneBuilder extends ContatoBuilder{
	
	private ContatoTelefone contato = new ContatoTelefone();
	
	private void comNome(String nome) {
		this.contato.setNome(nome);
	}
	private void telefone(String telefone) {
		this.contato.setTelefone(telefone);
	}
	@Override
	public String getContato() {
		return this.contato.toString();
	}
	public void criarContato(Pessoa pessoa) {
		this.comNome(pessoa.getNome());
		this.telefone(pessoa.getTelefone());
	}
	
}
