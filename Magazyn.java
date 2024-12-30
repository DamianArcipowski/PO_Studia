import java.util.ArrayList;

public class Magazyn {
    private ArrayList<Produkt> produkt;
    private int ilosc;

    Magazyn(ArrayList<Produkt> produkt, int ilosc) {
        this.produkt = produkt;
        this.ilosc = ilosc;
    }

    public ArrayList<Produkt> getProdukt() {
        return produkt;
    }

    public void setProdukt(ArrayList<Produkt> produkt) {
        if (produkt == null || produkt.isEmpty())
            throw new IllegalArgumentException("Lista produktów nie może być pusta!");

        this.produkt = produkt;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        if (ilosc < 0)
            throw new IllegalArgumentException("Ilość produktów nie może być ujemna!");

        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "Magazyn [produkt=" + produkt + ", ilosc=" + ilosc + "]";
    }

    /*@Override
    public String getClass(Object obj) {}*/
}
