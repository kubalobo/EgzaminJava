package _4;

import java.util.ArrayList;
import java.util.List;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

class Zamowienie {
    List<Pozycja> pozycje = new ArrayList<>();
    int ileDodanych = 0;
    int maksRozmiar;

    Zamowienie() {
        maksRozmiar = 10;
    }
    Zamowienie(int maks) {
        maksRozmiar = maks;
    }

    void dodajPozycje(Pozycja P) {
        pozycje.add(P);
        ileDodanych++;
    }

    double obliczWartosc() {
        double wynik = 0;
        for (Pozycja p : pozycje) {
            wynik += p.obliczWartosc();
        }
        return wynik;
    }

    @Override
    public String toString() {
        for (Pozycja p : pozycje) {
            System.out.println(p.toString());
        }
        System.out.println(this.obliczWartosc() + " zl");
        return "end";
    }
}