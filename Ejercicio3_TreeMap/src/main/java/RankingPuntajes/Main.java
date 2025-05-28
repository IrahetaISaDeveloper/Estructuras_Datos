package RankingPuntajes;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Map;
import java.util.TreeMap; // Necesitamos TreeMap para que ordene los jugadores por nombre

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> puntajesJugadores = new TreeMap<>();

        puntajesJugadores.put("Mbappé", 91);
        puntajesJugadores.put("Messi", 88);
        puntajesJugadores.put("Cristiano Ronaldo", 86);
        puntajesJugadores.put("Van Dijk", 89);
        puntajesJugadores.put("Raphinha", 84);

        System.out.println("Ranking puntaje de los Jugadores (ordenado alfabéticamente)");
        for (Map.Entry<String, Integer> entrada : puntajesJugadores.entrySet()) {
            String nombreJugador = entrada.getKey();
            int puntaje = entrada.getValue();
            System.out.println("Nombre del JUgador: " + nombreJugador + " Puntaje:  " + puntaje);
        }


        String JugadorMasPuntuado = null;
        int maximoPuntaje = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entrada : puntajesJugadores.entrySet()) {
            String nombreActual = entrada.getKey();
            int puntajeActual = entrada.getValue();

            if (puntajeActual > maximoPuntaje) {
                maximoPuntaje = puntajeActual;
                JugadorMasPuntuado = nombreActual;
            }
        }

        System.out.println("El jugador con el puntaje más alto es: " + JugadorMasPuntuado +
                " con un puntaje de: " + maximoPuntaje);
    }
}