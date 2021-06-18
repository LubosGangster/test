package sk.lubosjencik.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.lubosjencik.springlearn.services.HelloWorldService;

@Component
public class AppRun {

    @Autowired
    HelloWorldService helloService;

    public void run(){
        helloService.sayHello();
    }
}
