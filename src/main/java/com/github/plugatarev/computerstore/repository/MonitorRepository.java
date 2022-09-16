package com.github.plugatarev.computerstore.repository;

import com.github.plugatarev.computerstore.data.Monitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorRepository extends ProductRepository<Monitor> {
}
