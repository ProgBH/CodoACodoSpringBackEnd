/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.confbsas.service;

import com.bruno.confbsas.entities.Compra;
import com.bruno.confbsas.entities.Orador;
import com.bruno.confbsas.repository.CompraRepository;
import com.bruno.confbsas.repository.OradorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CompraServiceImpl implements CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public List<Compra> getAllCompra() {
        return compraRepository.findAll();
    }

    public Optional<Compra> getCompraById(int id) {
        return compraRepository.findById(id);
    }

    public Compra createCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public Compra updateCompra(Compra compra) {
        return compraRepository.save(compra);
    }

    public void deleteCompra(int id) {
        compraRepository.deleteById(id);
    }

 

   
}
