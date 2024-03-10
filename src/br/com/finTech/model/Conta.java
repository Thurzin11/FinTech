package br.com.finTech.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	private Integer tipoConta;
	private Integer numero;
	private Double saldo;
	private Double limite;
	List<Transacao> extrato = new ArrayList<>();
	private String banco;
	
	public Conta() {
		
	}

	public Integer getTipo() {
		return tipoConta;
	}

	public void setTipo(Integer tipo) {
		this.tipoConta = tipo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public List<Transacao> getExtrato() {
		return extrato;
	}

	public void setExtrato(List<Transacao> extrato) {
		this.extrato = extrato;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public Integer gerarNumero() {
		return this.tipoConta;

	}

	public void registrarTransacao(Transacao transacao) {

	}

	public void verSaldo() {
		System.out.println(this.saldo);

	}

}
