package atvd02_tarefa11;

import java.util.ArrayList;

import atvd02_tarefa11.models.Banco;
import atvd02_tarefa11.models.Conta;

public class RelatorioSimples extends Relatorio {
	
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	private Banco banco;
	
	public RelatorioSimples(ArrayList<Conta>contas,Banco banco) {
		this.contas = contas;
		this.banco = banco;
	}

	@Override
	String cabecalho() {
		StringBuilder textRelatorio = new StringBuilder();
			textRelatorio.append("Banco :")
			.append(banco.getNome())
			.append("\n-----------------------------\n");	
		return textRelatorio.toString();
	}

	@Override
	String corpo() {
		StringBuilder textRelatorio = new StringBuilder();
		contas.stream().forEach(conta->{
			textRelatorio.append("Titular:")
			.append(conta.getTitular())
			.append(" Saldo:")
			.append(conta.getSaldo())
			.append("\n");
		});
		return textRelatorio.toString();
	}

	@Override
	String rodape() {
		StringBuilder textRelatorio = new StringBuilder();
		textRelatorio.append("Telefone:")
		.append(banco.getTelefone())
		.append("\n-----------------------------\n");	
	return textRelatorio.toString();
	}
	
}
