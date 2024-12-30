public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia, Platnosc platnosc) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = platnosc;
    }

    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }

    public void setKoszykZakupowy(KoszykZakupowy koszykZakupowy) {
        if (koszykZakupowy == null)
            throw new IllegalArgumentException("Koszyk zakupowy nie może być nullem!");

        this.koszykZakupowy = koszykZakupowy;
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        if (statusZamowienia == null || statusZamowienia.isEmpty())
            throw new IllegalArgumentException("Status zamówienia nie może być pusty!");

        this.statusZamowienia = statusZamowienia;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        if (platnosc == null)
            throw new IllegalArgumentException("Płatność nie może być nullem!");

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
        if (platnosc.getStatusPlatnosci() == "Opłacone")
            statusZamowienia = "Gotowe do wysyłki";
    }

    public void zwrocProdukt(Produkt produkt, int returnAmount) {
        int amount = koszykZakupowy.getListaProduktow().get(produkt);
        if (amount == returnAmount) {
            koszykZakupowy.getListaProduktow().remove(produkt);
            produkt.dodajDoMagazynu(returnAmount);
        }
        else {
            koszykZakupowy.getListaProduktow().put(produkt, amount - returnAmount);
            produkt.dodajDoMagazynu(returnAmount);
        }
    }

    @Override
    public String toString() {
        return "Zamowienie [koszykZakupowy=" + koszykZakupowy + ", statusZamowienia=" + statusZamowienia + ", platnosc="
                + platnosc + "]";
    }

    /*@Override
    public String getClass(Object obj) {}*/
}
