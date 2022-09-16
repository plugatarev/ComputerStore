package com.github.plugatarev.computerstore.repository;

import com.github.plugatarev.computerstore.enums.ProductType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface ProductRepository<T> extends CrudRepository<T, Long> {
    T getById(long integer);
    Optional<T> findProductById(long integer);
    List<T> findAllByProductType(ProductType type);
}
