package com.bird.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;

import com.bird.demo.model.Bird;
import com.bird.demo.repository.BirdRepoImplementation;

// @RunWith(SpringRunner.class)
@SpringBootTest

class SpringbirdApplicationTests {
	// @Autowired
	private BirdRepoImplementation repository = new BirdRepoImplementation();

	@Test
	void testSaveRepository() {
		Bird bird = new Bird();
		bird.setId("ahfg4tdsfsfsf");
		bird.setName("macaque");
		bird.setFamily("Cercopithecidae");
		repository.PostBird(bird);
		Bird savedBird = repository.GetBird("ahfg4tdsfsfsf");
		assertNotNull(savedBird);
		System.out.println(savedBird.getName());
	}

	@Test
	void testGetAllBirds() {
		Bird bird1 = new Bird();
		bird1.setId("ahfg4tdsfsfsf");
		bird1.setName("macaque");
		bird1.setFamily("Cercopithecidae");
		repository.PostBird(bird1);
		Bird bird2 = new Bird();
		bird2.setId("brrrhahgdasd");
		bird2.setName("pigeon");
		bird2.setFamily("Columbidae");
		repository.PostBird(bird2);
		Bird bird3 = new Bird();
		bird3.setId("chhdgsgdfa");
		bird3.setName("turacos");
		bird3.setFamily("Passerea");
		repository.PostBird(bird3);
		List<Bird> savedBirds = repository.GetAllBirds();
		assertNotNull(savedBirds);

	}

	@Test
	void testDeleteOneBird() {
		Bird bird1 = new Bird();
		bird1.setId("ahfg4tdsfsfsf");
		bird1.setName("macaque");
		bird1.setFamily("Cercopithecidae");
		repository.PostBird(bird1);
		Bird bird2 = new Bird();
		bird2.setId("brrrhahgdasd");
		bird2.setName("pigeon");
		bird2.setFamily("Columbidae");
		repository.PostBird(bird2);
		Bird bird3 = new Bird();
		bird3.setId("chhdgsgdfa");
		bird3.setName("turacos");
		bird3.setFamily("Passerea");
		repository.PostBird(bird3);
		repository.DeleteBird("brrrhahgdasd");
		assertNull(repository.GetBird("brrrhahgdasd"));

	}

}
