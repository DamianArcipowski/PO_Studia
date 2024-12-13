import java.util.HashMap;

public class KoszykZakupowy {
    HashMap<Produkt, Integer> listaProduktow;

    public KoszykZakupowy(HashMap<Produkt, Integer> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt.iloscNaMagazynie - ilosc < 0)
            System.out.println("Zbyt mała ilość produktu na magazynie!");
        else {
            listaProduktow.put(produkt, ilosc);
            produkt.usunZMagazynu(ilosc);
        }
    }

    public void wyswietlZawartoscKoszyka() {
        for (Produkt produkt : listaProduktow.keySet()) {
            System.out.println(produkt.nazwa + ": " + produkt.cena);
        }
    }

    public double obliczCalkowitaWartosc() {
        double totalPrice = 0;
        double productPrice;
        double productAmount;

        for (Produkt produkt : listaProduktow.keySet()) {
            productPrice = produkt.cena;
            productAmount = listaProduktow.get(produkt);
            totalPrice += productAmount * productPrice;

        }

        return totalPrice;
    }

}
