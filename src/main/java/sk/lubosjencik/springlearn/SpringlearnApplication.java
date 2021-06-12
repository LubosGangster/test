package sk.lubosjencik.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringlearnApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
		SpringApplication.run(SpringlearnApplication.class, args);

		AppRun appRun = applicationContext.getBean(AppRun.class);
		appRun.run();
	}

}
