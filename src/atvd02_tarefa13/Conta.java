package atvd02_tarefa13;

public class Conta {
	
	private String titular;
	private double saldo;
	
	
	public Conta(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
}
