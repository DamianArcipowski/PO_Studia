public class Jablko extends Owoc {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Jablko(String nazwa, double cena, int iloscNaMagazynie) {
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
    public void smak() {
        System.out.println("Smak jest słodki");
    }

    @Override
    public void umyj() {
        System.out.println("Jabłko zostało umyte");
    }

    @Override
    public void zjedz() {
        System.out.println("Jabłko zostało zjedzone");
    }

}
