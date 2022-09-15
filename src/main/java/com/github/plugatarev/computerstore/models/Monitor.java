package com.github.plugatarev.computerstore.models;

import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class Monitor extends Product {
    @NotEmpty
    private Double diagonal;

    public Monitor(Integer id, @NotEmpty String serialNumber, @NotEmpty Double price, @NotEmpty String vendor,
                   Integer productAvailable, @NotEmpty ProductType type, @NotEmpty Double diagonal) {
        super(id, serialNumber, price, vendor, productAvailable, type);
        this.diagonal = diagonal;
    }
}
