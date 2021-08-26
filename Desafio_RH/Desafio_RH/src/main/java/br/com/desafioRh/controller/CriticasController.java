package br.com.desafioRh.controller;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CriticasController {

	@Id
	@NotNull
	@ManyToMany
	@NotEmpty(message="Digite o Código da Critica")
	private Long idcriticas;
	
	@NotNull
	@NotEmpty(message="Digite a Critica")
	private String criticas;

	@Override
	public String toString() {
		return "CriticasController [idcriticas=" + idcriticas + ", criticas=" + criticas + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Long getIdcriticas() {
		return idcriticas;
	}

	public void setIdcriticas(Long idcriticas) {
		this.idcriticas = idcriticas;
	}

	public String getCriticas() {
		return criticas;
	}

	public void setCriticas(String criticas) {
		this.criticas = criticas;
	} 

}
