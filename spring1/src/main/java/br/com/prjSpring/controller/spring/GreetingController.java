package br.com.prjSpring.controller.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	//@RequestMapping garante que as solicitações HTML para /greting sejam mapeadas para o metodo greeting()
	@RequestMapping("/greeting")
	
	
	/*
	 * @RequestParam liga o valor da consulta name parâmetro String no parâmetro name do método greeting() . 
	 * Este parâmetro String String não é required ; se estiver ausente na solicitação, o valor defaultValue de "Mundo" é usado. 
	 * O valor do parâmetro name é adicionado a um objeto Model , tornando-o acessível ao modelo de exibição.
	 * 
	 * A implementação do corpo do método depende de uma tecnologia de exibição , neste caso Thymeleaf , para executar a renderização do 
	 * lado do servidor do HTML. Thymeleaf analisa o modelo greeting.html abaixo e avalia a expressão th:text para renderizar o 
	 * valor do parâmetro ${name} que foi configurado no controlador.
	 */
	
	public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model){
		model.addAttribute("name", name);
		return "greeting";
	}
	
	
}
