/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bruno.confbsas.dto.request;


// Importar las clases o paquetes necesarios según las propiedades de Compra

public class CrearCompraRequest {

    // Propiedades de la Compra que se recibirán en el cuerpo de la solicitud POST
    // Por ejemplo, si Compra tiene propiedades "nombre", "cantidad", etc.
    private String nombre;
    private int cantidad;
    // Otras propiedades que sean necesarias

    // Constructor vacío y constructor con parámetros

    public CrearCompraRequest() {
    }

    public CrearCompraRequest(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        // Inicializar otras propiedades si es necesario
    }

    // Getter y Setter de las propiedades

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Otros Getter y Setter para otras propiedades si es necesario
}
