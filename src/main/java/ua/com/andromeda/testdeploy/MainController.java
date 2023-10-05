package ua.com.andromeda.testdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String sayGoodNight() {
        return "I'm going to bed. Good night!✨🌃";
    }
}
