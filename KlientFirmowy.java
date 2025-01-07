import java.util.ArrayList;

public class KlientFirmowy extends Klient {
    private String NIP;
    private String REGON;

    public KlientFirmowy(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres, String NIP, String REGON) {
        super(imie, nazwisko, listaZamowien, adres);
        this.NIP = NIP;
        this.REGON = REGON;
    }

    private boolean isIntegerParsable(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        if (NIP.length() != 10 || !isIntegerParsable(NIP))
            throw new IllegalArgumentException("NIP musi być długości 10 i składać się jedynie z cyfr!");

        this.NIP = NIP;
    }

    public String getREGON() {
        return REGON;
    }

    public void setREGON(String REGON) {
        if (REGON.length() != 9 || !isIntegerParsable(NIP))
            throw new IllegalArgumentException("REGON musi być długości 9 i składać się jedynie z cyfr!");

        this.REGON = REGON;
    }

}
