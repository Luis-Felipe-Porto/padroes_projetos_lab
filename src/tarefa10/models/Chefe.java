package tarefa10.models;

public class Chefe {
	private double salarioBase;
	private double bonificacoes;
	
	public Chefe(double salarioBase, double bonificacoes) {
		super();
		this.salarioBase = salarioBase;
		this.bonificacoes = bonificacoes;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public double getBonificacoes() {
		return bonificacoes;
	}
	public double depositaNaConta() {
		return this.salarioBase + this.bonificacoes;
	}
	@Override
	public String toString() {
		return " [\n\tsalarioBase : " + salarioBase + ",\n\tbonificacoes : " + bonificacoes + "\n]";
	}
}
