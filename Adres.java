public class Adres {
    String ulica;
    String numerDomu;
    String numerMieszkania;
    String miasto;
    String kodPocztowy;

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

    public void pokaz() {
        System.out.println(kodPocztowy + " " + miasto);
        System.out.println(ulica + " " + numerDomu + " " + numerMieszkania);
    }

    public String przed(Adres adres) {
        String adres1Str = this.kodPocztowy.replace("-", "");
        String adres2Str = adres.kodPocztowy.replace("-", "");

        return Integer.parseInt(adres1Str) < Integer.parseInt(adres2Str) ? "Przed" : "Po";
    }

    /*@Override
    /public String getClass() {}
    compilation error!
    */
}