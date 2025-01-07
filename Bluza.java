public class Bluza extends Ubranie {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Bluza(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if (nazwa == null || nazwa.isEmpty())
            throw new IllegalArgumentException("Nazwa nie może być pusta!");

        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena <= 0)
            throw new IllegalArgumentException("Cena nie może być mniejsza bądź równa zero!");
            
        this.cena = cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        if (iloscNaMagazynie < 0)
            throw new IllegalArgumentException("Ilość na magazynie nie może być ujemna!");

        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    @Override
    public void wypierz() {
        System.out.println("Bluza została wyprana");
    }

    @Override
    public void zaloz() {
        System.out.println("Bluza została ubrana");
    }

    @Override
    public void wyprasuj() {
        System.out.println("Bluza została wyprasowana");
    }

    @Override
    public void wysusz() {
        System.out.println("Bluza została wysuszona");
    }

    @Override
    public void zniszcz() {
        System.out.println("Bluza została zniszczona");
    }

}
