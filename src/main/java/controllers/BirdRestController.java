package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bird.demo.repository.BirdRepository;
import com.bird.demo.model.Bird;

@RestController
public class BirdRestController {

    @Autowired
    BirdRepository repository;

    // @RequestMapping(value = "/birds/", method = RequestMethod.GET);
    // public List<Bird> getBirds(){
    // return repository.findAll();
    // }

    // public Bird getBird(String id) {
    // return repository.findById(id);
    // }
}
