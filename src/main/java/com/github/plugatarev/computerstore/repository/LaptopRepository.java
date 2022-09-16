package com.github.plugatarev.computerstore.repository;

import com.github.plugatarev.computerstore.data.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends ProductRepository<Laptop> {
}
