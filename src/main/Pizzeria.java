/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author juanl
 */
public class Pizzeria {
    
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;
    private ArrayList<Pedido> pedidos;    
    
    public void addItem(Item item){
        
    }

    public void addCliente(Cliente cliente) {
        
    }

    public Item getItem(int i) {
        return this.items.get(i);
    }
    
    public Cliente getCliente(int i){
        return this.clientes.get(i);
    }

    public void addPedido(PedidoTelefono pedidoTelefono) {
        
    }
    
    public void addPedido(PedidoOnLine pedidoOnline){
        
    }

    int calcProdMasVendidoCliente(int numCliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
