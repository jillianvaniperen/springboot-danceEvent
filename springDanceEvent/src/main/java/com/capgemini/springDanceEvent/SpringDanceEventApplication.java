package com.capgemini.springDanceEvent;

import com.capgemini.springDanceEvent.model.Dj;
import com.capgemini.springDanceEvent.model.Set;
import com.capgemini.springDanceEvent.repository.DjJpaRepository;
import com.capgemini.springDanceEvent.repository.SetJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDanceEventApplication implements CommandLineRunner {

    @Autowired
    private SetJpaRepository setJpaRepository;

    @Autowired
    private DjJpaRepository djJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDanceEventApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        djJpaRepository.save(new Dj("DJ Jean", "Mellow", 25));
        djJpaRepository.save(new Dj("La Fuente", "Retro", 21));
        djJpaRepository.save(new Dj("Maraboo", "House", 23));

        setJpaRepository.save(new Set("Mellow Yellow", "17.00", "21.00", "Friday", "Main stage"));
        setJpaRepository.save(new Set("Strictly Ballroom", "13:00", "15:00", "Saturday", "Small stage"));

    }
}


