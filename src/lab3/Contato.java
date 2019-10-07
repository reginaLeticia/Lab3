package lab3;

public class Contato {

	private String nome;
	private String sobrenome;
	private String telefone;

	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean equals(Contato c2) {

		if (nome.equals(c2.getNome()) && sobrenome.equals((c2.getSobrenome()))) {

			return false;

		} else

			return true;
	}

	public String toString() {
		return nome + " " + sobrenome + " - " + telefone;
	}

}
