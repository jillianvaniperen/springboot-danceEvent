package com.capgemini.springDanceEvent.repository;

import com.capgemini.springDanceEvent.model.DJ;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DjRepository {
    List <DJ> djs = new ArrayList<>();

    public List<DJ> findAll() { return djs; }

    public DJ save(DJ dj) {
        djs.add(dj);
        return dj;
    }

    public DJ findByID (long ID) {
        for (DJ dj: djs) {
            if (dj.getID() == ID) {
                return dj;
            }
        }
        return null;
    }

    public void deleteByID (long id) {
        List<DJ> newDJs = new ArrayList<>();
        for (DJ dj: djs) {
            if (dj.getID() != id) {
                newDJs.add(dj);
            }
        }
        djs = newDJs;
    }
}
