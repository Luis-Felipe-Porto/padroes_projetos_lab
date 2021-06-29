package avaliacao.tarefa07;

public abstract class Relatorio {
	
	abstract String cabecalho();
	abstract String corpo();
	abstract String rodape();
	
	public void gerarRelatorio() {
		System.out.println(cabecalho());
		System.out.println(corpo());
		System.out.println(rodape());
	}
}
