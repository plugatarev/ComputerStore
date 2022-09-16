package com.github.plugatarev.computerstore.services;

import com.github.plugatarev.computerstore.entity.Product;
import com.github.plugatarev.computerstore.enums.ProductType;

import java.util.List;
import java.util.Optional;

public interface CrudService<T extends Product> {
    void add(T entity);
    void delete(long id);
    void update(T entity);
    Optional<T> getById(long id);
    List<T> findAllByType(ProductType productType);

}
