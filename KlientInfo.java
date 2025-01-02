public interface KlientInfo {
    public void dodajZamowienie(Zamowienie zamowienie);
    public void wyswietlHistorieZamowien();
    public int obliczLacznyKosztZamowien();
    public void usunZamowienie(Zamowienie zamowienie);
    public void aktualizujZamowienie(Zamowienie zamowienie);
}
