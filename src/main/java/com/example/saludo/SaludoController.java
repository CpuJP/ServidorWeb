package com.example.saludo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable(value = "nombre", required = false) String nombre) {
        if (nombre == null || nombre.length() == 0) {
            nombre = "Mundo";
        }
        return "<html>" +
                    "<body>" +
                        "<style>" +
                            "h1 { font-weight: bold; font-size: 15px; font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;}" +
                            "body {background-color: rebeccapurple;}" +
                        "</style>" +
                        "<h1>Hola " + nombre + "!!!</h1>" +
                    "</body>" +
                "</html>";
    }
}