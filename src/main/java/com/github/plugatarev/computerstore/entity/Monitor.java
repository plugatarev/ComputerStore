package com.github.plugatarev.computerstore.data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="Monitor")
public class Monitor extends Product {
    @Column
    private Double diagonal;
}
