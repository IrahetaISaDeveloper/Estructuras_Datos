package PlaylistMusic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList; // Necesitamos importar LinkedList para usarlo

public class Main {

    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<>();

        System.out.println("Mi top 10 de canciones:");
        playlist.add("Tuyo - Mora ");
        playlist.add("Devil in a new dress - Kanye West ");
        playlist.add("Stupid Love Story - Cancerbero");
        playlist.add("Nunca Estoy - C.Tangana");
        playlist.add("Safaera - Bad Bunny");
        playlist.add("Escorpiones - Cráneo");
        playlist.add("Todo Bien - Alvaro Díaz");
        playlist.add("Effy - Yung Beef");
        playlist.add("Everything I Am - Kanye West");
        playlist.add("We Major - Kanye West");

        //PLaylist Inicial
        System.out.println("Playlist inicial (TOP 10): " + playlist);


        System.out.println("Añadiendo 3 canciones al final");
        playlist.add("IFHY - Tyler The Creator");
        playlist.add("Pyramids - Frank Ocean");
        playlist.add("Lo Que Siento - Cuco");
        System.out.println("Playlist final: " + playlist);


        System.out.println("Agregando reproducción siguiente");

        playlist.addFirst("Besos Mojados - Wisin & Yandel");
        System.out.println("Playlist con reproduccion siguiente: " + playlist);


        System.out.println("Eliminando la última canción ");

        String cancionEliminada = playlist.removeLast();
        System.out.println("Canción eliminada: " + cancionEliminada);
        System.out.println("Playlist: " + playlist);



        System.out.println("Playlist final ordenada");

        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i));
        }
        
    }
}