package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.entity.Monitor;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.mappers.MonitorMapper;
import com.github.plugatarev.computerstore.models.MonitorDTO;
import com.github.plugatarev.computerstore.services.MonitorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/products/monitors")
public class MonitorController extends ProductController<Monitor, MonitorDTO> {
    public MonitorController(MonitorService service, MonitorMapper mapper) {
        super(service, mapper);
    }

    @GetMapping
    public ResponseEntity<List<MonitorDTO>> monitors(){
        List<MonitorDTO> dtoList = getService().findAllByType(ProductType.MONITOR)
                                               .stream()
                                               .map(e -> getAbstractMapper().toDTO(e))
                                               .collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MonitorDTO> update(@PathVariable("id") int id, @RequestBody MonitorDTO dto) {

        Monitor monitor = getService().getById(id).orElseThrow(() ->
                new IllegalStateException("Monitor with id " + id + " is not found"));

        monitor.setPrice(dto.getPrice());
        monitor.setDiagonal(dto.getDiagonal());
        monitor.setProductAvailable(dto.getProductAvailable());
        getService().update(monitor);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
