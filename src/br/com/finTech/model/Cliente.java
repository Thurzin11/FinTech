package br.com.finTech.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String email;
	private String cpf;
	private List<Conta> contas = new ArrayList<>();

	public Cliente() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		contas = contas;
	}

	public void criarConta(int tipoConta) {
		switch (tipoConta) {
		case 1: {
			ContaCorrente corrente = new ContaCorrente();
			this.contas.add(corrente);
			corrente.gerarNumero();
			break;
		}

		case 2: {
			ContaPoupanca poupanca = new ContaPoupanca();
			this.contas.add(poupanca);
			break;
		}

		case 3: {
			ContaInvestimento investimento = new ContaInvestimento();
			this.contas.add(investimento);
			break;

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipoConta);
		}

	}

	public void listarContas() {
		
		for (Conta conta : contas) {
			System.out.println("Conta \n"+ conta.getNumero());
			System.out.println(conta.getTipo());
			System.out.println(conta.getSaldo());
			System.out.println(conta.getLimite());


		}
	}

	public void encerrarConta() {

	}

}
