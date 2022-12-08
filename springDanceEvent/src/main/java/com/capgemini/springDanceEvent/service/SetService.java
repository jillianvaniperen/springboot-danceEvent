package com.capgemini.springDanceEvent.service;

import com.capgemini.springDanceEvent.model.Set;
import com.capgemini.springDanceEvent.repository.SetJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetService {

    @Autowired
    SetJpaRepository setJpaRepository;

    public List<Set> findAll() { return (List<Set>) setJpaRepository.findAll(); }

    public Set save(Set set) {
        return setJpaRepository.save(set);
    }

    public Set findById(long id) {
        return setJpaRepository.findById(id); }

    public void deleteById(long id) {
        setJpaRepository.deleteById(id);
    }

}
