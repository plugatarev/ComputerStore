package com.github.plugatarev.computerstore.repository;

import com.github.plugatarev.computerstore.enums.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface ProductRepository<T> extends CrudRepository<T, Long> {
    T getById(long integer);
    Optional<T> findProductById(long integer);
    List<T> findAllByProductType(ProductType type);
}
