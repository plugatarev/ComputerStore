package com.github.plugatarev.computerstore.entity;

import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity(name="HardDisk")
@Getter
@Setter
public class HardDisk extends Product {
    @Column
    private Double capacity;

    public HardDisk(@NotEmpty Long id, @NotEmpty String serialNumber, @NotEmpty Double price, @NotEmpty String vendor,
                           @NotEmpty Long productAvailable, @NotEmpty ProductType type, @NotEmpty Double capacity) {
        super(id, serialNumber, vendor, price, productAvailable, type);
        this.capacity = capacity;
    }

    public HardDisk() {

    }
}
