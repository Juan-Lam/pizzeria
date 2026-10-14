package main;

import java.util.List;

public class PedidoOnLine extends Pedido {
    private String email;

    public PedidoOnLine(Cliente cliente, String email, List<Item> items) {
        super(cliente, items);
        this.email = email;
    }

    public String getEmail() { return email; }
}
