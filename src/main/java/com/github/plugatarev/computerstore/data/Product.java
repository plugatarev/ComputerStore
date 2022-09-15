package com.github.plugatarev.computerstore.data;

import com.github.plugatarev.computerstore.enums.ProductType;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@DiscriminatorColumn
public class Product {
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
