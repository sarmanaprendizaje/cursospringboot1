package es.sarman.learnspring.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamController {
	
	@GetMapping()
	public String index() {
		return "params/index";
	}

	@GetMapping("/string")
	public String param(@RequestParam(defaultValue = "null") String texto, Model model) {
		model.addAttribute("resultado", "El texto enviado es: " + texto);
		model.addAttribute("titulo", "Recibir parametros");
		return "/params/ver";
	}
	
	@GetMapping("/mix-params")
	public String mixParams(@RequestParam String saludo, @RequestParam int numero, Model model) {
		model.addAttribute("resultado", "El saludo es: " + saludo + ". El numero es: " + numero);
		model.addAttribute("titulo", "Recibir parametros");
		return "/params/ver";
	}
}
