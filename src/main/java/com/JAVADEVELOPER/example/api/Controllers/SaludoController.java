package com.JAVADEVELOPER.example.api.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Saludos")
public class SaludoController {
    @GetMapping("/Hello")
    public String hello() {
        return "Hola! Bienvenido a mi primer API. Mi nombre es Rosalia Sanchez";
    }

    @PostMapping("/Goodbye")
    public String goodbye(){
        return "Hasta la proxima! Muchas gracias :)";
    }
}
