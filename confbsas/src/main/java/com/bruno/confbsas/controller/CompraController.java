/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.confbsas.controller;

import com.bruno.confbsas.entities.Compra;
import com.bruno.confbsas.service.CompraService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/compras")
@CrossOrigin(origins = "*")
public class CompraController {

    private final CompraService compraService;

    @Autowired
    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Compra>> getAllCompras() {
        List<Compra> compras = compraService.getAllCompra();
        return new ResponseEntity<List<Compra>>(compras, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Compra>> getCompraById(@PathVariable int id) {
        Optional<Compra> compra = compraService.getCompraById(id);
        return new ResponseEntity<Optional<Compra>>(compra, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Compra> saveCompra(@RequestBody Compra compra) {
        Compra nuevaCompra = compraService.createCompra(compra);
        return new ResponseEntity<Compra>(nuevaCompra, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompra(@PathVariable int id) {
        compraService.deleteCompra(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    // Puedes implementar m�s m�todos seg�n las necesidades de tu aplicaci�n
}
