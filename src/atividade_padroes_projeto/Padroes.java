package atividade_padroes_projeto;


import java.util.Calendar;

import tarefa10.PagamentoChefe;
import tarefa10.PagamentoEstagiario;
import tarefa10.PagamentoFuncionario;
import tarefa10.models.Chefe;
import tarefa10.models.Estagiario;
import tarefa10.models.Funcionario;
import tarefa11.ContaBancaria;
import tarefa11.FormaIvestimentoStrategy;
import tarefa11.TipoInvestimento;
import tarefa12.Conta;
import tarefa12.Deposito;
import tarefa12.Movimentacao;
import tarefa12.Pagamento;

public class Padroes {
	public static void main(String[] args) {
		System.out.println("Tarefa 10");
		
		Chefe chefe = new Chefe(10000, 500);
		Estagiario estagiario = new Estagiario(400, 150);
		Funcionario funcionario = new Funcionario(1200, 300);
		
		PagamentoChefe pagChefe = new PagamentoChefe(chefe);
		PagamentoEstagiario pagEstagiario = new PagamentoEstagiario(estagiario);
		PagamentoFuncionario pagFuncionario = new PagamentoFuncionario(funcionario);
		
		System.out.println(pagChefe.paga()+"\n"+pagEstagiario.paga()+"\n"+pagFuncionario.paga());
		
		System.out.println("Tarefa 11");

		ContaBancaria conta = new ContaBancaria(200, TipoInvestimento.MODERADO);
		FormaIvestimentoStrategy  invest = new FormaIvestimentoStrategy();
		System.out.println(invest.investir(conta));
		
		System.out.println("Tarefa 12");
		
		Movimentacao movimentacao = new Movimentacao(200, new Conta(), Calendar.getInstance());
		Pagamento pagamento = new Pagamento("Felipe","PIX",200, new Conta(), Calendar.getInstance());
		Deposito deposito = new Deposito("10",600,new Conta(),Calendar.getInstance());
		
		System.out.println(movimentacao.toString());
		System.out.println(pagamento.toString());
		System.out.println(deposito.toString());
	}
}
