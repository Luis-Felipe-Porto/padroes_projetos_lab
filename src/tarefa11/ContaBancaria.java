package tarefa11;

public class ContaBancaria {
	private double saldo;
	private TipoInvestimento tipoInvestimento;
	
	public ContaBancaria(double saldo, TipoInvestimento tipoInvestimento) {
		super();
		this.saldo = saldo;
		this.tipoInvestimento = tipoInvestimento;
	}

	public TipoInvestimento getTipoInvestimento() {
		return tipoInvestimento;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public double creditarValor(double valor) {
		return this.saldo+=valor;
	}
}
