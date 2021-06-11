package tarefa10;

import tarefa10.models.Chefe;

public class PagamentoChefe implements Pagamento{
	private Chefe chefe;
	
	public PagamentoChefe(Chefe chefe) {
		this.chefe = chefe;
	}
	@Override
	public double paga() {
		return this.chefe.depositaNaConta();	
	}
}
