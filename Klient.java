import java.util.ArrayList;
import java.util.Objects;

public class Klient extends Osoba {
    private ArrayList<Zamowienie> listaZamowien;
    private Adres adres;

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres) {
        super(imie, nazwisko);
        this.listaZamowien = listaZamowien;
        this.adres = adres;
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        if (listaZamowien == null || listaZamowien.isEmpty())
            throw new IllegalArgumentException("Lista zamówień nie może być pusta!");

        this.listaZamowien = listaZamowien;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if (adres == null)
            throw new IllegalArgumentException("Adres nie może być nullem!");

        this.adres = adres;
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        listaZamowien.add(zamowienie);
    }

    public void wyswietlHistorieZamowien() {
        for (Zamowienie zamowienie : listaZamowien) {
            zamowienie.wyswietlZamowienie();
        }
    }

    public int obliczLacznyKosztZamowien() {
        int totalPriceForAllOrders = 0;

        for (Zamowienie zamowienie : listaZamowien) {
            totalPriceForAllOrders += zamowienie.getKoszykZakupowy().obliczCalkowitaWartosc();
        }

        return totalPriceForAllOrders;
    }

    @Override
    public String toString() {
        return "Klient [imie=" + getImie() + ", nazwisko=" + getNazwisko() + ", listaZamowien=" + listaZamowien + ", adres="
                + adres + "]";
    }

    /*@Override
    public String getClass(Object obj) {}*/

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), adres);
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Klient klient = (Klient) obj;
        if ((this == klient) && (this.getImie().equals(klient.getImie())) && (this.getNazwisko().equals(klient.getNazwisko())) && (this.adres == klient.adres)) {
            return true;
        }

        return false;
    }
}
