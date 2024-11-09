import java.sql.SQLOutput;
import java.util.Random;

public class Class4 {

    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        Random generator = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int randomNum = (int) (Math.random() * (maxWartosc - minWartosc + 1)) + minWartosc;
            arr[i] = randomNum;
        }

        return arr;
    }

    public static void wypiszTablice(int[] tab, int n, int m) {

    }

    public static void ileNieparzystych(int[] tab) {
        int counter = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0)
                counter++;
        }

        System.out.println("Nieparzyste: " + counter);
    }

    public static void ileParzystych(int[] tab) {
        int counter = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0)
                counter++;
        }

        System.out.println("Parzyste: " + counter);
    }

    public static void ileDodatnich(int[] tab) {
        int counter = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                counter++;
        }

        System.out.println("Dodatnie: " + counter);
    }

    public static void ileZerowych(int[] tab) {
        int counter = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0)
                counter++;
        }

        System.out.println("Zerowe: " + counter);
    }

    public static void ileUjemnych(int[] tab) {
        int counter = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0)
                counter++;
        }

        System.out.println("Ujemne: " + counter);
    }

    public static void ileMaxymalnych(int[] tab) {
        int max = tab[0];
        int counterMax = 0;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == max)
                counterMax++;
        }

        System.out.println("Maksymalne: " + counterMax);
    }

    public static void ileMinimalnych(int[] tab) {
        int min = tab[0];
        int counterMin = 0;

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min)
                min = tab[i];
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == min)
                counterMin++;
        }

        System.out.println("Minimalne: " + counterMin);
    }

    public static void ileUnikalnych(int[] tab) {

    }

    public static void sumaDodatnich(int[] tab) {
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                sum += tab[i];
        }

        System.out.println("Suma dodatnich: " + sum);
    }

    public static void sumaUjemnych(int[] tab) {
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0)
                sum += tab[i];
        }

        System.out.println("Suma ujemnych: " + sum);
    }

    public static void sumaOdwrotnosci(int[] tab) {
        double sum = 0;

        for (int i = 0; i < tab.length; i++) {
            sum += (1 / (double) tab[i]);
        }

        System.out.println("Suma odwrotności: " + sum);
    }

    public static void sredniaArytmetyczna(int[] tab) {
        double sum = 0;

        for (int i = 0; i < tab.length; i++) {
            sum += (double) tab[i];
        }

        double avg = sum / tab.length;

        System.out.println("Średnia arytmetyczna: " + avg);
    }

    public static void sredniaGeometryczna(int[] tab) {
        double sum = 1;

        for (int i = 0; i < tab.length; i++) {
            sum *= (double) tab[i];
        }

        double avg = Math.pow(sum, 1 / tab.length);

        System.out.println("Średnia geometryczna: " + avg);
    }

    public static void sredniaHarmoniczna(int[] tab) {
        double sum = 0;

        for (int i = 0; i < tab.length; i++) {
            sum += (double) (1 / tab[i]);
        }

        double avg = tab.length / sum;

        System.out.println("Średnia harmoniczna: " + avg);
    }

    public static int[] funkcjaSignum(int[] tab) {
        int signum[] = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                signum[i] = 1;
            else if (tab[i] == 0)
                signum[i] = 0;
            else
                signum[i] = -1;
        }

        return signum;
    }

    public static void najdluzszyCiagDodatnich(int[] tab) {
        int maxLength = 0;
        int tempMax = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                tempMax += 1;
            else
                maxLength = tempMax;
        }

        System.out.println("Najdłuższy ciąg dodatnich: " + maxLength);
    }

    public static void najdluzszyCiagUjemnych(int[] tab) {
        int maxLength = 0;
        int tempMax = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0)
                tempMax += 1;
            else
                maxLength = tempMax;
        }

        System.out.println("Najdłuższy ciąg ujemnych: " + maxLength);
    }

    public static void odwrocTablice(int[] tab) {
        int reversedArr[] = new int[tab.length];
        int idx = 0;

        for (int i = tab.length - 1; i >= 0; i--) {
            reversedArr[idx] = tab[i];
            idx++;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Initial array: " + tab[i]);
            System.out.println("Reversed array: " + reversedArr[i]);
        }
    }

    public static void odwrocTablice(int[] tab, int indeksStart, int indeksStop) {
        int reversedArr[] = new int[tab.length];
        int idx = 0;

        for (int i = tab.length - 1; i >= 0; i--) {
            reversedArr[idx] = tab[i];
            idx++;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Initial array: " + tab[i]);
            System.out.println("Reversed array: " + reversedArr[i]);
        }
    }

    public static double[] generujZakres(int n, int minWartosc, int maxWartosc) {
        double[] arr = new double[n];

        double step = (maxWartosc - minWartosc) / (n - 1.0);

        for (int i = 0; i < n; i++) {
            double num = minWartosc + (step * i);
            arr[i] = num;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        generujTablice(5, 2, 4);
        //wypiszTablice();
        ileNieparzystych(generujTablice(5, 1, 10));
        ileParzystych(generujTablice(5, 1, 10));
        ileDodatnich(generujTablice(5, -5, 10));
        ileZerowych(generujTablice(5, -5, 10));
        ileUjemnych(generujTablice(5, -5, 10));
        ileMaxymalnych(generujTablice(10, 5, 10));
        ileMinimalnych(generujTablice(10, 5, 10));
        //ileUnikalnych();
        generujZakres(7, 5, 20);
        sumaDodatnich(generujTablice(5, -5, 10));
        sumaUjemnych(generujTablice(5, -5, 10));
        sumaOdwrotnosci(generujTablice(5, 1, 3));
        sredniaArytmetyczna(generujTablice(5, 1, 5));
        sredniaGeometryczna(generujTablice(5, 1, 5));
        //funkcjaLiniowa();
        //funkcjaKwadratowa();
        //funkcjaWykladnicza();
        System.out.println(funkcjaSignum(generujTablice(8, -5, 10)));
        najdluzszyCiagDodatnich(generujTablice(10, -5, 5));
        najdluzszyCiagUjemnych(generujTablice(10, -5, 5));
        odwrocTablice(generujTablice(5, 1, 5));
        //odwrocTablice(generujTablice(8, 0, 5), 2, 4);
    }
}
