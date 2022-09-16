package com.github.plugatarev.computerstore.repository;

import com.github.plugatarev.computerstore.enums.ProductType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface ProductRepository<T> extends CrudRepository<T, Long> {
    List<T> findAllProductByType(ProductType type);
}
