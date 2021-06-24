package atvd02_tarefa07;

public class TestImposto {
	public static void main(String[] args) {
	       Imposto icms = new ICMS();
	       Imposto iss = new ISS();

	       Orcamento orcamento = new Orcamento(400);

	       CalculoImposto calculoImposto = new CalculoImposto();
	       System.out.println(calculoImposto.calcularImposto(icms, orcamento));
	       System.out.println(calculoImposto.calcularImposto(iss, orcamento));
	       
	}
}
