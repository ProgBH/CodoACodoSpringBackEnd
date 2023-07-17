/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bruno.confbsas.service;

import com.bruno.confbsas.entities.Persona;
import java.util.List;
import java.util.Optional;

public interface PersonaService {
    List<Persona> getAllPersonas();
    Optional<Persona> getPersonaByDni(String dni);
    Persona createPersona(Persona persona);
    Persona updatePersona(Persona persona);
    void deletePersona(String dni);
}