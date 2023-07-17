/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.confbsas.mapper;

import com.bruno.confbsas.entities.Persona;
import com.bruno.confbsas.dto.request.ActualizarPersonaRequest;
import com.bruno.confbsas.dto.request.CrearPersonaRequest;
import com.bruno.confbsas.dto.response.PersonaResponse;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonaMapper {
    private final ModelMapper modelMapper;

    public PersonaMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Persona mapToEntity(CrearPersonaRequest request) {
        return modelMapper.map(request, Persona.class);
    }

    public PersonaResponse mapToResponse(Persona persona) {
        return modelMapper.map(persona, PersonaResponse.class);
    }

    public void updateEntityFromRequest(ActualizarPersonaRequest request, Persona persona) {
        modelMapper.map(request, persona);
    }
}
