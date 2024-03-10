package br.com.finTech;

import java.util.Scanner;

import br.com.finTech.model.Cliente;

public class Main {

	public static void main(String[] args) {
		int escolha = 0;

		Scanner scanner = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		while (escolha != 4) {
			System.out.println("Escolha uma opcao: \n 1 Criar Conta \n 2 Encerrar Conta \n 3 Listar Contas \n 4 Sair");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1: {
				Integer tipoConta;
				System.out.println("Escolha uma opcao: \n 1 Conta Corrente \n 2 Conta Poupança \n 3 Conta Investimento");
				tipoConta = scanner.nextInt();
				cliente.criarConta(tipoConta);
				break;
			}
			case 2: {
				Integer excluirConta;
				System.out.println("Informe o codigo de uma conta que voce quer encerrar");
				excluirConta = scanner.nextInt();
				break;
			}
			case 3:{				
				cliente.listarContas();
				break;
			}
			case 4:
				System.out.println("Voce Saiu, Obrigado!!!");
			}

		}


	}

}
