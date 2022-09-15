package com.github.plugatarev.computerstore.enums;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ProductType {
    HDD ("HDD"), LAPTOP ("Laptop"), MONITOR ("Monitor"), DESKTOP_COMPUTER ("Desktop Computer");

    private final String name;
}
