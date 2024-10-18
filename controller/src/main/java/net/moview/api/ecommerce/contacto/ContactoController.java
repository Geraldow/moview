package com.example.moview.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class ContactoController {
    @GetMapping
    public String mostrarConfiteria() {
        return "contacto/contacto";
    }
}
