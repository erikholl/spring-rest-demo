package be.intecbrussel.springrestdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
    // url that points to my computer and has the application path: /hello
    // i want this url to execute this helloWorld method
    // http://localhost:8080/hello
    // http://127.0.0.1:8080/hello ('this' in IP world). The 'hello' part,
    // which points to a method, is known as 'endpoint' in REST-world

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        System.out.println("executing helloWorld() method");
        return "Hello World again!";
    }

}
