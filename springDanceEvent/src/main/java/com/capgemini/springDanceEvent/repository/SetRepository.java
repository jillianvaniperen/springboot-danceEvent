package com.capgemini.springDanceEvent.repository;

import com.capgemini.springDanceEvent.model.Set;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SetRepository extends CrudRepository <Set, Long> {
    List<Set> findByNameSet(String nameSet);

    Set findById(long id);
}
