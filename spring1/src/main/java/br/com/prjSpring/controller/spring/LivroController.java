package br.com.prjSpring.controller.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.prjSpring.model.spring.Livro;

@Controller
@RequestMapping("/livro")
public class LivroController {
	
	
	
	@RequestMapping("/adicionar")
	public String exibeformlivro(Model model){
		model.addAttribute("livro", new Livro());
		return "/livro/adicionar";
	}
	
	/*
	@RequestMapping("adicionaLivro")
	public String cadastraLivro(String livro){
		Livro addlivro = new Livro();
		addlivro.setNome(livro);
		return "livroAdicionado";
	}
	*/
}
