package com.github.plugatarev.computerstore.data;

import com.github.plugatarev.computerstore.enums.DesktopForm;

import javax.persistence.*;

@Entity(name="DesktopComputer")
public class DesktopComputer extends Product {
    @Column
    @Enumerated(EnumType.STRING)
    private DesktopForm desktopForm;
}
