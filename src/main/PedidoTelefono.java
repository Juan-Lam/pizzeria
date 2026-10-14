package main;

import java.util.List;

public class PedidoTelefono extends Pedido {
    private String telefono;

    public PedidoTelefono(Cliente cliente, String telefono, List<Item> items) {
        super(cliente, items);
        this.telefono = telefono;
    }

    public String getTelefono() { return telefono; }
}
