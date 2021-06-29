package atvd03_tarefa04;

import atvd03_tarefa04.contatos.builder.ContatoBuilder;

public class Agenda {
	
	public void salvarContato(ContatoBuilder builder,Pessoa pessoa) {
		builder.criarContato(pessoa);
	}

}
