package com.github.plugatarev.computerstore.services;

import com.github.plugatarev.computerstore.entity.Monitor;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.repository.MonitorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService extends ProductService<Monitor> {

    public MonitorService(MonitorRepository repository) {
        super(repository);
    }

    @Override
    public List<Monitor> findAllByType(ProductType productType) {
        MonitorRepository repository = (MonitorRepository) getRepository();
        return repository.findAllByProductType(productType);
    }
}
