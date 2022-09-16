package com.github.plugatarev.computerstore.models;

import com.github.plugatarev.computerstore.enums.Diagonal;
import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class LaptopDTO extends ProductDTO {
    @NotEmpty
    private final Diagonal diagonal;

    public LaptopDTO(@NotEmpty Long id, @NotEmpty String serialNumber, @NotEmpty Double price, @NotEmpty String vendor,
                     @NotEmpty Long productAvailable, @NotEmpty ProductType type, @NotEmpty Diagonal diagonal) {
        super(id, serialNumber, price, vendor, productAvailable, type);
        this.diagonal = diagonal;
    }
}
