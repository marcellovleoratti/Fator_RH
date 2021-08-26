package br.com.desafioRh.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sun.faces.action.RequestMapping;



import br.com.desafioRh.model.Livro;
import br.com.desafioRh.repository.Livro_repository;

@Controller
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	private Livro_repository rp;
	
	@PostMapping("/{isbn}")
	public String excluir(@PathVariable Long isbn) {
		rp.deleteById(isbn);
		return "redirect:/livro";
	}
	
	
	@RequestMapping("/form/{isbn}")
	public String editar(@PathVariable Long isbn, Model model) {
		Livro livro = rp.getById(isbn);
		model.addAttribute("livro",livro);
	    return "cadastro-livro";
	}
	
	@RequestMapping("/salvar")
	public ModelAndView salvar(@Valid @ModelAttribute Livro livro, Errors erros) {
		
		ModelAndView mv = new ModelAndView("cadastro-livro");
		
		if(erros.hasErrors()) {
			return mv;
		}
		rp.save(livro);
		mv.addObject("livro",livro);
		return mv;
	}
}
