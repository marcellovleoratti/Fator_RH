package br.com.desafioRh.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioRh.model.Autores;



public interface Autores_repository extends JpaRepository<Autores, Long>{
	
	public List<Autores> findByIdAutores(Long idAutores);
	public List<Autores> findByAutores(String autores);

}
