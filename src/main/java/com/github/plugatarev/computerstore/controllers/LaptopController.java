package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.repository.DesktopComputerRepository;
import com.github.plugatarev.computerstore.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LaptopController {
    @Autowired
    private LaptopRepository laptopRepository;
}
