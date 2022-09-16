package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.entity.HardDisk;
import com.github.plugatarev.computerstore.entity.Monitor;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.mappers.HardDiskMapper;
import com.github.plugatarev.computerstore.mappers.MonitorMapper;
import com.github.plugatarev.computerstore.models.HardDiskDTO;
import com.github.plugatarev.computerstore.models.MonitorDTO;
import com.github.plugatarev.computerstore.repository.DesktopComputerRepository;
import com.github.plugatarev.computerstore.repository.HardDiskRepository;
import com.github.plugatarev.computerstore.services.HardDiskService;
import com.github.plugatarev.computerstore.services.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products/HardDisks")
public class HardDiskController extends ProductController<HardDisk, HardDiskDTO>{
    public HardDiskController(HardDiskService service, HardDiskMapper mapper) {
        super(service, mapper);
    }

    @GetMapping
    private ResponseEntity<List<HardDiskDTO>> HardDisks(){
        List<HardDiskDTO> dtoList = getService().findAllByType(ProductType.MONITOR).stream()
                                              .map((e) -> getAbstractMapper().toDTO(e)).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    private ResponseEntity<MonitorDTO> update(@PathVariable("id") int id, @RequestBody HardDiskDTO dto) {

        HardDisk monitor = getService().getById(id).orElseThrow(() ->
                new IllegalStateException("HardDisk with id " + id + " is not found"));

        monitor.setPrice(dto.getPrice());
        monitor.setProductAvailable(dto.getProductAvailable());
        monitor.setDiagonal(dto.getDiagonal());
        getService().update(monitor);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
