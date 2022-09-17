package com.github.plugatarev.computerstore.models;

import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Getter
public abstract class ProductDTO {
    private final Long id;

    @NotEmpty
    private final String serialNumber;

    @NotEmpty
    private final Double price;

    @NotEmpty
    private final String vendor;

    @NotEmpty
    private final Long productAvailable;

    @NotEmpty
    private final ProductType type;
}
