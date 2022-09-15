package com.github.plugatarev.computerstore.data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="HDD")
public class HDD extends Product {
    @Column
    private Integer capacity;
}
