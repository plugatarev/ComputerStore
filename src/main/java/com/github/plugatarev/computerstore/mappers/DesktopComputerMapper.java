package com.github.plugatarev.computerstore.mappers;

import com.github.plugatarev.computerstore.entity.DesktopComputer;
import com.github.plugatarev.computerstore.models.DesktopComputerDTO;
import org.springframework.stereotype.Component;

@Component
public class DesktopComputerMapper implements ProductMapper<DesktopComputer, DesktopComputerDTO> {
    @Override
    public DesktopComputer toEntity(DesktopComputerDTO dto) {
        return new DesktopComputer(
                dto.getId(),
                dto.getSerialNumber(),
                dto.getPrice(),
                dto.getVendor(),
                dto.getProductAvailable(),
                dto.getType(),
                dto.getFormFactor()
        );
    }

    @Override
    public DesktopComputerDTO toDTO(DesktopComputer entity) {
        return new DesktopComputerDTO(
                entity.getId(),
                entity.getSerialNumber(),
                entity.getPrice(),
                entity.getVendor(),
                entity.getProductAvailable(),
                entity.getProductType(),
                entity.getDesktopForm()
        );
    }
}
