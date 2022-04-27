package net.shagie.hellojib;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloWorld(@RequestParam(name = "name", defaultValue = "world") String name) {
        return "Hello ".concat(name);
    }
}
