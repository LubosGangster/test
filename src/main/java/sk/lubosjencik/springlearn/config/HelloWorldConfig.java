package sk.lubosjencik.springlearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import sk.lubosjencik.springlearn.services.HelloWorldService;
import sk.lubosjencik.springlearn.services.impl.HelloWorldServiceFactory;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorldServiceFactory createFactory(){
        return new HelloWorldServiceFactory();
    }

    @Bean
    @Profile("cze")
    public HelloWorldService czechHelloWorld(HelloWorldServiceFactory factory){
        return factory.createHelloWorldService("cze");
    }

    @Bean
    @Profile("eng")
    public HelloWorldService englishHelloWorld(HelloWorldServiceFactory factory){
        return factory.createHelloWorldService("eng");
    }

    @Bean
    @Profile({"sk", "default"})
    public HelloWorldService slovakHelloWorld(HelloWorldServiceFactory factory){
        return factory.createHelloWorldService("svk");
    }

    @Bean
    @Primary
    @Profile("eng")
    public HelloWorldService primaryHelloWorld(HelloWorldServiceFactory factory){
        return factory.createHelloWorldService("primary");
    }
}
