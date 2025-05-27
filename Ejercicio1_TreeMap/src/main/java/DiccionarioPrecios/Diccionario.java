import java.util.*;
public class DiccionarioPrecios {
    private TreeMap<String, Double> productos = new TreeMap<>();
    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
    }
    public void buscarPrecio(String nombre) {
        if (productos.containsKey(nombre)) {
            System.out.println("Precio de " + nombre + ": $" + productos.get(nombre));
        } else {
            System.out.println(nombre + " no encontrado.");
        }
    }
    public void mostrarProductosOrdenados() {
        System.out.println("Productos ordenados alfabéticamente:");
        productos.forEach((k, v) -> System.out.println("- " + k + ": $" + v));
    }
    public void mostrarMasBaratoYMasCaro() {
        if (!productos.isEmpty()) {
            String masBarato = Collections.min(productos.entrySet(), Map.Entry.comparingByValue()).getKey();
            String masCaro = Collections.max(productos.entrySet(), Map.Entry.comparingByValue()).getKey();
            System.out.println("Producto más barato: " + masBarato + " ($" + productos.get(masBarato) + ")");
            System.out.println("Producto más caro: " + masCaro + " ($" + productos.get(masCaro) + ")");
        }
    }
}
