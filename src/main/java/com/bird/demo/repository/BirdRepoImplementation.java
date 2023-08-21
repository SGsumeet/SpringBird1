package com.bird.demo.repository;

import java.util.List;

import com.bird.demo.model.Bird;

public class BirdRepoImplementation implements BirdRepository {

    @Override
    public List<Bird> GetAllBirds() {

        for (Bird value : Birdmap.values()) {
            birds.add(value);
        }
        return birds;
    }

    @Override
    public void PostBird(Bird bird) {
        Birdmap.put(bird.getId(), bird);
    }

    @Override
    public Bird GetBird(String id) {
        return Birdmap.get(id);

    }

    @Override
    public void DeleteBird(String id) {
        Birdmap.remove(id);
    }

}
