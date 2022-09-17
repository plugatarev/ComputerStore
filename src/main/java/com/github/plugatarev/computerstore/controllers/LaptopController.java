package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.entity.Laptop;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.mappers.LaptopMapper;
import com.github.plugatarev.computerstore.models.LaptopDTO;
import com.github.plugatarev.computerstore.models.MonitorDTO;
import com.github.plugatarev.computerstore.services.LaptopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products/laptops")
public class LaptopController extends ProductController<Laptop, LaptopDTO>{
    public LaptopController(LaptopService service, LaptopMapper mapper) {
        super(service, mapper);
    }

    @GetMapping
    public ResponseEntity<List<LaptopDTO>> laptops(){
        List<LaptopDTO> dtoList = getService().findAllByType(ProductType.LAPTOP).stream()
                                              .map((e) -> getAbstractMapper().toDTO(e)).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MonitorDTO> update(@PathVariable("id") int id, @RequestBody LaptopDTO dto) {

        Laptop laptop = getService().getById(id).orElseThrow(() ->
                new IllegalStateException("HardDisk with id " + id + " is not found"));

        laptop.setPrice(dto.getPrice());
        laptop.setProductAvailable(dto.getProductAvailable());
        laptop.setDiagonal(dto.getDiagonal());
        getService().update(laptop);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
