package es.sarman.learnspring.springbootdi.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component("MiServicioSencillo")
// @Primary
public class MiServicio implements IMiServicio {
	
	@Override
	public String operacion() {
		return "ejecutando proceso improtante...";
	}
	
}
