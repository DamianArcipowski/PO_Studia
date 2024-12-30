import java.time.LocalDate;
import java.util.ArrayList;

public class Sklep {
    private ArrayList<Produkt> produkty;
    private String nazwaSklepu;
    private LocalDate dataPowstania;
    private Magazyn magazynSklepu;

    public Sklep(ArrayList<Produkt> produkty, String nazwaSklepu, LocalDate dataPowstania, Magazyn magazynSklepu) {
        this.produkty = produkty;
        this.nazwaSklepu = nazwaSklepu;

        LocalDate localDate = LocalDate.now();
        if (dataPowstania.isAfter(localDate))
            throw new IllegalArgumentException();

        this.dataPowstania = dataPowstania;
        this.magazynSklepu = magazynSklepu;
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(ArrayList<Produkt> produkty) {
        if (produkty == null)
            throw new IllegalArgumentException("Lista produktów nie może być pusta!");

        this.produkty = produkty;
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if (nazwaSklepu == null || nazwaSklepu.isEmpty())
            throw new IllegalArgumentException("Nazwa sklepu nie może być pusta!");

        this.nazwaSklepu = nazwaSklepu;
    }

    public LocalDate getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(LocalDate dataPowstania) {
        LocalDate localDate = LocalDate.now();

        if (dataPowstania == null || dataPowstania.isAfter(localDate))
            throw new IllegalArgumentException("Data powstania nie może być datą z przyszłości!");

        this.dataPowstania = dataPowstania;
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if (magazynSklepu == null)
            throw new IllegalArgumentException("Magazyn nie może być nullem!");

        this.magazynSklepu = magazynSklepu;
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void wyswietlOferty() {
        for (Produkt produkt : produkty) {
            System.out.println("Nazwa: " + produkt.getNazwa() + " | " + "Cena: " + produkt.getCena());
        }
    }

    public Produkt wyszukajProduktu(String nazwa) {
        for (Produkt produkt : produkty) {
            if (produkt.getNazwa() == nazwa)
                return produkt;
        }

        return null;
    }

    public void zakupy(Produkt produkt, int ilosc, KoszykZakupowy koszyk) {
        koszyk.dodajProdukt(produkt, ilosc);
    }

    @Override
    public String toString() {
        return "Sklep [produkty=" + produkty + ", nazwaSklepu=" + nazwaSklepu + ", dataPowstania=" + dataPowstania
                + ", magazynSklepu=" + magazynSklepu + "]";
    }

    /*@Override
    public String getClass(Object obj) {}*/
}
