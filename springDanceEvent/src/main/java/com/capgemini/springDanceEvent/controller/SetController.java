package com.capgemini.springDanceEvent.controller;

import com.capgemini.springDanceEvent.model.Set;
import com.capgemini.springDanceEvent.service.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/set")
public class SetController {

    @Autowired
    SetService setService;

    @GetMapping
    public List findAllSets() {
        return setService.findAll();
    }

    @GetMapping(value = "/{setId}")
    public Set findBySetID(@PathVariable long setId) {
        return setService.findBySetID(setId);
    }
}

