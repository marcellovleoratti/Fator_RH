package br.com.desafioRh.controller;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class AutoresController {

	@Id
	@NotNull
	private BigInteger id;
	
	@NotNull
	@NotEmpty(message="Digite o nome do Autor")
	private String autores;

	@Override
	public String toString() {
		return "AutoresController [autores=" + autores + "]";
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}
	
}
