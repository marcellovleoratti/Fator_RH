package br.com.desafioRh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desafioRh.model.Login;

public interface Login_repository extends JpaRepository<Login, Long>{

	public List<Login> findByIdLogin(Long id);
	public List<Login> findByNome(String nome);
	public List<Login> findByUsuario(String usuario);
	
}
