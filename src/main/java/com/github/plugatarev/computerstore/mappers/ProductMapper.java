package com.github.plugatarev.computerstore.mappers;

import com.github.plugatarev.computerstore.entity.Product;
import com.github.plugatarev.computerstore.models.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public interface ProductMapper <T extends Product, E extends ProductDTO> {
    T toEntity(E dtoProduct);
    E toDTO(T entityProduct);
}
