import java.util.Objects;

public class Osoba {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie == null || imie.isEmpty())
            throw new IllegalArgumentException("Imie nie może być puste!");

        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko == null || nazwisko.isEmpty())
            throw new IllegalArgumentException("Nazwisko nie może być puste!");

        this.nazwisko = nazwisko;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }
}
