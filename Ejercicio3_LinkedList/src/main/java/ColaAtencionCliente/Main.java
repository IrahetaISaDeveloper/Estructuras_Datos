package ColaAtencionCliente;

import java.util.LinkedList; // Necesitamos importar LinkedList para usarlo

public class Main {
    public static void main(String[] args) {
        LinkedList<String> Cola = new LinkedList<>();

        System.out.println("Primeros CLientes");
        Cola.add("Oscar Peréz");
        Cola.add("Eduardo Galvéz");
        Cola.add("Javier Iraheta");
        System.out.println("Cola actual: " + Cola);


        if (!Cola.isEmpty()) {
            String clienteAtendido = Cola.removeFirst();
            System.out.println("Cliente atendido: " + clienteAtendido);
        } else {
            System.out.println("No hay clientes en la cola para atender.");
        }
        System.out.println("Cola después de atenderlo: " + Cola);


        System.out.println("¡Ha llegado un Cliente Prioritario!");

        Cola.addFirst("Josue Guinea (master)");
        System.out.println("Bienvenido!" + Cola.getFirst());
        System.out.println("Cola después del prioritario: " + Cola);


        System.out.println("Siguiente CLiente");
        if (!Cola.isEmpty()) {
            String siguienteCliente = Cola.peekFirst();
            System.out.println("El siguiente cliente en la cola es: " + siguienteCliente);
        } else {
            System.out.println("La cola está vacía, no hay nadie en la fila.");
        }
    }
}