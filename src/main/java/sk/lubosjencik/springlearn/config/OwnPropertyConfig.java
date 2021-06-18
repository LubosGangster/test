package sk.lubosjencik.springlearn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import sk.lubosjencik.springlearn.services.impl.PrintService;

@Configuration
@PropertySource("classpath:own.properties")
public class OwnPropertyConfig {
    @Value("${own.name}")
    String name;

    @Value("${own.surname}")
    String surname;

    @Bean
    public PrintService printService(){
        PrintService printService = new PrintService();
        printService.setData(name + ", " + surname);
        return printService;
    }
}
