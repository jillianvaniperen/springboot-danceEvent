//package com.capgemini.springDanceEvent.repository;
//
//import com.capgemini.springDanceEvent.model.Dj;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class DjRepositoryClass extends CrudRepository <Dj, Long> {
//    List <Dj> djs = new ArrayList<>();
//
//    @Override
//    public Optional<Dj> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    public List<Dj> findAll() { return djs; }
//
//    public Dj save(Dj dj) {
//        djs.add(dj);
//        return dj;
//    }
//
//    public Dj findByID (long ID) {
//        for (Dj dj: djs) {
//            if (dj.getID() == ID) {
//                return dj;
//            }
//        }
//        return null;
//    }
//
//    public void deleteByID (long id) {
//        List<Dj> newDjs = new ArrayList<>();
//        for (Dj dj: djs) {
//            if (dj.getID() != id) {
//                newDjs.add(dj);
//            }
//        }
//        djs = newDjs;
//    }
//}
