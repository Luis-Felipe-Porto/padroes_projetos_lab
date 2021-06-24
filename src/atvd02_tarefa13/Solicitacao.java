package atvd02_tarefa13;

public interface Solicitacao {
	String resposta(Requisicao requisicao,Conta conta);
	void setProximo(Solicitacao proximo);
}
