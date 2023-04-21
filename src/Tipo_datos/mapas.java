package Tipo_datos;

import java.util.HashMap;
import java.util.Map;

public class mapas {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Clave1", 10);
        mapa.put("Clave2", 11);
        mapa.put("Clave3", 12);
        mapa.put("Clave4", 13);
        mapa.put("clave1", 100);
        mapa.replace("clave1", 1000);
        mapa.remove("Clave1");
        System.out.println(mapa);

        for (Map.Entry<String, Integer> elemento : mapa.entrySet()) {
            System.out.println("Clave: " + elemento.getKey() + " - Valor: " + elemento.getValue());
        }

    }
}
