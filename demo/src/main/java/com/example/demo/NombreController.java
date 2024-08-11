package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NombreController {

    @GetMapping("/nombre")
    public String getNombre() {
        return "TuNombre"; // Cambia "TuNombre" por tu nombre real.
    }
}
