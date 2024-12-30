public class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, String numerDomu, String numerMieszkania, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, String numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = "";
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if (ulica == null || ulica.isEmpty())
            throw new IllegalArgumentException("Ulica nie może być pusta!");

        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        if (numerDomu == null || numerDomu.isEmpty())
            throw new IllegalArgumentException("Numer domu nie może być pusty!");

        this.numerDomu = numerDomu;
    }

    public String getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(String numerMieszkania) {
        if (numerMieszkania == null)
            throw new IllegalArgumentException("Numer mieszkania nie może być nullem!");

        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (miasto == null || miasto.isEmpty())
            throw new IllegalArgumentException("Miasto nie może być puste!");

        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if (kodPocztowy == null || kodPocztowy.isEmpty())
            throw new IllegalArgumentException("Kod pocztowy nie może być pusty!");

        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz() {
        System.out.println(kodPocztowy + " " + miasto);
        System.out.println(ulica + " " + numerDomu + " " + numerMieszkania);
    }

    public String przed(Adres adres) {
        String adres1Str = this.kodPocztowy.replace("-", "");
        String adres2Str = adres.kodPocztowy.replace("-", "");

        return Integer.parseInt(adres1Str) < Integer.parseInt(adres2Str) ? "Przed" : "Po";
    }

    @Override
    public String toString() {
        return "Adres [ulica=" + ulica + ", numerDomu=" + numerDomu + ", numerMieszkania=" + numerMieszkania
                + ", miasto=" + miasto + ", kodPocztowy=" + kodPocztowy + "]";
    }

    /*@Override
    public String getClass() {}*/
}