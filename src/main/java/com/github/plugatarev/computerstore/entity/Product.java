package com.github.plugatarev.computerstore.data;

import com.github.plugatarev.computerstore.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String serialNumber;
    private String vendor;
    private Double price;
    private Integer productAvailable;

    @Enumerated(EnumType.STRING)
    private ProductType productType;
}
