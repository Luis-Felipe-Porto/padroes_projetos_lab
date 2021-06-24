package atvd02_tarefa13.solicitacoes;

import atvd02_tarefa13.Conta;
import atvd02_tarefa13.Formato;
import atvd02_tarefa13.Requisicao;
import atvd02_tarefa13.Solicitacao;

public class RespostaFormatoJSON implements Solicitacao{
	
	private Solicitacao proximo;
	
	@Override
	public String resposta(Requisicao requisicao,Conta conta) {
		if(requisicao.getFormato().equals(Formato.JSON)) {
		      return "{ numero: "+conta.getTitular()+", saldo:"+conta.getSaldo()+" }";
		    }
		    else {
		      return proximo.resposta(requisicao,conta);
		    }
	}
	@Override
	public void setProximo(Solicitacao proximo) {
		this.proximo = proximo;		
	}
}
