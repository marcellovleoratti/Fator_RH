package br.com.desafioRh.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Criticas {
	
	@Id
	@NotNull
	@NotEmpty(message="Digite o Código da Critica")
	private Long idCriticas;
	
	@NotEmpty(message="Digite as Criticas")
	private String criticas;
}
