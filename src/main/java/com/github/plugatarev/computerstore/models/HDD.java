package com.github.plugatarev.computerstore.models;

import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class HDD extends Product {
    @NotEmpty
    private Double capacity;

    public HDD(int id, @NotEmpty String serialNumber, @NotEmpty Double price, @NotEmpty String vendor,
               @NotEmpty Integer productAvailable, @NotEmpty ProductType type, @NotEmpty Double capacity) {
        super(id, serialNumber, price, vendor, productAvailable, type);
        this.capacity = capacity;
    }
}
