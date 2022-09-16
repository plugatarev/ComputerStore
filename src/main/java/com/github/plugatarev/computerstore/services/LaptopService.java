package com.github.plugatarev.computerstore.services;

import com.github.plugatarev.computerstore.entity.Laptop;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.repository.LaptopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService extends ProductService<Laptop> {

    public LaptopService(LaptopRepository repository) {
        super(repository);
    }

    @Override
    public List<Laptop> findAllByType(ProductType productType) {
        LaptopRepository repository = (LaptopRepository) getRepository();
        return repository.findAllProductByType(productType);
    }
}
