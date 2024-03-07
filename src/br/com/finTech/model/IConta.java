package br.com.finTech.model;

import java.util.ArrayList;
import java.util.List;

public interface IConta {
	
	Integer numero = 0;
	Double saldo = 0.0;
	Double limite = 0.0;
	List<Transacao> Extrato = new ArrayList<>();
	String banco = "";
	
	
	private Integer gerarNumero()  {
		return 0;
	}
	
	public void registrarTransacao();
	
	public void verSaldo();
	

}
