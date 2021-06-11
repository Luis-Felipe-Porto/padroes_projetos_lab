package tarefa12;

import java.util.Calendar;

public class Pagamento {
	private String favorecido;
	private String formaDePagamento;
	private Movimentacao movimentacao;
	
	public Pagamento(String favorecido,String formaDePagamento,double valor, Conta conta,Calendar data) {
		this.favorecido = favorecido;
		this.formaDePagamento = formaDePagamento;
		this.movimentacao = new Movimentacao(valor,conta,data);
	}
	public String getFavorecido() {
		return favorecido;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public Movimentacao getMovimentacao() {
		return movimentacao;
	}
	@Override
	public String toString() {
		return " [\n\tfavorecido : " + favorecido + ",\n\tformaDePagamento : " + formaDePagamento
				+ ",\n\tmovimentacao : " + movimentacao + "\n]";
	}
	
}
