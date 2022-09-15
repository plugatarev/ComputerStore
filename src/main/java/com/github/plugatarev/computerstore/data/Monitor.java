package com.github.plugatarev.computerstore.data;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="Monitor")
public class Monitor extends Product {
    @Column
    private Double diagonal;
}
