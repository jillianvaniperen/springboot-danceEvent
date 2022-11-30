package com.capgemini.springDanceEvent.service;

import com.capgemini.springDanceEvent.model.DJ;
import com.capgemini.springDanceEvent.repository.DjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DjService {

    @Autowired
    DjRepository djRepository;

    public List<DJ> findAll() {
        return djRepository.findAll();
    }

    public DJ save(DJ dj) {
        return djRepository.save(dj);
    }

    public DJ findByID(long id) {
        return djRepository.findByID(id);
    }

    public void deleteByID(long id) {
        djRepository.deleteByID(id);
    }

}
