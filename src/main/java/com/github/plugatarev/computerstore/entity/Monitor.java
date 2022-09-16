package com.github.plugatarev.computerstore.entity;

import com.github.plugatarev.computerstore.enums.Diagonal;
import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity(name="Monitor")
@Getter
@Setter
public class Monitor extends Product {
    @Column
    private Double diagonal;

    public Monitor(@NotEmpty Long id, @NotEmpty String serialNumber, @NotEmpty Double price, @NotEmpty String vendor,
                  @NotEmpty Long productAvailable, @NotEmpty ProductType type, @NotEmpty Double diagonal) {
        super(id, serialNumber, vendor, price, productAvailable, type);
        this.diagonal = diagonal;
    }

    public Monitor() {

    }
}
