package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.entity.DesktopComputer;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.mappers.DesktopComputerMapper;
import com.github.plugatarev.computerstore.models.DesktopComputerDTO;
import com.github.plugatarev.computerstore.repository.DesktopComputerRepository;
import com.github.plugatarev.computerstore.services.DesktopComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products/desktopComputers")
public class DesktopComputerController {
    public DesktopComputerController(DesktopComputerService service, DesktopComputerMapper mapper) {
        super(service, mapper);
    }

    @GetMapping
    private ResponseEntity<List<DesktopComputerDTO>> DesktopComputers(){
        List<DesktopComputerDTO> dtoList = getService().findAllByType(ProductType.DesktopComputer).stream()
                                               .map((e) -> getAbstractMapper().toDTO(e)).collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    private ResponseEntity<DesktopComputerDTO> update(@PathVariable("id") int id, @RequestBody DesktopComputerDTO dto) {

        DesktopComputer DesktopComputer = getService().getById(id).orElseThrow(() ->
                new IllegalStateException("DesktopComputer with id " + id + " is not found"));

        DesktopComputer.setPrice(dto.getPrice());
        DesktopComputer.setDiagonal(dto.getDiagonal());
        DesktopComputer.setProductAvailable(dto.getProductAvailable());
        getService().update(DesktopComputer);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
