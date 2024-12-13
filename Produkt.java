public class Produkt {
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
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
        return nazwa + " " + cena + " " + iloscNaMagazynie;
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
