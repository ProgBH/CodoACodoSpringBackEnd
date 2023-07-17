/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.confbsas.service;

import com.bruno.confbsas.entities.Persona;
import com.bruno.confbsas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> getPersonaByDni(String dni) {
        return personaRepository.findById(dni);
    }

    @Override
    public Persona createPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona updatePersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void deletePersona(String dni) {
        personaRepository.deleteById(dni);
    }
}
