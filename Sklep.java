import java.util.ArrayList;
import java.util.Date;

public class Sklep {
    ArrayList<Produkt> produkty;
    String nazwaSklepu;
    Date dataPowstania;
    Magazyn magazynSklepu;

    public Sklep(ArrayList<Produkt> produkty, String nazwaSklepu, Date dataPowstania, Magazyn magazynSklepu) {
        this.produkty = produkty;
        this.nazwaSklepu = nazwaSklepu;
        //if (dataPowstania > ) to finish
        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void wyswietlOferty() {
        for (Produkt produkt : produkty) {
            System.out.println("Nazwa: " + produkt.nazwa + " | " + "Cena: " + produkt.cena);
        }
    }

    public Produkt wyszukajProduktu(String nazwa) {
        for (Produkt produkt : produkty) {
            if (produkt.nazwa == nazwa)
                return produkt;
        }

        return null;
    }

    public void zakupy(Produkt produkt, int ilosc, KoszykZakupowy koszyk) {
        koszyk.dodajProdukt(produkt, ilosc);
    }
}
