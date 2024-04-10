package main.java.models;

import main.java.interfaces.Transporte;

public class Caminhao implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entrega por caminhão.");
    }
}
