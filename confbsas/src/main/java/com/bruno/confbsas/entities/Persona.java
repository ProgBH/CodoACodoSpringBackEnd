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
@Table(name = "personas")
@SQLDelete(sql = "UPDATE personas SET enable = false WHERE dni = ?")
@Where(clause = "enable = true")
public class Persona implements Serializable {
    @Id
    @Column(name = "dni", nullable = false, length = 10)
    private String dni;

    @Column(name = "name", nullable = false, length = 15)
    private String name;

    @Column(name = "lastName", length = 15)
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "enable")
    private boolean enabled = true;

    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    

}