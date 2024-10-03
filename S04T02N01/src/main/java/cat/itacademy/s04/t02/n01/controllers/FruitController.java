package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FruitController {
    @Autowired
    private FruitService service;

    @PostMapping("/add")
    public Fruit saveFruit(@RequestBody Fruit fruit) {
        return service.addFruit(fruit);
    }

    @PutMapping("/update")
    public Fruit updateFruit(@RequestBody Fruit fruit) {
        return service.updateFruit(fruit);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFruit(@PathVariable int id) {
        return service.deleteFruit(id);
    }

    @GetMapping("/getOne/{id}")
    public Fruit getOneFruit(@PathVariable int id) {
        return service.getOneFruit(id);
    }

    @GetMapping("/getAll")
    public List<Fruit> getAllFruits() {
        return service.getAllFruits();
    }
}
