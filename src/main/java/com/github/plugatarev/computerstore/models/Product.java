package com.github.plugatarev.computerstore.models;

import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Getter
public class Product {
    private int id;

    @NotEmpty
    private String serialNumber;

    @NotEmpty
    private Double price;

    @NotEmpty
    private String vendor;

    @NotEmpty
    private Integer productAvailable;

    @NotEmpty
    private ProductType type;
}
