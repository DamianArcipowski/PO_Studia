import java.util.Objects;

public class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota, String statusPlatnosci) {
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        if (kwota <= 0)
            throw new IllegalArgumentException("Kwota nie może być mniejsza bądź równa zero!");

        this.kwota = kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        if (statusPlatnosci == null || statusPlatnosci.isEmpty())
            throw new IllegalArgumentException("Status płatności nie może być pusty!");

        this.statusPlatnosci = statusPlatnosci;
    }

    public void zaplac(double kwota) {
        statusPlatnosci = "Opłacone";
        this.kwota = kwota;
    }

    /*@Override
    public String getClass(Object obj) {}*/

    @Override
    public String toString() {
        return "Platnosc [kwota=" + kwota + ", statusPlatnosci=" + statusPlatnosci + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(kwota, statusPlatnosci);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Platnosc platnosc = (Platnosc) obj;
        if ((this == platnosc) && (this.kwota == platnosc.kwota) && (this.statusPlatnosci == platnosc.statusPlatnosci)) {
            return true;
        }

        return false;
    }

}
