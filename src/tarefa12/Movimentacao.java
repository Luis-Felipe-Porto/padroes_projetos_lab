package tarefa12;

import java.util.Calendar;

public class Movimentacao {
	private double valor;
	private Conta conta;
	private Calendar data;
	
	public Movimentacao(double valor, Conta conta, Calendar data) {
		this.valor = valor;
		this.conta = conta;
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public Conta getConta() {
		return conta;
	}
	public Calendar getData() {
		return data;
	}
	@Override
	public String toString() {
		return " [\n\tvalor : " + valor + ",\n\tconta : " + conta + ",\n\tdata : " + data.getTime() + "\n]";
	}

}
