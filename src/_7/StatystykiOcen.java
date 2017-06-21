package _7;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Kuba on 19.06.2017.
 * 7. Napisz program o nazwie StatystykiOcen, który wczytuje N liczb typu int z zakresu 1..6,
 * wypisujący na wyjście średnią, minimum, maksimum, medianę i odchylenie standardowe podanego ciągu.
 * Obliczone wartości powinny być wypisane z dokładnością do dwóch miejsc po przecinku.
 */
public class StatystykiOcen {
    Integer[] oceny;
    StatystykiOcen(Integer[] oc) {
        oceny = oc;
    }

    public float average() {
        int suma = 0;
        for(int ocena : oceny) {
            suma += ocena;
        }
        return suma / oceny.length;
    }

    public int min() {
        return Collections.min(Arrays.asList(oceny));
    }

    public int max() {
        return Collections.max(Arrays.asList(oceny));
    }

    public float mediana() {
        if(oceny.length%2 == 0) {
            return (oceny[oceny.length/2] + oceny[oceny.length/2+1]) / 2;
        }
        else {
            return oceny[oceny.length/2];
        }
    }

    public float odchylenie() {
        float suma = 0;
        float srednia = average();
        for(int i = 0; i < oceny.length; i++) {
            suma += (i+1)-srednia;
        }

        return (float) Math.sqrt(Math.pow(suma, 2)/(oceny.length+1));
    }
}
