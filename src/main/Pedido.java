package main;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
    protected Cliente cliente;
    protected List<Item> items;

    public Pedido(Cliente cliente, List<Item> items) {
        this.cliente = cliente;
        this.items = new ArrayList<>();
        if (items != null) {
            this.items.addAll(items);   // copia, para no depender de la lista externa
        }
    }

    public Cliente getCliente() { return cliente; }
    public List<Item> getItems() { return items; }
}
