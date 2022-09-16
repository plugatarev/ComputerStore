package com.github.plugatarev.computerstore.data;

import com.github.plugatarev.computerstore.enums.Diagonal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity(name="Laptop")
public class Laptop extends Product {
    @Column
    @Enumerated(EnumType.STRING)
    private Diagonal diagonal;
}
