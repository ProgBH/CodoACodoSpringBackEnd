/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.confbsas.service;

import com.bruno.confbsas.entities.Compra;
import java.util.List;
import java.util.Optional;


public interface CompraService {
    List<Compra> getAllCompra();
    Optional<Compra> getCompraById(int id);
    Compra createCompra(Compra compra);
    Compra updateCompra(Compra compra);
    void deleteCompra(int id);
}
