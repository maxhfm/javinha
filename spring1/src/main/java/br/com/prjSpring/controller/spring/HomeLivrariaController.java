package br.com.prjSpring.controller.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.prjSpring.model.spring.Livro;

@Controller

public class HomeLivrariaController {
	
	@RequestMapping("/livraria")
	public String homelivraria(){
		return "livraria";
	}

}
