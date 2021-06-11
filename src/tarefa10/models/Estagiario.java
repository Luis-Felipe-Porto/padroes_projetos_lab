package tarefa10.models;

public class Estagiario {
	
	private double bolsa;
	private double auxilios;
	
	public Estagiario(double bolsa, double auxilios) {
		super();
		this.bolsa = bolsa;
		this.auxilios = auxilios;
	}
	public double getBolsa() {
		return bolsa;
	}
	public double getAuxilios() {
		return auxilios;
	}
	public double pagaBolsaComAuxilo() {
		return this.bolsa + this.auxilios;
	}
	@Override
	public String toString() {
		return " [\n\tbolsa : " + bolsa + ",\n\tauxilios : " + auxilios + "\n]";
	}
}
