package HistorialNAvegacion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> historial = new LinkedList<>();

        System.out.println("Añadiendo páginas al historial ");
        historial.add("https://getbootstrap.com/");
        historial.add("https://www.ricaldone.edu.sv");
        historial.add("https://portal.ricaldone.edu.sv/#/login");
        historial.add("https://teams.microsoft.com");
        historial.add("https://mail.google.com");

        System.out.println("Historial inicial: " + historial);

        System.out.println("Botón Atrás ");
        if (!historial.isEmpty()) {
            String paginaEliminada = historial.removeLast();
            System.out.println("Has regresado de: " + paginaEliminada);
        }

        System.out.println("Historial");
        if (historial.isEmpty()) {
            System.out.println("Historial limpio");
        } else {
            for (int i = 0; i < historial.size(); i++) {
                System.out.println((i + 1) + ". " + historial.get(i));
            }
        }
    }
}