public class Renifer {
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc) {
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public String getImie() {
        return imie;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setImie(String imie) {
        if (imie == null || imie == "")
            throw new IllegalArgumentException("Imie nie może być ani puste ani nullem!");

        this.imie = imie;
    }

    public void setPredkosc(int predkosc) {
        if (predkosc < 0)
            throw new IllegalArgumentException("Prędkość nie może być liczba ujemną!");

        this.predkosc = predkosc;
    }

    @Override
    public String toString() {
        return "Renifer{imie='imie', predkosc='predkosc'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Renifer renifer = (Renifer) obj;

        if ((this == renifer) && (this.imie == renifer.imie) && (this.predkosc == renifer.predkosc))
            return true;

        return false;
    }

    public void nakarmRenifera() {
        predkosc += 5;
    }
}
