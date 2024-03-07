package br.com.finTech.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private String nome;
	private String email;
	private String cpf;
	private List<IConta> Contas = new ArrayList<>();
	
	
	
	
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
	public List<IConta> getContas() {
		return Contas;
	}
	public void setContas(List<IConta> contas) {
		Contas = contas;
	}
	

}
