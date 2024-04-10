package main.java;

import main.java.factories.TransporteFactory;
import main.java.handlers.HandlerPedidoDomestico;
import main.java.handlers.HandlerPedidoInternacional;
import main.java.interfaces.Transporte;
import main.java.models.Pedido;

public class Main {
    public static void main (String[] args){
        // Uso da Factory
        Transporte transporte = TransporteFactory.criarTransporte("navio");
        transporte.entregar();

        // Uso da Chain of Responsability
        HandlerPedidoDomestico handlerDomestico = new HandlerPedidoDomestico();
        HandlerPedidoInternacional handlerInternacional = new HandlerPedidoInternacional();

        handlerDomestico.setSucessor(handlerInternacional);

        Pedido pedidoDomestico = new Pedido(true);
        Pedido pedidoInternacional = new Pedido(false);

        handlerDomestico.handlePedido(pedidoDomestico);
        handlerDomestico.handlePedido(pedidoInternacional);
    }
}
