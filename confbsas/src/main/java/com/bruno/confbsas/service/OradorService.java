/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.confbsas.service;

import com.bruno.confbsas.entities.Orador;

import java.util.List;
import java.util.Optional;

public interface OradorService {
    List<Orador> getAllOradores();
    Optional<Orador> getOradorById(int id);
    Orador createOrador(Orador orador);
    Orador updateOrador(Orador orador);
    void deleteOrador(int id);
}