package br.com.desafioRh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;


@Entity
public class Livro {
	
	@Id
	@NotEmpty(message="O ISBN deve ser Cadastrado")
	private Long isbn;
	
	@NotEmpty(message="O Titulo deve ser Cadastrado")
	private String titulo;
	
	@NotEmpty(message="O Autor deve ser Cadastrado")
	private String autores;
	
	@NotEmpty(message="O nome da Editora deve ser Cadastrado")
	private String editora;
	
	@Column(columnDefinition = "DATE")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotNull(message="Data deve ser informada!")
	private LocalDate data_publicacao;
	
	@NumberFormat(pattern="#,##0.00")
	@NotNull(message= "Algum valor deve ser informado!")
	@DecimalMin(value="1.00", message="Valor mínimo deve ser maior ou igual a 1,00")
	private BigDecimal preco;
	
	private String criticas;

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autores=" + autores + ", editora=" + editora + ", data_publicacao="
				+ data_publicacao + ", preco=" + preco + ", criticas=" + criticas + "]";
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public LocalDate getData_publicacao() {
		return data_publicacao;
	}

	public void setData_publicacao(LocalDate data_publicacao) {
		this.data_publicacao = data_publicacao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getCriticas() {
		return criticas;
	}

	public void setCriticas(String criticas) {
		this.criticas = criticas;
	}
}
