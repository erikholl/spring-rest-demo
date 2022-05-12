package be.intecbrussel.springrestdemo.controller;

import be.intecbrussel.springrestdemo.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class ControllerWithParams {
    // 1st type of parameter: path parameters
    // this has to do with ReST specification
    // REST stands for: Representational State Transfer:
    // Transfer - move something around
    // State - collection of property values representing a specific entity
    // object
    // in a ReST API a URL should not represent an action (the action is
    // represented by the method). the URL should represent a resource (point
    // to things)

    @GetMapping("/{name}") // curly brackets to indicate it is a variable
    public ResponseEntity getEmployee(@PathVariable("name") String name) {
        // we need to tell Spring the name parameter is a path variable
        // what does recognize which datatype? how is datatype recognized?
        return ResponseEntity.internalServerError().body(name + "too fat, " +
                                                                 "does not " +
                                                                 "fit on UTP " +
                                                                 "cable");
    }

    @GetMapping("/firstname/{firstname}/fam/{familyname}") // curly brackets to
    // indicate it is a variable
    public ResponseEntity getEmployee(@PathVariable String firstname,
                                      String familyname) {
        // we need to tell Spring the name parameter is a path variable
        //
        return ResponseEntity.ok("Fullname: " + firstname + " " + familyname);
    }

    // 2nd type: RequestBody
    // only available for POST & PUT methods
    // example body: {"taxNumber": 3,"firstName":"Elvira",
    // "familyName":"Debruin"}
    // jackson library
    @PutMapping("/id/{id}")
    public ResponseEntity updateEmployee(@PathVariable Long id,
                                         @RequestBody Employee employee) {
        return ResponseEntity.ok(employee.toString());
    }

    // 3rd type: RequestParams


//    @GetMapping("/erik")
//    public ResponseEntity getErik() {
//        return ResponseEntity.internalServerError().body("too easy");
//    }
}
