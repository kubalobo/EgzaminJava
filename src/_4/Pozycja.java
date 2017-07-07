package _4;

public class Pozycja {
    String nazwaTowaru;
    int ileSztuk;
    double cena;

    public Pozycja(String n, int i, double c) {
        nazwaTowaru = n;
        ileSztuk = i;
        cena = c;
    }

    double obliczWartosc() {
        return ileSztuk * cena;
    }

    public String toString() {
        return nazwaTowaru + " " + cena + " zl x " + ileSztuk + " szt. = " + obliczWartosc() + " zl";
    }
}