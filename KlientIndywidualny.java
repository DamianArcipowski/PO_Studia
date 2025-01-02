import java.util.ArrayList;

public class KlientIndywidualny extends Klient {
    private long Pesel;

    public KlientIndywidualny(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres, long Pesel) {
        super(imie, nazwisko, listaZamowien, adres);
        this.Pesel = Pesel;
    }

    public long getPesel() {
        return Pesel;
    }

    public void setPesel(long Pesel) {
        this.Pesel = Pesel;
    }

}
