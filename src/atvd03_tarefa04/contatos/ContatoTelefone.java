package atvd03_tarefa04.contatos;

public class ContatoTelefone extends Contato{
	private String telefone;
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return " [\n\ttelefone : " + telefone + ",\n\tgetNome() : " + getNome() + "\n]";
	}

	
	
}
