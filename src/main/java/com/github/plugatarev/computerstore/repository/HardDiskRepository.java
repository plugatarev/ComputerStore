package com.github.plugatarev.computerstore.repository;

import com.github.plugatarev.computerstore.data.HDD;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public interface HardDiskRepository extends ProductRepository<HDD> {
}
