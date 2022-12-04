package es.sarman.learnspring.springbootweb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Configuration
@PropertySources({
	@PropertySource("classpath:textos.properties")
})
@Component
public class TextosPropertiesConfig {
	
	@Value("${texto.index}") public String texto;

}
