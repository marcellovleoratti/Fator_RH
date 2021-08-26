package br.com.desafioRh.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Autores {

	@Id
	@NotNull
	@NotEmpty(message="Digite o codigo do Autor")
	@ManyToMany
	private Long id;
	
	@NotNull
	@NotEmpty(message="Digite o nome do Autor")
	private String autores;

	@Override
	public String toString() {
		return "Autores [id=" + id + ", autores=" + autores + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}
		
}
