import java.util.HashMap;

public class KoszykZakupowy {
    private HashMap<Produkt, Integer> listaProduktow;

    public KoszykZakupowy(HashMap<Produkt, Integer> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public HashMap<Produkt, Integer> getListaProduktow() {
        return listaProduktow;
    }

    public void setListaProduktow(HashMap<Produkt, Integer> listaProduktow) {
        if (listaProduktow == null || listaProduktow.isEmpty())
            throw new IllegalArgumentException("Lista produktów nie może być pusta!");

        this.listaProduktow = listaProduktow;
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt.getIloscNaMagazynie() - ilosc < 0)
            System.out.println("Zbyt mała ilość produktu na magazynie!");
        else {
            listaProduktow.put(produkt, ilosc);
            produkt.usunZMagazynu(ilosc);
        }
    }

    public void wyswietlZawartoscKoszyka() {
        for (Produkt produkt : listaProduktow.keySet()) {
            System.out.println(produkt.getNazwa() + ": " + produkt.getCena());
        }
    }

    public double obliczCalkowitaWartosc() {
        double totalPrice = 0;
        double productPrice;
        double productAmount;

        for (Produkt produkt : listaProduktow.keySet()) {
            productPrice = produkt.getCena();
            productAmount = listaProduktow.get(produkt);
            totalPrice += productAmount * productPrice;

        }

        return totalPrice;
    }

    @Override
    public String toString() {
        return "KoszykZakupowy [listaProduktow=" + listaProduktow + "]";
    }

    /*@Override
    public String getClass(Object obj) {}*/

}
