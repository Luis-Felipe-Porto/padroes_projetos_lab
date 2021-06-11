package tarefa10.models;

public class Funcionario {
	private double salario;
	private double bonus;
	
	public Funcionario(double salario, double bonus) {
		super();
		this.salario = salario;
		this.bonus = bonus;
	}
	public double getSalario() {
		return salario;
	}
	public double getBonus() {
		return bonus;
	}
	public double depositaNaConta() {
		return this.salario + this.bonus;
	}
	@Override
	public String toString() {
		return " [\n\tsalario : " + salario + ",\n\tbonus : " + bonus + "\n]";
	}
	

	
}
