package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.entity.DesktopComputer;
import com.github.plugatarev.computerstore.enums.ProductType;
import com.github.plugatarev.computerstore.mappers.DesktopComputerMapper;
import com.github.plugatarev.computerstore.models.DesktopComputerDTO;
import com.github.plugatarev.computerstore.models.MonitorDTO;
import com.github.plugatarev.computerstore.services.DesktopComputerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products/desktopComputers")
public class DesktopComputerController extends ProductController<DesktopComputer, DesktopComputerDTO> {
    public DesktopComputerController(DesktopComputerService service, DesktopComputerMapper mapper) {
        super(service, mapper);
    }

    @GetMapping
    public ResponseEntity<List<DesktopComputerDTO>> desktops(){
        List<DesktopComputerDTO> dtoList = getService().findAllByType(ProductType.DESKTOP_COMPUTER)
                                                       .stream()
                                                       .map((e) -> getAbstractMapper().toDTO(e))
                                                       .collect(Collectors.toList());
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MonitorDTO> update(@PathVariable("id") int id, @RequestBody DesktopComputerDTO dto) {

        DesktopComputer computer = getService().getById(id).orElseThrow(() ->
                new IllegalStateException("Desktop computer with id " + id + " is not found"));

        computer.setPrice(dto.getPrice());
        computer.setProductAvailable(dto.getProductAvailable());
        computer.setDesktopForm(dto.getFormFactor());
        getService().update(computer);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
