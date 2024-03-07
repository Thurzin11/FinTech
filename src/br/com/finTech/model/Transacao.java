package br.com.finTech.model;

public class Transacao implements IConta{
	
	private Integer tipo;
	private IConta contaDe;
	private IConta contaPara;
	private Double valor;

	
	


	public Transacao() {
		
	}


	public Integer getTipo() {
		return tipo;
	}


	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}


	public IConta getContaDe() {
		return contaDe;
	}


	public void setContaDe(IConta contaDe) {
		this.contaDe = contaDe;
	}


	public IConta getContaPara() {
		return contaPara;
	}


	public void setContaPara(IConta contaPara) {
		this.contaPara = contaPara;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public boolean efetuarTransacao() {
		
	}
	
	public void verSaldo() {
		
	}
	
	public void registrarTransacao() {
		
	}
}
