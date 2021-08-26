package br.com.desafioRh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Criticas extends JpaRepository<Criticas, Long> {
	
	public List<Criticas> findByIdCriticas(Long idCriticas);


}
