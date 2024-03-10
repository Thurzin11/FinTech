package br.com.finTech.model;

public class Transacao  {
	
	private Integer tipo;
	private Conta contaDe;
	private Conta contaPara;
	private Double valor;

	
	


	public Transacao() {
		
	}

	
	public Integer getTipo() {
		return tipo;
	}



	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}



	public Conta getContaDe() {
		return contaDe;
	}



	public void setContaDe(Conta contaDe) {
		this.contaDe = contaDe;
	}



	public Conta getContaPara() {
		return contaPara;
	}



	public void setContaPara(Conta contaPara) {
		this.contaPara = contaPara;
	}



	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}



	public boolean efetuarTransacao() {
		return false;
		
	}
	
	
	public void verSaldo() {
		
	}
	
	public void registrarTransacao() {
		
	}
}
