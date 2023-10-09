package com.pingwit.spring.les_2.classwork.point_2.rest.application;

import com.pingwit.spring.les_2.classwork.point_2.rest.application.model.Animal;
import com.pingwit.spring.les_2.classwork.point_2.rest.application.service.AnimalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping(consumes = "application/json")
    public List<Animal> getAll(@RequestParam(name = "name", required = false) String name) {
        List<Animal> animals;
        if (name != null && !name.isEmpty()) {
            animals = animalService.getAllByName(name);
        } else {
            animals = animalService.getAll();
        }
        return animals;
    }

    //    /animals/1
    @GetMapping("/{id}")
    public Animal getById(@PathVariable Integer id) {
        return animalService.get(id);
    }

    @PostMapping
    public String create(@RequestBody Animal animal) {
        animalService.save(animal);
        return "Hello, " + animal.getName();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
//        animalService.delete(id);
    }
}
