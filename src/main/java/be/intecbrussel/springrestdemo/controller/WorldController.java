package be.intecbrussel.springrestdemo.controller;

import be.intecbrussel.springrestdemo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/hello") // mapping on class-level
public class WorldController {
    // url that points to my computer and has the application path: /hello
    // i want this url to execute this helloWorld method
    // http://localhost:8080/hello
    // http://127.0.0.1:8080/hello ('this' in IP world). The 'hello' part,
    // which points to a method, is known as 'endpoint' in REST-world

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/world") // includes GET. also exists for POST, DELETE, etc.
    public ResponseEntity helloWorld() {
        System.out.println("executing helloWorld() method");
        return ResponseEntity.ok("Hello World again!");
//        return "Hello World again!";
    }

    // sometimes we might want to exclude certain type of users from viewing
    // certain data. security.
    @GetMapping("/mars") // includes GET. also exists for POST, DELETE, etc.
    public ResponseEntity helloMars() {
        // example of how we could 'bubble up' exceptions
//        try {
//            String returnValue = callMethodInServiceLevel();
//            return ResponseEntity.ok(returnValue);
//        } catch (SQLException e) {
//            return ResponseEntity.internalServerError().body("Could not " +
//                                                                     "connect" +
//                                                                     " to DB");
//        }

        Employee employee = new Employee(123, "John", "Doo");



        System.out.println("executing helloMars() method");
        ResponseEntity response = new ResponseEntity(employee,
                                                     HttpStatus.OK);
        return response;
//        return "Hello Mars!";
    }

//    @RequestMapping(value = "/mars", method = RequestMethod.POST) // the
//    long way
    @PostMapping("/mars")
    public ResponseEntity postExample() {
        return ResponseEntity.ok("mars in the post");
    }


    @PutMapping("/mars")
    public ResponseEntity putExample() {
        return ResponseEntity.ok("mars in the put");
    }
}
