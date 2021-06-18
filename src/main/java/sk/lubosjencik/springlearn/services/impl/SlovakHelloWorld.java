package sk.lubosjencik.springlearn.services.impl;

import sk.lubosjencik.springlearn.services.HelloWorldService;

public class SlovakHelloWorld implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("Ahoj svet!");
    }
}
