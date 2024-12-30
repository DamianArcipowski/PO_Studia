import java.util.ArrayList;
import java.util.Objects;

public class Klient {
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien;
    private Adres adres;

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
        this.adres = adres;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null || imie.isEmpty())
            throw new IllegalArgumentException("Imie nie może być puste!");

        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null || nazwisko.isEmpty())
            throw new IllegalArgumentException("Nazwisko nie może być puste!");

        this.nazwisko = nazwisko;
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
        return "Klient [imie=" + imie + ", nazwisko=" + nazwisko + ", listaZamowien=" + listaZamowien + ", adres="
                + adres + "]";
    }

    /*@Override
    public String getClass(Object obj) {}*/

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres);
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Klient klient = (Klient) obj;
        if ((this == klient) && (this.imie == klient.imie) && (this.nazwisko == klient.nazwisko) && (this.adres == klient.adres)) {
            return true;
        }

        return false;
    }
}
