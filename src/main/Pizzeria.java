package main;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Cliente> clientes;
    private List<Item> items;
    private List<Pedido> pedidos;

    public Pizzeria() {
        this.nombre = "";
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public boolean addCliente(Cliente cliente) {
        if (cliente == null || clientes.contains(cliente)) {
            return false;
        }
        return clientes.add(cliente);
    }

    public boolean addItem(Item item) {
        if (item == null || items.contains(item)) {
            return false;
        }
        return items.add(item);
    }

    public boolean addPedido(Pedido pedido) {
        if (pedido == null || pedido.getCliente() == null) {
            return false;
        }
        pedido.getCliente().addPedido(pedido);   // el cliente también guarda su pedido
        return pedidos.add(pedido);
    }

    public Cliente getCliente(int index) {
        if (index < 0 || index >= clientes.size()) {
            return null;
        }
        return clientes.get(index);
    }

    public Item getItem(int index) {
        if (index < 0 || index >= items.size()) {
            return null;
        }
        return items.get(index);
    }

    /**
     * Devuelve la posición (en la lista de items de la pizzería) del ítem que
     * más adquirió el cliente en sus pedidos online, o -1 si no compró nada online.
     * En caso de empate, gana el primero de la lista.
     */
    public int calcProdMasVendidoCliente(int numCliente) {
        Cliente cliente = getCliente(numCliente);
        if (cliente == null) {
            return -1;
        }

        System.out.println("num_cliente = " + numCliente);

        int mejor = -1;
        int max = 0;
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);

            // Contar cuántas veces aparece este ítem en los pedidos ONLINE del cliente
            int cantidad = 0;
            for (Pedido pedido : cliente.getPedidos()) {
                if (pedido instanceof PedidoOnLine) {
                    for (Item it : pedido.getItems()) {
                        if (it == item) {
                            cantidad++;
                        }
                    }
                }
            }

            System.out.println("El producto " + item.getNombre() + " se vendio " + cantidad);

            if (cantidad > max) {   // ">" estricto: en empate se queda el primero
                max = cantidad;
                mejor = i;
            }
        }
        return mejor;
    }
}
