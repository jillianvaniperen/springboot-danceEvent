package com.capgemini.springDanceEvent.controller;

import com.capgemini.springDanceEvent.model.Dj;
import com.capgemini.springDanceEvent.model.Set;
import com.capgemini.springDanceEvent.service.SetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/set")
public class SetController {

    @Autowired
    SetService setService;

    @GetMapping
    public List findAll() {
        return setService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Set findById(@PathVariable long id) {
        return setService.findById(id);
    }

    @RequestMapping(value = "/delete/{id}")
    public void deleteByID (@PathVariable long id) {
        System.out.println(id);
        setService.deleteById(id);
    }

    @RequestMapping("/add")
    public void saveDj (@RequestBody Set set) {
        System.out.println(set);
        setService.save(set);
    }
}

