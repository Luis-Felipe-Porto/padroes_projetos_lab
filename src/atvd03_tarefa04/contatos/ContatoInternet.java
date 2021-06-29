package atvd03_tarefa04.contatos;

public class ContatoInternet extends Contato{
	
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return " [\n\temail : " + this.email + ",\n\tgetNome() : " + getNome() + "\n]";
	}
	
}
