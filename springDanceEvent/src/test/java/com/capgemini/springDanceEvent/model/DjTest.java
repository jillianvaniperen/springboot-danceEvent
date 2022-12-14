package com.capgemini.springDanceEvent.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DjTest {
    private List<Dj> dj;

    @BeforeEach
    void init() {
      dj = new ArrayList<>();
    }

    @Test
    public void shouldAddDj() {
        dj.add(new Dj("Afrojack", "Dance", 31));
        assertNotNull(dj);
        assertEquals(1, dj.size());
    }

    @Test
    public void shouldNotAddMyDj() {
        Dj myDJ = Dj.GetBestDJ(true);
        assertNotNull(myDJ);
        dj.add(myDJ);
//        assertEquals(1, dj.size());
    }

    class checkAge {
        Dj dj = new Dj();


//        djJpaRepository.save(new Dj("DJ Jean", "Mellow", 25));
//        djJpaRepository.save(new Dj("La Fuente", "Retro", 21));
//        djJpaRepository.save(new Dj("Maraboo", "House", 23));

    }

}