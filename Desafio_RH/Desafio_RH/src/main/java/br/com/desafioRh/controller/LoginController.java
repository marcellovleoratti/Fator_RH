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


import br.com.desafioRh.model.Login;
import br.com.desafioRh.repository.Login_repository;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	Login_repository lrp;
	
	@PostMapping("/{id}")
	public String excluir(@PathVariable Long id) {
		lrp.deleteById(id);
		return "redirect:/login";
	}
	
	
	@RequestMapping("/form/{id}")
	public String editar(@PathVariable Long id, Model model) {
		Login login = lrp.getById(id);
		model.addAttribute("login",login);
	    return "cadastro-login";
	}
	
	@RequestMapping("/salvar")
	public ModelAndView salvar(@Valid @ModelAttribute Login login, Errors erros) {
		
		ModelAndView mv = new ModelAndView("cadastro-login");
		
		if(erros.hasErrors()) {
			return mv;
		}
		lrp.save(login);
		mv.addObject("login",login);
		return mv;
	}

}
