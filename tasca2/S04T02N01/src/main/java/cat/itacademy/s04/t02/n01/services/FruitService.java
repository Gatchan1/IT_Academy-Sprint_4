package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitService {

    @Autowired
    private FruitRepository repository;

    public Fruit addFruit(Fruit fruit) {
        return repository.save(fruit);
    }

    public Fruit updateFruit(Fruit updatedFruit) {
        Fruit dbFruit = repository.getReferenceById(updatedFruit.getId());
        dbFruit.setName(updatedFruit.getName());
        dbFruit.setQuantityKg(updatedFruit.getQuantityKg());
        return repository.save(dbFruit);
    }

    public String deleteFruit(int id) {
        repository.deleteById(id);
        return "Fruit " + id + " successfully deleted";
    }

    public Fruit getOneFruit(int id) {
        Optional<Fruit> optionalFruit = repository.findById(id);
        Fruit fruit = null;
        if (optionalFruit.isPresent()) {
            fruit = optionalFruit.get();
        } else {
            throw new RuntimeException("Fruit not found with id " + id);
        }
        return fruit;
    }

    public List<Fruit> getAllFruits() {
        return repository.findAll();
    }
}
