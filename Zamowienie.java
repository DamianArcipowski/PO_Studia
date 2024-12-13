public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia;
    Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia, Platnosc platnosc) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = platnosc;
    }

    public void ustawStatusZamowienia(String status) {
        statusZamowienia = status;
    }

    public void wyswietlZamowienie() {
        System.out.println("Zawartość koszyka: ");
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status: " + statusZamowienia);
    }

    public void finalizujZamowienie() {
        if (platnosc.statusPlatnosci == "Opłacone")
            statusZamowienia = "Gotowe do wysyłki";
    }

    public void zwrocProdukt(Produkt produkt, int returnAmount) {
        int amount = koszykZakupowy.listaProduktow.get(produkt);
        if (amount == returnAmount) {
            koszykZakupowy.listaProduktow.remove(produkt);
            produkt.dodajDoMagazynu(returnAmount);
        }
        else {
            koszykZakupowy.listaProduktow.put(produkt, amount - returnAmount);
            produkt.dodajDoMagazynu(returnAmount);
        }
        
    }
}
