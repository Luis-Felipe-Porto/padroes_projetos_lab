package tarefa10;

import tarefa10.models.Funcionario;

public class PagamentoFuncionario implements Pagamento {
	private Funcionario funcionario;
	
	public PagamentoFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	@Override
	public double paga() {
		return this.funcionario.depositaNaConta();
	}
}
