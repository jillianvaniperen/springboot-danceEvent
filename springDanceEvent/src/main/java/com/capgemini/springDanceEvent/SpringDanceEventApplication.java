package com.capgemini.springDanceEvent;

import com.capgemini.springDanceEvent.model.DJ;
import com.capgemini.springDanceEvent.model.Set;
import com.capgemini.springDanceEvent.repository.DjRepository;
import com.capgemini.springDanceEvent.repository.SetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDanceEventApplication implements CommandLineRunner {

	@Autowired
	private SetRepository setRepository;

	@Autowired
	private DjRepository djRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDanceEventApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		djRepository.save(new DJ(1, "DJ Jean", "Mellow"));
		djRepository.save(new DJ(2, "La Fuente", "Retro"));
		djRepository.save(new DJ(3, "Maraboo", "House"));

		setRepository.save(new Set(1, "Mellow Yellow", "17.00", "21.00", "Friday", "Main stage"));
		setRepository.save(new Set(2, "Strictly Ballroom", "13:00", "15:00", "Saturday", "Small stage"));


	}
}


