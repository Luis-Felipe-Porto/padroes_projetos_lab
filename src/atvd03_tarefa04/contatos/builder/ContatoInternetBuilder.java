package atvd03_tarefa04.contatos.builder;

import atvd03_tarefa04.Pessoa;
import atvd03_tarefa04.contatos.ContatoInternet;

public class ContatoInternetBuilder extends ContatoBuilder{
	
	private ContatoInternet contato = new ContatoInternet();
	
	private void comNome(String nome) {
		this.contato.setNome(nome);
	}
	private void  email(String email) {
		this.contato.setEmail(email);
	}
	@Override
	public String getContato() {
		return contato.toString();
	}
	public void criarContato(Pessoa pessoa) {
		this.comNome(pessoa.getNome());
		this.email(pessoa.getEmail());
	}
}
