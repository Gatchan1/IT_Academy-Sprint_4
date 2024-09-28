package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String greet(@RequestParam(required = false, defaultValue = "UNKNOWN") String name) {
        return "Hola " + name + ". Estàs executant un projecte Maven";
    }

    @GetMapping(value={"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greet2(@PathVariable(required = false) String name) {
        return "Hola, " + name + ". Estàs executant un projecte Maven";
    }
}
