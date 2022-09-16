package com.github.plugatarev.computerstore.mappers;

import com.github.plugatarev.computerstore.entity.Monitor;
import com.github.plugatarev.computerstore.models.MonitorDTO;
import org.springframework.stereotype.Component;

@Component
public class MonitorMapper implements ProductMapper <Monitor, MonitorDTO> {
    @Override
    public Monitor toEntity(MonitorDTO dto) {
        return new Monitor(
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
    public MonitorDTO toDTO(Monitor entity) {
        return new MonitorDTO(
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
