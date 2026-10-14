package main;

public class Item {
    private static int contador = 0;   // genera ids automáticos: 0, 1, 2...

    private int id;
    private String nombre;
    private int valor;

    public Item(String nombre, int valor) {
        this.id = contador++;
        this.nombre = nombre;
        this.valor = valor;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getValor() { return valor; }
}
