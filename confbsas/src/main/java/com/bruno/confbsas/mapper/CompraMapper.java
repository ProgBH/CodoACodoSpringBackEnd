/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.confbsas.mapper;


import com.bruno.confbsas.dto.request.CrearCompraRequest;
import com.bruno.confbsas.dto.response.ObtenerCompraResponse;
import com.bruno.confbsas.dto.request.CrearCompraRequest;
import com.bruno.confbsas.dto.response.ObtenerCompraResponse;
import com.bruno.confbsas.entities.Compra;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompraMapper {

    private final ModelMapper modelMapper;

    @Autowired
    public CompraMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Compra convertToEntity(CrearCompraRequest compraRequest) {
        return modelMapper.map(compraRequest, Compra.class);
    }

    public ObtenerCompraResponse convertToResponse(Compra compra) {
        return modelMapper.map(compra, ObtenerCompraResponse.class);
    }
}

