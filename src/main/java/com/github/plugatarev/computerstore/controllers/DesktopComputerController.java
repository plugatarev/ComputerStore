package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.repository.DesktopComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DesktopComputerController {
    @Autowired
    private DesktopComputerRepository desktopRepository;
}
