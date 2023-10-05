package ua.com.andromeda.testdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String sayHello() {
        return "Andrii Heraskin wishes you a great day😊✌️";
    }
}
