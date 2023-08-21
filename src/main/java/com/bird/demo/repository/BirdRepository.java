package com.bird.demo.repository;

import java.util.*;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import com.bird.demo.model.Bird;

public interface BirdRepository {
    HashMap<String, Bird> Birdmap = new HashMap<>();

    List<Bird> birds = new ArrayList<>();

    public List<Bird> GetAllBirds();

    public void PostBird(Bird bird);

    public Bird GetBird(String id);

    public void DeleteBird(String id);

}
