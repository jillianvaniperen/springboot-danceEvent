package com.capgemini.springDanceEvent.repository;

import com.capgemini.springDanceEvent.model.Set;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SetJpaRepository extends JpaRepository<Set, Long> {
    List<Set> findByNameSet(String nameSet);

    Set findById(long id);
}
