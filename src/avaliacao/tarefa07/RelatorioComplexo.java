package avaliacao.tarefa07;

import java.time.LocalDate;
import java.util.ArrayList;

import atvd02_tarefa11.models.Banco;
import atvd02_tarefa11.models.Conta;

public class RelatorioComplexo extends Relatorio{
	
	private ArrayList<Conta> contas;
	private Banco banco;
	
	public RelatorioComplexo(ArrayList<Conta>contas,Banco banco) {
		this.contas = contas;
		this.banco = banco;
	}
	
	
	@Override
	String cabecalho() {
		StringBuilder textRelatorio = new StringBuilder();
		textRelatorio.append("Banco:")
		.append(banco.getNome())
		.append(" Endereço: ")
		.append(banco.getEndereco())
		.append(" Telefone: ")
		.append(banco.getTelefone())
		.append("\n-----------------------------\n");	
		return textRelatorio.toString();
	}
	@Override
	String corpo() {
		StringBuilder textRelatorio = new StringBuilder();
		contas.stream().forEach(conta->{
			textRelatorio.append("Titular:")
			.append(conta.getTitular())
			.append(" Numero:")
			.append(conta.getNumero())
			.append(" Agencia:")
			.append(conta.getAgencia())
			.append(" Saldo:")
			.append(conta.getSaldo())
			.append("\n");
		});
		return textRelatorio.toString();
	}
	@Override
	String rodape() {
		StringBuilder textRelatorio = new StringBuilder();
		textRelatorio.append("Email:")
		.append(banco.getEmail())
		.append(" Data: ")
		.append(LocalDate.now())
		.append("\n-----------------------------\n");	
		return textRelatorio.toString();
	}
}
