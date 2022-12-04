package es.sarman.learnspring.springbootdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import es.sarman.learnspring.springbootdi.models.service.IMiServicio;

@Controller
public class IndexController {
	
	@Autowired
	@Qualifier("MiServicioSimple")
	private IMiServicio miServicio;
	
	@GetMapping({"/index", "/", ""})
	public String index(Model model) {
		model.addAttribute("objeto", miServicio.operacion());
		return "index";
	}

	public void setMiServicio(IMiServicio miServicio) {
		this.miServicio = miServicio;
	}
	
	
	
}
