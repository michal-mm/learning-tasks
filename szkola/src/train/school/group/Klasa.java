package train.school.group;

/**
 * Created by michal on 03.05.15.
 */
public class Klasa {

    /*
     * TODO - napisz implementacje klasy Klasa
     *
     * Klasa to zbior uczniow danej klasy, np. "Klasa 3C"
     * Obiekt typu Klasa ma miec pole z nazwa, zeby przechowac napis np. "Klasa 2E"
     *
     * Obiekt typu klasa ma miec tablice obiektow typu Uczen,
     * w ktorej beda przechowywani uczniowie; w klasie moze byc maksymalnie 5 uczniow
     *
     * 1. Zaimplementuj metode listaUczniow()
     * metoda ma wypisac liste wszystkich uczniow w nastepujacy sposob:
     * 1. Jan Kowalski
     * 2. Adam Nowak
     * 3. Bronek Komor
     * ...
     *
     * 2. Zaimplementuj metode wypisujaca liste uczniow wraz ze wszystkimi ocenami i srednia ocen
     * listaUczniowZOcenami ()
     * podpowiedz: skorzystaj z odpowiedniej metody w klasie Uczen
     *
     * 3.0 W tej klasie jest na razie blad - "cannot resolve symbol Uczen" - popraw importy
     *
     * 3.1 Zaimplementuj metode dodajUcznia (Uczen u)
     * metod ta ma dopisac ucznia do listy uczniow w klasie
     * metoda ma zwrocic wartosc true jesli uda sie dopisac ucznia,
     * lub false jesli lista jest juz pelna;
     * dodatkowo metoda powinna wypisywac na ekran informacje:
     * "Uczen <imie nazwisko> dopisany do klasy <nazwa klasy>"
     * lub jesli sie nie udalo:
     * "<nazwa klasy> jest juz pelna - <imie nazwisko> musi zmienic szkole"
     * (lub dowolne inne komunikaty :-)
     *
     * 4. Napisz metode, ktora zwraca liczbe uczniow w tej klasie
     */


    public void listaUczniow () {
        // TODO - wypisz na ekran liste uczniow
    }

    public void listaUczniowZOcenami () {
        // TODO - wypisz liste uczniow z ocenami
    }

    public boolean dodajUcznia (Uczen u) {
        // TODO - zaimplementuj metode...
        return false;
    }

    public int liczbaUczniow () {
        // TODO - zaimplementuj metode zwracajaca liczbe uczniow w klasie
        return -1;
    }
}
