public interface ZamowienieInfo {  
    public void ustawStatusZamowienia(String status);
    public void wyswietlZamowienie();
    public void finalizujZamowienie();
    public void zwrocProdukt(Produkt produkt, int returnAmount);
    public double obliczPodatek();
}
