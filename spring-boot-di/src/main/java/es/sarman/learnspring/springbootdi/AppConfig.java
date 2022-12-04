package es.sarman.learnspring.springbootdi;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.sarman.learnspring.springbootdi.models.domain.ItemFactura;
import es.sarman.learnspring.springbootdi.models.domain.Producto;
import es.sarman.learnspring.springbootdi.models.service.IMiServicio;
import es.sarman.learnspring.springbootdi.models.service.MiServicio;
import es.sarman.learnspring.springbootdi.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("MiServicioSimple")
	public IMiServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("MiServicioComplejo")
	public IMiServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean
	public List<ItemFactura> registrarItems() {
		Producto producto = new Producto("cmaara sony", 100);
		Producto producto2 = new Producto("Bicicleta hitachi", 200);
		
		ItemFactura itemFactura = new ItemFactura(producto, 2);
		ItemFactura itemFactura2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(itemFactura, itemFactura2);
	}
	
}
