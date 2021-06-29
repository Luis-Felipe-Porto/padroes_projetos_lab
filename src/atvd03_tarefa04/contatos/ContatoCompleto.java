package atvd03_tarefa04.contatos;

public class ContatoCompleto extends Contato{
	private String endereco;
	private String telefone;
	private String email;
	
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return " [\n\tnome : " +super.getNome()+",\n\tendereco : " +  endereco + ",\n\ttelefone : " + telefone + ",\n\temail : " + email + "\n]";
	}
	
}
