package tarefa11;

import java.util.Random;

public class FormaIvestimentoStrategy implements InvestimentoStrategy {
	
	@Override
	public double investir(ContaBancaria conta) {
		
		if(conta.getTipoInvestimento().equals(TipoInvestimento.CONSERVADOR)) {
			conta.creditarValor(conta.getSaldo()*0.8);
		}
		
		if(conta.getTipoInvestimento().equals(TipoInvestimento.MODERADO)) {
			Random random = new Random();
			boolean escolhido = random.nextDouble() > 0.50;
			conta.creditarValor(conta.getSaldo()*(escolhido==true?0.7:2.5));
		}
		
		if(conta.getTipoInvestimento().equals(TipoInvestimento.ARROJADO)) {
			Random random = new Random();
			conta.creditarValor(conta.getSaldo()*porcentagemSobreChance(random));
		}
		return conta.getSaldo();
	}
	private double porcentagemSobreChance(Random random) {
		double porcentagem = 0;
		if(random.nextDouble() > 0.20) {
			porcentagem = 0.05;
		}
		if(random.nextDouble() > 0.30) {
			porcentagem = 0.03;
		}
		if(random.nextDouble() > 0.50) {
			porcentagem = 0.006;
		}
		return porcentagem;
	}
}
