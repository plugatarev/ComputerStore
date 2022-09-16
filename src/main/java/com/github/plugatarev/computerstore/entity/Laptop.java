package com.github.plugatarev.computerstore.entity;

import com.github.plugatarev.computerstore.enums.Diagonal;
import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;

@Entity(name="Laptop")
@Getter
@Setter
public class Laptop extends Product {
    @Column
    @Enumerated(EnumType.STRING)
    private Diagonal diagonal;

    public Laptop(@NotEmpty Long id, @NotEmpty String serialNumber, @NotEmpty Double price, @NotEmpty String vendor,
                    @NotEmpty Long productAvailable, @NotEmpty ProductType type, @NotEmpty Diagonal diagonal) {
        super(id, serialNumber, vendor, price, productAvailable, type);
        this.diagonal = diagonal;
    }

    public Laptop() {

    }
}
