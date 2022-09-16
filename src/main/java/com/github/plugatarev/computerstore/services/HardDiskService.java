package com.github.plugatarev.computerstore.services;

import com.github.plugatarev.computerstore.data.HDD;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.repository.HardDiskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HardDiskService extends ProductService<HDD> {

    public HardDiskService(HardDiskRepository repository) {
        super(repository);
    }

    @Override
    public List<HDD> findAllByType(ProductType productType) {
        HardDiskRepository repository = (HardDiskRepository) getRepository();
        return repository.findAllByProductType(productType);
    }
}
