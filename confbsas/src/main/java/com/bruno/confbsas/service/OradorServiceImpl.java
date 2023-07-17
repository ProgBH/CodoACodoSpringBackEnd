/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.confbsas.service;

import com.bruno.confbsas.entities.Orador;
import com.bruno.confbsas.repository.OradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OradorServiceImpl implements OradorService {

    @Autowired
    private OradorRepository oradorRepository;

    @Override
    public List<Orador> getAllOradores() {
        return oradorRepository.findAll();
    }

    @Override
    public Optional<Orador> getOradorById(int id) {
        return oradorRepository.findById(id);
    }

    @Override
    public Orador createOrador(Orador orador) {
        return oradorRepository.save(orador);
    }

    @Override
    public Orador updateOrador(Orador orador) {
        return oradorRepository.save(orador);
    }

    @Override
    public void deleteOrador(int id) {
        oradorRepository.deleteById(id);
    }
}
