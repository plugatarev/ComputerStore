package com.github.plugatarev.computerstore.services;

import com.github.plugatarev.computerstore.data.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public abstract class CrudService<E extends Product> implements InCrudService<E> {

    private final AbstractRepository<E, Integer> repository;

    @Override
    public void add(E entity) {
        repository.save(entity);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(E entity) {
        repository.save(entity);
    }

    @Override
    public Optional<E> getById(int id) { return repository.findById(id); }
