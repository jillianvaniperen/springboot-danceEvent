package com.capgemini.springDanceEvent.repository;

import com.capgemini.springDanceEvent.model.Dj;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DjJpaRepository extends JpaRepository<Dj, Long> {
    List<Dj> findByName(String name);

    Dj findById(long id);

    List<Dj> getAge(int age);
}
