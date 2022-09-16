package com.github.plugatarev.computerstore.models;

import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class HardDiskDTO extends ProductDTO {
    @NotEmpty
    private final Double capacity;

    public HardDiskDTO(@NotEmpty Long id, @NotEmpty String serialNumber, @NotEmpty Double price, @NotEmpty String vendor,
                       @NotEmpty Long productAvailable, @NotEmpty ProductType type, @NotEmpty Double capacity) {
        super(id, serialNumber, price, vendor, productAvailable, type);
        this.capacity = capacity;
    }
}
