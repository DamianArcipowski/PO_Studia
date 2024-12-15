public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko) {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setImie(String imie) {
        if (imie == null || imie == "")
            throw new IllegalArgumentException("Imie nie może być ani puste ani nullem!");

        this.imie = imie;
    }

    public void setWiek(int wiek) {
        if (wiek < 0)
            throw new IllegalArgumentException("Wiek nie może być liczba ujemną!");

        this.wiek = wiek;
    }

    public void setStanowisko(String stanowisko) {
        if (stanowisko == null || stanowisko == "")
            throw new IllegalArgumentException("Stanowisko nie może być ani puste ani nullem!");

        this.stanowisko = stanowisko;
    }

   @Override
    public String toString() {
        return "Elf{imie='imie', wiek='wiek', stanowisko='stanowisko'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Elf elf = (Elf) obj;

        if ((this == elf) && (this.imie == elf.imie) && (this.wiek == elf.wiek) && (this.stanowisko == elf.stanowisko))
            return true;

        return false;
    }

    public void przedstawSie() {
        System.out.println("Cześć, nazywam się " + imie + ", mam " + wiek + " lat, a moje stanowisko pracy to " + stanowisko);
    }
}
