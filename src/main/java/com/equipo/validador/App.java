package com.equipo.validador;

import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        String usuario = System.getenv("APP_USER");
        if ("admin".equals(usuario)) {
            logger.info("¡Bienvenido administrador!");
        }
    }
}


