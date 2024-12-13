import java.util.ArrayList;

public class Klient {
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien;
    Adres adres;

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
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
            totalPriceForAllOrders += zamowienie.koszykZakupowy.obliczCalkowitaWartosc();
        }

        return totalPriceForAllOrders;
    }

    //dodać Adres

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
