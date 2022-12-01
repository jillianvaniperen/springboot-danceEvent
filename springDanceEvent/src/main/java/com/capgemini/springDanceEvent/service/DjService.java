package com.capgemini.springDanceEvent.service;

import com.capgemini.springDanceEvent.model.Dj;
import com.capgemini.springDanceEvent.repository.DjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DjService {

    @Autowired
    DjRepository djRepository;

    public List<Dj> findAll() {
        return djRepository.findAll();
    }

    public Dj save(Dj dj) {
        return djRepository.save(dj);
    }

    public Dj findByID(long id) {
        return djRepository.findByID(id);
    }

    public void deleteByID(long id) {
        djRepository.deleteByID(id);
    }

}
