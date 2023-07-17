/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.confbsas.controller;


import com.bruno.confbsas.entities.Orador;
import com.bruno.confbsas.service.OradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/oradores")
@CrossOrigin(origins = "*")
public class OradorController {

    @Autowired
    private OradorService oradorService;

    @GetMapping("/all")
    public ResponseEntity<List<Orador>> getAllOradores() {
        List<Orador> oradores = oradorService.getAllOradores();
        return new ResponseEntity<List<Orador>>(oradores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Orador>> getOradorById(@PathVariable int id) {
        Optional<Orador> orador  = oradorService.getOradorById(id);
        return new ResponseEntity<Optional<Orador>>(orador,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Orador> createOrador(@RequestBody Orador orador) {
        Orador createdOrador = oradorService.createOrador(orador);
        return new ResponseEntity<Orador>(createdOrador, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Orador> updateOrador(@PathVariable int id, @RequestBody Orador orador) {
        if (id != orador.getId()) {
            return new ResponseEntity<Orador>(HttpStatus.BAD_REQUEST);
        }
        Orador updatedOrador = oradorService.updateOrador(orador);
        return new ResponseEntity<Orador>(updatedOrador, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrador(@PathVariable int id) {
        oradorService.deleteOrador(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}