import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Mleko", 4.00, 150);
        Produkt p2 = new Produkt("Masło", 7.00, 80);
        Produkt p3 = new Produkt("Chleb", 5.00, 300);
        Produkt p4 = new Produkt("Chleb", 5.00, 300);
        Produkt p5 = new Produkt("Ser", 17.00, 100);
        p1.wyswietlInformacje();
        p1.dodajDoMagazynu(15);
        p1.usunZMagazynu(10);
        p1.wyswietlInformacje();
        System.out.println("----------------------------------");
        HashMap<Produkt, Integer> zakupy = new HashMap<Produkt, Integer>();
        zakupy.put(p2, 10);
        HashMap<Produkt, Integer> zakupy2 = new HashMap<Produkt, Integer>();
        zakupy2.put(p2, 10);
        p2.usunZMagazynu(10);
        KoszykZakupowy k1 = new KoszykZakupowy(zakupy);
        k1.wyswietlZawartoscKoszyka();
        k1.dodajProdukt(p1, 30);
        k1.wyswietlZawartoscKoszyka();
        System.out.println("Wartosc koszyka: " + k1.obliczCalkowitaWartosc());
        p1.wyswietlInformacje();
        KoszykZakupowy k2 = new KoszykZakupowy(zakupy2);
        System.out.println("----------------------------------");
        Platnosc testPlatnosc = new Platnosc(70.00, "Opłacone");
        Zamowienie zamow1 = new Zamowienie(k1, "Nowe", testPlatnosc);
        System.out.println("Przed płatnością: ");
        zamow1.ustawStatusZamowienia("W trakcie pakowania");
        zamow1.wyswietlZamowienie();
        System.out.println("Po płatności: ");
        zamow1.finalizujZamowienie();
        zamow1.wyswietlZamowienie();
        System.out.println("Przed zwrotem produktu: ");
        zamow1.wyswietlZamowienie();
        zamow1.getKoszykZakupowy().wyswietlZawartoscKoszyka();
        zamow1.getKoszykZakupowy().obliczCalkowitaWartosc();
        System.out.println(p1.toString());
        zamow1.zwrocProdukt(p1, 10);
        System.out.println("Po zwrocie produktu: ");
        zamow1.wyswietlZamowienie();
        zamow1.getKoszykZakupowy().wyswietlZawartoscKoszyka();
        zamow1.getKoszykZakupowy().obliczCalkowitaWartosc();
        System.out.println(p1.toString());
        Zamowienie zamow2 = new Zamowienie(k2, "Nowe", testPlatnosc);
        System.out.println("----------------------------------");
        ArrayList<Zamowienie> testZamowien = new ArrayList<Zamowienie>() {
            {
                add(zamow1);
                add(zamow2);
            }
        };
        Adres adresKlienta = new Adres("Leśna", "13B", "Olsztyn", "10-250");
        Adres adresKlienta2 = new Adres("Agrestowa", "13B", "Olsztyn", "10-251");
        System.out.println(adresKlienta.przed(adresKlienta2));
        Klient klient1 = new Klient("Jan", "Kowalski", testZamowien, adresKlienta);
        klient1.wyswietlHistorieZamowien();
        System.out.println("Łączny koszt zamówień: " + klient1.obliczLacznyKosztZamowien());
        Klient klient2 = new Klient("Jan", "Kowalski", testZamowien, adresKlienta);
        klient1.dodajZamowienie(zamow2);
        System.out.println("----------------------------------");
        ArrayList<Produkt> listaProduktowMagazyn = new ArrayList<Produkt>() {
            {
                add(p1);
                add(p3);
            }
        };
        ArrayList<Produkt> listaProduktow = new ArrayList<Produkt>() {
            {
                add(p2);
            }
        };
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate shopDate = LocalDate.parse("2015-02-20", formatter);
        Magazyn warehouse = new Magazyn(listaProduktowMagazyn, 2);
        Sklep tesco = new Sklep(listaProduktow, "Tesco", shopDate, warehouse);
        tesco.dodajProdukt(p2);
        tesco.wyswietlOferty();
        System.out.println("Zakupy: ");   
        tesco.zakupy(p5, 5, k2);
        k2.wyswietlZawartoscKoszyka();
        p5.wyswietlInformacje();
        System.out.println(tesco.wyszukajProduktu("Mleko"));
        System.out.println(tesco.wyszukajProduktu("Ketchup"));
        System.out.println("----------------------------------");
        Platnosc platnosc1 = new Platnosc(15.24, "Nowa");
        Platnosc platnosc2 = new Platnosc(17.00, "Nowa");
        System.out.println("----------------------------------");
        System.out.println("Testy metody equals:");
        System.out.println(p3.equals(p4));
        System.out.println(platnosc1.equals(platnosc2));
        System.out.println(klient1.equals(klient2));
        System.out.println("----------------------------------");
        Adres adres1 = new Adres("Polna", "51A", "Olsztyn", "10-250");
        adres1.pokaz();
        Adres adres2 = new Adres("Polna", "30", "11", "Olsztyn", "10-250");
        adres2.pokaz();
        System.out.println(adres1.toString());
        System.out.println(adres2.toString());
        System.out.print(k1.getClass());
        System.out.println("\n----------------------------------");
        Jablko jablko = new Jablko("Champion", 2.99, 1000);
        jablko.smak();
        jablko.umyj();
        jablko.zjedz();
        Cytryna cytryna = new Cytryna("Zwyczajna", 6.50, 600);
        cytryna.smak();
        cytryna.umyj();
        cytryna.zjedz();
        Koszulka koszulka = new Koszulka("T-shirt Nike", 99, 30);
        koszulka.wypierz();
        koszulka.zaloz();
        koszulka.wyprasuj();
        koszulka.wysusz();
        koszulka.zniszcz();
        Bluza bluza = new Bluza("Hoodie Nike", 215, 20);
        bluza.wypierz();
        bluza.zaloz();
        bluza.wyprasuj();
        bluza.wysusz();
        bluza.zniszcz();
        PlatkiKukurydziane platkiKukurydziane = new PlatkiKukurydziane("Płatki kukurydziane", 9.50, 300);
        System.out.println(platkiKukurydziane.getNazwa());
        SerZolty serZolty = new SerZolty("Ser żółty", 9.90, 300);
        System.out.println(serZolty.getNazwa());
        Biurko biurko = new Biurko("Biurko", 350, 25);
        System.out.println(biurko.getNazwa());
        Komputer komputer = new Komputer("Komputer", 2199, 15);
        System.out.println(komputer.getNazwa());
    }
}
