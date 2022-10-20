package com.entra21.eventoapp.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
public class Convidado {
	
	@Id
	@NotEmpty
	private String nomeConvidado;
	@NotBlank
	private String rg;
	
	private double proventos;
	
	private double soma;
	
	private double cotacao;
	
	private double rentabilidade;
	
	private String setor;
	
	private double investido;
	
	@ManyToOne
	private Evento evento;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public double getProventos() {
		return proventos;
	}
	public void setProventos(double proventos) {
		this.proventos = proventos;
	}
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
			
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public double getSoma() {
		return soma;
	}
	public void setSoma(double soma) {
		this.soma = soma;
		
	}
	public double getInvestido() {
		return investido;
	}
	public void setInvestido(double investido) {
		this.investido = investido;
	}
	public double getRentabilidade() {
		return rentabilidade;
	}
	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	public double getCotacao() {
		return cotacao;
	}
	public void setCotacao(double cotacao) {
		this.cotacao = cotacao;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	

	}
		

