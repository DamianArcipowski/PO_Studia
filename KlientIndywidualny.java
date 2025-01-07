import java.util.ArrayList;

public class KlientIndywidualny extends Klient {
    private String Pesel;

    public KlientIndywidualny(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres, String Pesel) {
        super(imie, nazwisko, listaZamowien, adres);
        this.Pesel = Pesel;
    }

    private boolean isIntegerParsable(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String Pesel) {
        if (Pesel.length() != 11 || !isIntegerParsable(Pesel))
            throw new IllegalArgumentException("String musi być długości 9 i składać się jedynie z cyfr!");

        this.Pesel = Pesel;
    }

}
