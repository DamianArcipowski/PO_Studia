public interface ProduktInfo {
    public void wyswietlInformacje();
    public void dodajDoMagazynu(int ilosc);
    public void usunZMagazynu(int ilosc);
    public double zwrocCenePoNazwie(String nazwa);
    public void aktualizujCene(double nowaCena);
}
