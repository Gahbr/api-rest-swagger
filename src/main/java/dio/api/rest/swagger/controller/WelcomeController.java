package dio.api.rest.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String Welcome(){
        return "HELLO PETER!";
    }
    // public String hello() { return "hello hello";}
}
