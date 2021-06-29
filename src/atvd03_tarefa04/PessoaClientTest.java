package atvd03_tarefa04;

import atvd03_tarefa04.contatos.builder.ContatoBuilder;
import atvd03_tarefa04.contatos.builder.ContatoCompletoBuilder;
import atvd03_tarefa04.contatos.builder.ContatoInternetBuilder;
import atvd03_tarefa04.contatos.builder.ContatoTelefoneBuilder;

public class PessoaClientTest {
	
	public static void main(String[] args) {
		//Director
		Agenda agenda = new Agenda();
		Pessoa p = new Pessoa("Felipe","Rua Novo horizonte Casa 08","09875-8986","luis@porto.com");
		
		//Builders
		ContatoBuilder c1 = new ContatoInternetBuilder();
		ContatoBuilder c2 = new ContatoTelefoneBuilder();
		ContatoBuilder c3 = new ContatoCompletoBuilder();
		
		agenda.salvarContato(c1,p);
		agenda.salvarContato(c2,p);
		agenda.salvarContato(c3,p);
		
		System.out.println(c1.getContato());
		System.out.println(c2.getContato());
		System.out.println(c3.getContato());
	}
}
