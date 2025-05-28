package RegistroTemperaturasCiudad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> temperaturas = new TreeMap<>();

        temperaturas.put("San Salvador", 28);
        temperaturas.put("Ayutuxtepeque", 26);
        temperaturas.put("Apopa", 28);
        temperaturas.put("Cuscatancingo", 26);
        temperaturas.put("Mejicanos", 26);
        temperaturas.put("San Miguel", 32);
        temperaturas.put("Soyapango", 27);


        System.out.println("Temperaturas ordenadas alfabeticamente");
        for (Map.Entry<String, Integer> entrada : temperaturas.entrySet()) {
            String ciudad = entrada.getKey();
            int temp = entrada.getValue();
            System.out.println("Nombre de la ciudad: " + ciudad + " Grados: "+ temp + "°C");
        }


        String ciudadFria = null;
        int tempMinima = Integer.MAX_VALUE;

        String ciudadCaliente = null;
        int tempMaxima = Integer.MIN_VALUE;


        for (Map.Entry<String, Integer> entrada : temperaturas.entrySet()) {
            String ciudadActual = entrada.getKey();
            int tempActual = entrada.getValue();

            if (tempActual < tempMinima) {
                tempMinima = tempActual;
                ciudadFria = ciudadActual;
            }

            if (tempActual > tempMaxima) {
                tempMaxima = tempActual;
                ciudadCaliente = ciudadActual;
            }
        }

        System.out.println("La ciudad más fría es: " + ciudadFria + " con " + tempMinima + "°C");
        System.out.println("La ciudad más caliente es: " + ciudadCaliente + " con " + tempMaxima + "°C");
    }
}