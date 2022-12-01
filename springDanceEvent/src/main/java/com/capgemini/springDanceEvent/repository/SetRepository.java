package com.capgemini.springDanceEvent.repository;

import com.capgemini.springDanceEvent.model.Set;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SetRepository {
    List <Set> sets = new ArrayList<>();

    public List<Set> findAll() { return sets; }

    public Set save(Set set) {
        sets.add(set);
        return set;
    }

    public Set findBySetId(long setId) {
        for (Set set: sets) {
            if (set.getSetId() == setId) {
                return set;
            }
        }
        return null;
    }
}
