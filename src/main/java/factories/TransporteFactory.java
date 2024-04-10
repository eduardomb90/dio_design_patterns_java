package main.java.factories;

import main.java.interfaces.Transporte;
import main.java.models.Caminhao;
import main.java.models.Navio;

public class TransporteFactory {
    public static Transporte criarTransporte (String tipo) {
        if (tipo.equalsIgnoreCase("caminhao")) {
            return new Caminhao();
        }
        else if (tipo.equalsIgnoreCase("navio")) {
            return new Navio();
        }

        throw new IllegalArgumentException("Tipo de transporte desconhecido.");
    }
}
