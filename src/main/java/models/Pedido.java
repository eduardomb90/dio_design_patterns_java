package main.java.models;

public class Pedido {
    private boolean ehDomestico;

    public Pedido (boolean ehDomestico) {
        this.ehDomestico = ehDomestico;
    }

    public boolean ehDomestico() {
        return ehDomestico;
    }
}
