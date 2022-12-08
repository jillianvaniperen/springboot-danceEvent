package com.capgemini.springDanceEvent.service;

import com.capgemini.springDanceEvent.model.Dj;
import com.capgemini.springDanceEvent.repository.DjJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DjService {

    @Autowired
    DjJpaRepository djJpaRepository;

    public List<Dj> findAll() {
        return (List<Dj>) djJpaRepository.findAll();
    }

    public Dj save(Dj dj) {
        return djJpaRepository.save(dj);
    }

    public Dj findByID(long id) {
        return djJpaRepository.findById(id);
    }

    public void deleteByID(long id) {
        djJpaRepository.deleteById(id);
    }

}
