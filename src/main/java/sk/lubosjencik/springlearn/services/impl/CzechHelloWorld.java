package sk.lubosjencik.springlearn.services.impl;

import sk.lubosjencik.springlearn.services.HelloWorldService;

public class CzechHelloWorld implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Ahoj svět!");
    }
}
