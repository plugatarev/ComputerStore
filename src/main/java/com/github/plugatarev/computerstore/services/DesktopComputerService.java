package com.github.plugatarev.computerstore.services;

import com.github.plugatarev.computerstore.entity.DesktopComputer;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.repository.DesktopComputerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesktopComputerService extends ProductService<DesktopComputer> {

    public DesktopComputerService(DesktopComputerRepository repository) {
        super(repository);
    }

    @Override
    public List<DesktopComputer> findAllByType(ProductType productType) {
        DesktopComputerRepository repository = (DesktopComputerRepository) getRepository();
        return repository.findAllProductByType(productType);
    }
}
