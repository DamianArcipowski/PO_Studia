public interface KoszykInfo {
    public void dodajProdukt(Produkt produkt, int ilosc);
    public void wyswietlZawartoscKoszyka();
    public double obliczCalkowitaWartosc();
    public void usunProdukt(Produkt produkt);
    public boolean czyProduktJestWKoszyku(Produkt produkt);
}
