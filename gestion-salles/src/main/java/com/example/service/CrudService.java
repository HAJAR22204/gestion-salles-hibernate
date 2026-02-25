package com.example.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {
    T save(T entity); //persist(entity) --> INSERT SQL
    Optional<T> findById(ID id); //em.find() --> SELECT WHERE id
    List<T> findAll();
    void update(T entity); //merge(entity) -->UPDATE SQL
    void delete(T entity); //remove(entity) --> DELETE SQL
    void deleteById(ID id);
}