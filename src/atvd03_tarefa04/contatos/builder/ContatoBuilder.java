package atvd03_tarefa04.contatos.builder;

import atvd03_tarefa04.Pessoa;


public abstract class ContatoBuilder {
	
	public abstract String getContato();
	public abstract void criarContato(Pessoa pessoa);
}
