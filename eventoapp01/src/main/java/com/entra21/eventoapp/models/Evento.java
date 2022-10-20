package com.entra21.eventoapp.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;



@Entity
public class Evento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
	@NotBlank
	private String nomeDaCarteira;
//	@NotBlank
//	private String local;
//	@NotBlank
//	private String data;
//	@NotBlank
//	private String horario;
	
	@OneToMany
	private List<Convidado> convidados;
	
		
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNomeDaCarteira() {
		return nomeDaCarteira;
	}
	public void setNomeDaCarteira(String nomeDaCarteira) {
		this.nomeDaCarteira = nomeDaCarteira;
	}
//	public String getLocal() {
//		return local;
//	}
//	public void setLocal(String local) {
//		this.local = local;
//	}
//	public String getData() {
//		return data;
//	}
//	public void setData(String data) {
//		this.data = data;
//	}
//	public String getHorario() {
//		return horario;
//	}
//	public void setHorario(String horario) {
//		this.horario = horario;
	
	public List<Convidado> getConvidados() {
		return convidados;
	}
	public void setConvidados(List<Convidado> convidados) {
		this.convidados = convidados;
	}

	
}
