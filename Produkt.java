import java.util.Objects;

public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
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

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Ilość na magazynie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ilosc) {
        iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ilosc) {
        if (iloscNaMagazynie - ilosc < 0)
            throw new ArithmeticException();
        else
            iloscNaMagazynie -= ilosc;
    }

    public double zwrocCenePoNazwie(String nazwa) {
        if (this.nazwa == nazwa)
            return this.cena;

        return 0;
    }

    @Override
    public String toString() {
        return "Produkt [nazwa=" + nazwa + ", cena=" + cena + ", iloscNaMagazynie=" + iloscNaMagazynie + "]";
    }

    /*@Override
    public String getClass(Object obj) {}*/

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Produkt produkt = (Produkt) obj;
        if ((this == produkt) && (this.nazwa == produkt.nazwa) && (this.cena == produkt.cena)) {
            return true;
        }

        return false;
    }

}
