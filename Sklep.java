import java.util.ArrayList;

public class Sklep {
    ArrayList<Produkt> produkty;

    public Sklep(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
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
