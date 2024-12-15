import java.util.ArrayList;

public class Fabryka {
    private ArrayList<Elf> elfy;
    private int dlGeo;
    private int szGeo;

    public Fabryka(ArrayList<Elf> elfy, int dlGeo, int szGeo) {
        this.elfy = elfy;
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }

    public ArrayList<Elf> getElfy() {
        return elfy;
    }

    public int getDlGeo() {
        return dlGeo;
    }

    public int getSzGeo() {
        return szGeo;
    }

    public void setElfy(ArrayList<Elf> elfy) {
        if (elfy == null || elfy.size() == 0)
            throw new IllegalArgumentException("Lista elfów nie może być pusta!");

        this.elfy = elfy;
    }

    public void setDlGeo(int dlGeo) {
        if (dlGeo < -180 || dlGeo > 180)
            throw new IllegalArgumentException("Długość geograficzna musi być z zakresu <-180;180>!");

        this.dlGeo = dlGeo;
    }

    public void setSzGeo(int szGeo) {
        if (szGeo < -90 || szGeo > 90)
            throw new IllegalArgumentException("Szerokość geograficzna musi być z zakresu <-90;90>!");

        this.szGeo = szGeo;
    }

    @Override
    public String toString() {
        return "Fabryka{elfy='elfy, dlGeo='dlGeo', szGeo='szGeo'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Fabryka fabryka = (Fabryka) obj;

        if ((this == fabryka) && (this.elfy == fabryka.elfy) && (this.dlGeo == fabryka.dlGeo) && (this.szGeo == fabryka.szGeo))
            return true;

        return false;
    }

    public void dodajPracownika(Elf elf) {
        elfy.add(elf);
    }

    public void usunPracownika(Elf elf) {
        elfy.remove(elf);
    }

    public Elf najstarszyPracownik() {
        Elf oldestElf = elfy.get(0);
        int maxAge = elfy.get(0).getWiek();

        for (Elf elf : elfy) {
            if (elf.getWiek() > maxAge) {
                maxAge = elf.getWiek();
                oldestElf = elf;
            }
        }

        return oldestElf;
    }
}
