package avaliacao.tarefa07;

import java.util.ArrayList;

import atvd02_tarefa11.models.Banco;
import atvd02_tarefa11.models.Conta;

public class TestRelatorio {
	
	public static void main(String[] args) {
		
		Banco banco = new Banco("INTER","Rua Nova,Minas Gerais","1002-988","inter.digital@service.com");
		Conta c1 = new Conta("felipe",2000d,"3774","44444");
		Conta c2 = new Conta("Luis",5000d,"233","7888");
		Conta c3 = new Conta("Porto",100d,"455","655");
		
		ArrayList<Conta> contas= new ArrayList<Conta>();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		Relatorio relatorio = new RelatorioSimples(contas,banco);
		Relatorio relatorio2 = new RelatorioComplexo(contas,banco);
		relatorio.gerarRelatorio();
		relatorio2.gerarRelatorio();
		
	}
}
