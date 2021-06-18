package sk.lubosjencik.springlearn.services.impl;

import sk.lubosjencik.springlearn.services.HelloWorldService;

public class PrimaryHelloWorld implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("ahoj svet z primary!");
    }
}
