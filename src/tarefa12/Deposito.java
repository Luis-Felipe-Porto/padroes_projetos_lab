package tarefa12;

import java.util.Calendar;

public class Deposito {
	private String numEnvelope;
	private Movimentacao movimentacao;
	
	public Deposito(String numEnvelope,double valor, Conta conta,Calendar data) {
		this.numEnvelope = numEnvelope;
		this.movimentacao = new Movimentacao(valor,conta,data);
	}
	
	public String getNumEnvelope() {
		return numEnvelope;
	}
	public Movimentacao getMovimentacao() {
		return movimentacao;
	}

	@Override
	public String toString() {
		return " [\n\tnumEnvelope : " + numEnvelope + ",\n\tmovimentacao : " + movimentacao + "\n]";
	}
	
}
