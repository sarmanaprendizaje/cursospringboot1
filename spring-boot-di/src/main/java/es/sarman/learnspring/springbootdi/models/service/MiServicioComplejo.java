package es.sarman.learnspring.springbootdi.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component("MiServicioComplejo")
public class MiServicioComplejo implements IMiServicio {
	
	@Override
	public String operacion() {
		return "ejecutando proceso complejo improtante...";
	}
	
}
