package com.github.plugatarev.computerstore.repository;

import com.github.plugatarev.computerstore.data.DesktopComputer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesktopComputerRepository extends ProductRepository<DesktopComputer> {
}
