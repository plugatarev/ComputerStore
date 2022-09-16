package com.github.plugatarev.computerstore.mappers;

import com.github.plugatarev.computerstore.entity.Laptop;
import com.github.plugatarev.computerstore.models.LaptopDTO;
import org.springframework.stereotype.Component;

@Component
public class LaptopMapper implements ProductMapper<Laptop, LaptopDTO> {
    @Override
    public Laptop toEntity(LaptopDTO dto) {
        return new Laptop(
                dto.getId(),
                dto.getSerialNumber(),
                dto.getPrice(),
                dto.getVendor(),
                dto.getProductAvailable(),
                dto.getType(),
                dto.getDiagonal()
        );
    }

    @Override
    public LaptopDTO toDTO(Laptop entity) {
        return new LaptopDTO(
                entity.getId(),
                entity.getSerialNumber(),
                entity.getPrice(),
                entity.getVendor(),
                entity.getProductAvailable(),
                entity.getProductType(),
                entity.getDiagonal()
        );
    }
}
