package br.com.desafioRh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Login {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="O Usuário deve ser Digitado!!")
	@NotNull
	private String 	usuario;
	
	@NotEmpty(message="A senha deve ser Digitada!!")
	private String senha;

}
