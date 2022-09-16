package com.github.plugatarev.computerstore.repository;

import com.github.plugatarev.computerstore.data.HDD;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("laptopRepository")
public interface HDDRepository extends ProductRepository<HDD> {
}
