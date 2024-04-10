package main.java.models;

import main.java.interfaces.Transporte;

public class Navio implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entrega por navio.");
    }
}
