package com.github.plugatarev.computerstore.entity;

import com.github.plugatarev.computerstore.enums.DesktopForm;
import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity(name="DesktopComputer")
@Getter
@Setter
public class DesktopComputer extends Product {
    @Column
    @Enumerated(EnumType.STRING)
    private DesktopForm desktopForm;

    public DesktopComputer(@NotEmpty Long id, @NotEmpty String serialNumber, @NotEmpty Double price, @NotEmpty String vendor,
                           @NotEmpty Long productAvailable, @NotEmpty ProductType type, @NotEmpty DesktopForm form) {
        super(id, serialNumber, vendor, price, productAvailable, type);
        this.desktopForm = form;
    }

    public DesktopComputer() {

    }
}
