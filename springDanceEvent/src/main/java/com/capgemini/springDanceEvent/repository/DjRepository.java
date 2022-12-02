package com.capgemini.springDanceEvent.repository;

import com.capgemini.springDanceEvent.model.Dj;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DjRepository extends CrudRepository <Dj, Long> {
    List<Dj> findByName(String name);

    Dj findById(long id);
}
