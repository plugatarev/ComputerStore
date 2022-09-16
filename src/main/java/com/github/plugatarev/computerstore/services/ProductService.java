package com.github.plugatarev.computerstore.services;

import com.github.plugatarev.computerstore.entity.Product;
import com.github.plugatarev.computerstore.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Getter
@Service
public abstract class ProductService<T extends Product> implements CrudService<T> {

    private final ProductRepository<T> repository;

    @Override
    public void add (T entity) {
        repository.save(entity);
    }

    @Override
    public void delete (long id) {
        repository.deleteById(id);
    }

    @Override
    public void update (T entity) {
        repository.save(entity);
    }

    @Override
    public Optional<T> getById (long id) {
        return repository.findById(id);
    }
}