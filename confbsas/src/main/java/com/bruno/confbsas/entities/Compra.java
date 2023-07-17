package com.bruno.confbsas.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "compra")
@SQLDelete(sql = "UPDATE compra SET enable = false WHERE id = ?")
@Where(clause = "enable = true")
public class Compra implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;

    @Column(name = "fecha_creacion")
    private long fechaCreacion = System.currentTimeMillis();

    @Column(name = "apellido", nullable = false, length = 255)
    private String apellido;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "cantidad_entradas")
    private int cantidadEntradas;

    @Column(name = "total")
    private float total;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria")
    private CategoriaEnum categoria;

    @Column(name = "enable")
    private boolean enabled = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(long fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public CategoriaEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public enum CategoriaEnum {
    ESTUDIANTE,
    TRAINEE,
    JUNIOR
}
    
}