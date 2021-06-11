package tarefa10;

import tarefa10.models.Estagiario;

public class PagamentoEstagiario implements Pagamento {
	private Estagiario estagiario;
	
	public PagamentoEstagiario(Estagiario estagiario) {
		this.estagiario = estagiario;
	}
	
	@Override
	public double paga() {
		return this.estagiario.pagaBolsaComAuxilo();
	}
}
