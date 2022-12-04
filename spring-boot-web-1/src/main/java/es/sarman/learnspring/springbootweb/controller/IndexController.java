package es.sarman.learnspring.springbootweb.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import es.sarman.learnspring.springbootweb.TextosPropertiesConfig;
import es.sarman.learnspring.springbootweb.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Autowired TextosPropertiesConfig textosPropertiesConfig;

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("titulo", textosPropertiesConfig.texto);
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Andrés");
		usuario.setApellido("Guzmán");
		// usuario.setEmail("andres@email.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil usuario");
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Lista de usuarios");
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios() {
		List<Usuario> usuarios = Arrays.asList(
				new Usuario("Andrés", "Guzmán", "andres@email.com"),
				new Usuario("Jane", "Guzmán", "Jane@email.com"),
				new Usuario("John", "Guzmán", "John@email.com"),
				new Usuario("Tornado", "Roe", "roe@email.com")
				);
		return usuarios;
	}
	
}
