public interface SklepInfo {
    public void dodajProdukt(Produkt produkt);
    public void wyswietlOferty();
    public Produkt wyszukajProduktu(String nazwa);
    public void zakupy(Produkt produkt, int ilosc, KoszykZakupowy koszyk);
    public void usunProdukt(Produkt produkt);
}
