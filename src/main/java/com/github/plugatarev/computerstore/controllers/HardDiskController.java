package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.entity.HardDisk;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.mappers.HardDiskMapper;
import com.github.plugatarev.computerstore.models.HardDiskDTO;
import com.github.plugatarev.computerstore.models.MonitorDTO;
import com.github.plugatarev.computerstore.services.HardDiskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products/hardDisks")
public class HardDiskController extends ProductController<HardDisk, HardDiskDTO> {
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

        HardDisk hardDisk = getService().getById(id).orElseThrow(() ->
                new IllegalStateException("HardDisk with id " + id + " is not found"));

        hardDisk.setPrice(dto.getPrice());
        hardDisk.setProductAvailable(dto.getProductAvailable());
        hardDisk.setCapacity(dto.getCapacity());
        getService().update(hardDisk);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
