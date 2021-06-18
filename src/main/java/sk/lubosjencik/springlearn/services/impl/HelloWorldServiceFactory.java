package sk.lubosjencik.springlearn.services.impl;

import sk.lubosjencik.springlearn.services.HelloWorldService;

public class HelloWorldServiceFactory {

    public HelloWorldService createHelloWorldService(String language){
        switch (language){
            case "eng":
                return new EnglishHelloWorld();
            case "cze":
                return new CzechHelloWorld();
            case "svk":
                return new SlovakHelloWorld();
            default:
                return new PrimaryHelloWorld();
        }
    }
}
