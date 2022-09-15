package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RestController
public class MonitorController {
    @Autowired
    private MonitorRepository monitorRepository;
}
