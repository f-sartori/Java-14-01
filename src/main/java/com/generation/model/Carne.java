package com.generation.model;

import java.util.List;

public class Carne {
	
	
	Integer id;
	String tipo;
	Integer qtd;
	Double precoKg;
	
	
	public Carne(Integer id, String tipo, Integer qtd, Double precoKg) {
		
		this.id = id;
		this.tipo = tipo;
		this.qtd = qtd;
		this.precoKg = precoKg;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Integer getQtd() {
		return qtd;
	}


	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}


	public Double getPrecoKg() {
		return precoKg;
	}


	public void setPrecoKg(Double precoKg) {
		this.precoKg = precoKg;
	}


	@Override
	public String toString() {
		return "Carne:  Id = " + id + ", Tipo = " + tipo + ", Quantidade = " + qtd + ", Preço quilo = " + precoKg + "]";
	}
	
	
	
	
	
}
