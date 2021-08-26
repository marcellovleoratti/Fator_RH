package br.com.desafioRh.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioRh.model.Livro;

public interface Livro_repository extends JpaRepository<Livro, Long>{
	
	public List<Livro> findByISBN(Long isbn);
	public List<Livro> findByTitulo(String titulo);
	public List<Livro> findByAutores(String autores);
	public List<Livro> findByEditora(String editora);
	public List<Livro> findByData_Publicacao(LocalDate data_publicacao);
	public List<Livro> findByPreco(BigDecimal preco);

}
