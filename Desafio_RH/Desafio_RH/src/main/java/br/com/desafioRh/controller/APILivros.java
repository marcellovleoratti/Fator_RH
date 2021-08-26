package br.com.desafioRh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.faces.action.RequestMapping;

import br.com.desafioRh.model.Livro;
import br.com.desafioRh.repository.Livro_repository;

@RestController
@RequestMapping("/api/livro")
public class APILivros {
	
	@Autowired
	Livro_repository rp;
	
	@GetMapping()
	public List<Livro> getLivros(){
		return rp.findAll();
	}
	
	@GetMapping("/{isbn}")
	public @ResponseBody Livro getLivroById(@PathVariable Long isbn) {
		
		Optional<Livro> livro = rp.findById(isbn);
		return livro.get();
	}
	
	@PostMapping()
	public void livro(@RequestBody Livro livro) {
		rp.save(livro);
	}
	
}
