package lab3;

public class Agenda {

	private Contato[] contatos;

	public Agenda() {

		contatos = new Contato[100];

	}

	public String cadastrarContato(int posicao, String nome, String sobrenome, String telefone) {

		if (posicao > 100 || posicao < 1) {
			return "POSIÇÃO INVÁLIDA!";
		} else {
			contatos[posicao] = new Contato(nome, sobrenome, telefone);
			return "CADASTRO REALIZADO!";
		}
	}

	public String exibirContato(int posicao) {
		if (posicao < 1 || posicao > 100) {
			return "POSIÇÃO INVÁLIDA";
		} else if (contatos[posicao - 1] != null) {
			return contatos[posicao - 1].toString();
		} else {
			return "POSIÇÃO OCUPADA!";

		}
	}

	public String listarContatos() {
		String saida = "";
		for (int i = 0; i <= contatos.length; i++) {
			if (contatos[i] != null) {
				saida += i + "- " + contatos[i].getNome() + " " + contatos[i].getSobrenome() + "\n";
			} 
		}
		if (saida.isEmpty()) {
			saida = "Agenda vazia";
		}
		return saida;
	}

	public boolean equals(Agenda agenda) {
		Contato[] meusctt = this.contatos;
		Contato[] outroctt = agenda.contatos;
		if (meusctt.length != outroctt.length) {
			return false;
		} else {
			for (int i = 0; i < meusctt.length; i++) {
				Contato c1 = meusctt[i];
				Contato c2 = outroctt[i];
				if (!(c1.equals(c2))) {
					return false;
				}
			}
		}
		return true;
	}
}
