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

    //public void przed() {} ?

    @Override
    public String toString() {
        if (numerMieszkania == "")
            return kodPocztowy + " " + miasto + " " + ulica + " " + numerDomu;
        else
            return kodPocztowy + " " + miasto + " " + ulica + " " + numerDomu + " " + numerMieszkania;
    }

    /*@Override
    /public String getClass() {}
    compilation error!
    */
}