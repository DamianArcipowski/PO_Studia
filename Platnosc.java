public class Platnosc {
    double kwota;
    String statusPlatnosci;

    public Platnosc(double kwota, String statusPlatnosci) {
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }

    public void zaplac(double kwota) {
        statusPlatnosci = "Opłacone";
        this.kwota = kwota;
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
