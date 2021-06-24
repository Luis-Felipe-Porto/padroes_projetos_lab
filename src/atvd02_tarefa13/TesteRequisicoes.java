package atvd02_tarefa13;

public class TesteRequisicoes {
	public static void main(String[] args) {
		Conta conta = new Conta("8756",2000);

		Requisicao requisicao = new Requisicao(Formato.CSV);
		Requisicao requisicao1 = new Requisicao(Formato.JSON);
		Requisicao requisicao2 = new Requisicao(Formato.XML);
		ServidorAppBancario app = new ServidorAppBancario();
		
		 
		 System.out.println(app.request(requisicao1,conta));
		 System.out.println(app.request(requisicao2,conta));
		 System.out.println(app.request(requisicao,conta));
	}
}
