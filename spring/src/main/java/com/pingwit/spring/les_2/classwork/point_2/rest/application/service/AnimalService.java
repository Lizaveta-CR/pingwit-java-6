package com.pingwit.spring.les_2.classwork.point_2.rest.application.service;

import com.pingwit.spring.les_2.classwork.point_2.rest.application.model.Animal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    private List<Animal> animals = new ArrayList<>();

    public List<Animal> getAll() {
        return animals;
    }

    public List<Animal> getAllByName(String name) {
        return animals.stream()
            .filter(animal -> animal.getName().equals(name))
            .collect(Collectors.toList());
    }

    public void save(Animal animal) {
        animal.setId(new Random().nextInt());
        animals.add(animal);
    }

    public Animal get(Integer id) {
        return animals.stream()
            .filter(animal -> animal.getId().equals(id))
            .findFirst()
            .get();
    }
}
