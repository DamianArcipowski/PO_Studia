import java.util.ArrayList;

public class Sanie {
    private ArrayList<Renifer> listaReniferow;

    public Sanie(ArrayList<Renifer> listaReniferow) {
        this.listaReniferow = listaReniferow;
    }

    public ArrayList<Renifer> getRenifery() {
        return listaReniferow;
    }

    public void setRenifery(ArrayList<Renifer>  listaReniferow) {
        if (listaReniferow == null || listaReniferow.size() == 0)
            throw new IllegalArgumentException("Lista reniferów nie może być pusta!");

        this.listaReniferow = listaReniferow;
    }

    @Override
    public String toString() {
        return "Sanie{listaReniferow='listaReniferow'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Sanie sanie = (Sanie) obj;

        if ((this == sanie) && (this.listaReniferow == sanie.listaReniferow))
            return true;

        return false;
    }

    public void dodajRenifera(Renifer renifer) {
        listaReniferow.add(renifer);
    }

    public int sumaPredkosci() {
        int totalSpeed = 0;

        for (Renifer renifer : listaReniferow) {
            totalSpeed += renifer.getPredkosc();
        }

        return totalSpeed;
    }

    public Renifer najwolniejszyRenifer() {
        Renifer slowestReindeer = listaReniferow.get(0);
        int minSpeed = listaReniferow.get(0).getPredkosc();

        for (Renifer renifer : listaReniferow) {
            if (renifer.getPredkosc() < minSpeed) {
                minSpeed = renifer.getPredkosc();
                slowestReindeer = renifer;
            }
        }

        return slowestReindeer;
    }
}
