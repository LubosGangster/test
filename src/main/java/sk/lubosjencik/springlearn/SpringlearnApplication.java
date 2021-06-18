package sk.lubosjencik.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import sk.lubosjencik.springlearn.services.RestApiService;

@SpringBootApplication
@ImportResource("classpath:bean-configurator.xml")
public class SpringlearnApplication {

	public static void main(String[] args) {
		ApplicationContext kontext = SpringApplication.run(SpringlearnApplication.class, args);
		System.out.println(kontext.getBean(RestApiService.class).getTodo(1L));
	}

}
