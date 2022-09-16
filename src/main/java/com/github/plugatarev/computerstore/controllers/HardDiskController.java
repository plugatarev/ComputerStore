package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.repository.DesktopComputerRepository;
import com.github.plugatarev.computerstore.repository.HDDRepository;
import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HDDController {
    @Autowired
    private HDDRepository hddRepository;
}
