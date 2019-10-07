package lab3;

import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("(C)adastrar Contato");
		System.out.println("(L)istar Contatos");
		System.out.println("(E)xibir Contato");
		System.out.println("(S)air");
		System.out.println();
		System.out.println("Opção");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Agenda agenda = new Agenda();

		menu();
		String operacao = input.nextLine();

		do {
			switch (operacao) {
			
			case "C":

				System.out.println("Posição: ");
				int posicao = input.nextInt();
				System.out.println("Nome: ");
				String nome = input.next();
				System.out.println("Sobrenome: ");
				String sobrenome = input.next();
				System.out.println("Telefone: ");
				String telefone = input.next();

				String mensagem = agenda.cadastrarContato(posicao, nome, sobrenome, telefone);
				System.out.println(mensagem);

				break;

			case "L":
				
				System.out.println(agenda.listarContatos());
				
				break;
			
			case "E":
				
				System.out.println("Digite o número correspondente ao contato desejado");
				int pos= input.nextInt();
				String cont = agenda.exibirContato(pos);
				System.out.println(cont);
				
				break;
				
				
			default:
				break;
			}

			menu();
			operacao = input.nextLine();

		} while (!(operacao.equals("S")));
	}
}
