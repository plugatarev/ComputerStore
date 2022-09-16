package com.github.plugatarev.computerstore.mappers;

import com.github.plugatarev.computerstore.entity.HardDisk;
import com.github.plugatarev.computerstore.models.HardDiskDTO;
import org.springframework.stereotype.Component;

@Component
public class HardDiskMapper implements ProductMapper<HardDisk, HardDiskDTO> {
    @Override
    public HardDisk toEntity(HardDiskDTO dto) {
        return new HardDisk(
                dto.getId(),
                dto.getSerialNumber(),
                dto.getPrice(),
                dto.getVendor(),
                dto.getProductAvailable(),
                dto.getType(),
                dto.getCapacity()
        );
    }

    @Override
    public HardDiskDTO toDTO(HardDisk entity) {
        return new HardDiskDTO(
                entity.getId(),
                entity.getSerialNumber(),
                entity.getPrice(),
                entity.getVendor(),
                entity.getProductAvailable(),
                entity.getProductType(),
                entity.getCapacity()
        );
    }
}
