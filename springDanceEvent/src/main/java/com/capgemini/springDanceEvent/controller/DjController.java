package com.capgemini.springDanceEvent.controller;

import com.capgemini.springDanceEvent.model.DJ;
import com.capgemini.springDanceEvent.service.DjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/dj")
public class DjController {

    @Autowired
    DjService djService;

    @GetMapping
    public List findAllDjs() {
        return djService.findAll();
    }

    @GetMapping(value = "/{id}")
    public DJ findByID(@PathVariable long id) {
        return djService.findByID(id);
    }

    @RequestMapping(value = "/delete/{id}")
    public void deleteByID (@PathVariable long id) {
        System.out.println(id);
        djService.deleteByID(id);
    }
}

