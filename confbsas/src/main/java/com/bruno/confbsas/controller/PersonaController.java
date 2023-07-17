package com.bruno.confbsas.controller;

import com.bruno.confbsas.entities.Persona;
import com.bruno.confbsas.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "*")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/all")
    public ResponseEntity<List<Persona>> getAllPersonas() {
        List<Persona> personas = personaService.getAllPersonas();
        return new ResponseEntity<List<Persona>>(personas, HttpStatus.OK);
    }

    @GetMapping("/{dni}")
    public ResponseEntity<Optional<Persona>> getPersonaByDni(@PathVariable String dni) {
        Optional<Persona> persona = personaService.getPersonaByDni(dni);
        return new ResponseEntity<Optional<Persona>> (persona, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Persona> createPersona(@RequestBody Persona persona) {
        return new ResponseEntity<Persona>(personaService.createPersona(persona), HttpStatus.CREATED);
    }

    @PutMapping("/{dni}")
    public ResponseEntity<Persona> updatePersona(@PathVariable String dni, @RequestBody Persona persona) {
        if (!dni.equals(persona.getDni())) {
            return new ResponseEntity<Persona>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Persona>(personaService.updatePersona(persona), HttpStatus.OK);
    }

    @DeleteMapping("/{dni}")
    public ResponseEntity<Void> deletePersona(@PathVariable String dni) {
        personaService.deletePersona(dni);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
