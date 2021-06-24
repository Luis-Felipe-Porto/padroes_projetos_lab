package atvd02_tarefa11.models;

public class Conta {
	private String titular;
	private Double saldo;
	private String agencia;
	private String numero;

	public Conta(String titular, Double saldo, String agencia, String numero) {
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}
	public String getAgencia() {
		return agencia;
	}
	public String getNumero() {
		return numero;
	}
	public Double getSaldo() {
		return saldo;
	}
}
