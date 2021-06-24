package atvd02_tarefa13;

import atvd02_tarefa13.solicitacoes.RespostaFormatoCSV;
import atvd02_tarefa13.solicitacoes.RespostaFormatoJSON;
import atvd02_tarefa13.solicitacoes.RespostaFormatoXML;

public class ServidorAppBancario {
	public String request(Requisicao requisicao,Conta conta) {
		
		Solicitacao comJSON = new RespostaFormatoJSON();
		Solicitacao comXML = new RespostaFormatoXML();
		Solicitacao comCSV = new RespostaFormatoCSV();
		
		comJSON.setProximo(comXML);
		comXML.setProximo(comCSV);
		return comJSON.resposta(requisicao,conta);
	}
}
