package atvd02_tarefa08;

import atvd02_tarefa07.Imposto;
import atvd02_tarefa07.Orcamento;

public class ImpostoCondicional implements Imposto{
	
	@Override
	public double calcula(Orcamento orcamento) {
		double valor = 0;
		
		if(orcamento.getValor()<1000) {
			valor = orcamento.getValor()*0.5;
		}
		if(orcamento.getValor()>1000 && orcamento.getValor() < 3000) {
			valor = orcamento.getValor()*0.7;
		}
		if(orcamento.getValor() > 3000) {
			valor = (orcamento.getValor()*0.8) + 30;
		}
		
		return valor;
	}
}
