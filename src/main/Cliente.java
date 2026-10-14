package main;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public boolean addPedido(Pedido pedido) {
        if (pedido == null || pedidos.contains(pedido)) {
            return false;
        }
        return pedidos.add(pedido);
    }

    public String getNombre() { return nombre; }
    public List<Pedido> getPedidos() { return pedidos; }
}
