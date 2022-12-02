package com.capgemini.springDanceEvent.service;

import com.capgemini.springDanceEvent.model.Set;
import com.capgemini.springDanceEvent.repository.SetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetService {

    @Autowired
    SetRepository setRepository;

    public List<Set> findAll() { return (List<Set>) setRepository.findAll(); }

    public Set save(Set set) {
        return setRepository.save(set);
    }

    public Set findBySetId(long id) {
        return setRepository.findById(id); }

}
