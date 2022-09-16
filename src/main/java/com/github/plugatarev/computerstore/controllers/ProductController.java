package com.github.plugatarev.computerstore.controllers;

import com.github.plugatarev.computerstore.entity.Product;
import com.github.plugatarev.computerstore.mappers.ProductMapper;
import com.github.plugatarev.computerstore.models.ProductDTO;
import com.github.plugatarev.computerstore.services.CrudService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Getter
public abstract class ProductController <T extends Product, D extends ProductDTO> {
    private final CrudService<T> service;
    private final ProductMapper<T, D> abstractMapper;

    @PostMapping
    private ResponseEntity<T> create(@RequestBody D dto) {
        service.add(abstractMapper.toEntity(dto));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    private ResponseEntity<D> get(@PathVariable("id") int id) {
        T entity = service.getById(id).orElseThrow(() ->
                new IllegalStateException("Entity with id: {" + id + "} not found."));
        return new ResponseEntity<>(abstractMapper.toDTO(entity), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<String> delete(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Entity with id: {" + id + "} was deleted.", HttpStatus.OK);
    }
}
