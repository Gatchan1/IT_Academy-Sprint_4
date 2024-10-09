package cat.itacademy.s04.t02.n02.service;

import cat.itacademy.s04.t02.n02.model.Fruit;

import java.util.List;

public interface FruitServiceInterface {
    Fruit addFruit(Fruit fruit);
    Fruit updateFruit(Fruit updatedFruit);
    void deleteFruit(int id);
    Fruit getOneFruit(int id);
    List<Fruit> getAllFruits();
}
