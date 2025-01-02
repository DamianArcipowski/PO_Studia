import java.util.ArrayList;

public class KlientFirmowy extends Klient {
    private long NIP;
    private long REGON;

    public KlientFirmowy(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien, Adres adres, long NIP, long REGON) {
        super(imie, nazwisko, listaZamowien, adres);
        this.NIP = NIP;
        this.REGON = REGON;
    }

    public long getNIP() {
        return NIP;
    }

    public void setNIP(long NIP) {
        this.NIP = NIP;
    }

    public long getREGON() {
        return REGON;
    }

    public void setREGON(long REGON) {
        this.REGON = REGON;
    }

}
