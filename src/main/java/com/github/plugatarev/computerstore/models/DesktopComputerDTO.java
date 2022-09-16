package com.github.plugatarev.computerstore.models;

import com.github.plugatarev.computerstore.enums.DesktopForm;
import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;

@Getter
public class DesktopComputerDTO extends ProductDTO {
    @NotEmpty
    private final DesktopForm formFactor;

    public DesktopComputerDTO(@NotEmpty Long id, @NotEmpty String serialNumber, @NotEmpty Double price, @NotEmpty String vendor,
                              @NotEmpty Long productAvailable, @NotEmpty ProductType type, @NotEmpty DesktopForm formFactor) {
        super(id, serialNumber, price, vendor, productAvailable, type);
        this.formFactor = formFactor;
    }
}
