package com.github.plugatarev.computerstore.services;

import com.github.plugatarev.computerstore.data.HDD;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.repository.HDDRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HDDService extends ProductService<HDD> {

    public HDDService(HDDRepository repository) {
        super(repository);
    }

    @Override
    public List<HDD> findAllByType(ProductType productType) {
        HDDRepository repository = (HDDRepository) getRepository();
        return repository.findAllByProductType(productType);
    }
}
