import java.util.Arrays;
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
        int[] newTab;

        if (n * m <= tab.length) {
            newTab = new int[tab.length];
            newTab = tab.clone();
        }
        else {
            newTab = new int[n * m];
            
            for (int i = 0; i < tab.length; i++) {
                newTab[i] = tab[i];
            }

            for (int i = newTab.length; i < n * m; i++) {
                newTab[i] = 0;
            }
        }

        int counter = 0;
        
        for (int i = 0; i < newTab.length; i++) {
            counter++;

            if (i % m == 0) 
                System.out.print("[ " + newTab[i]);
            else if (counter == m) {
                System.out.print(" " + newTab[i] + " ]\n");
                counter = 0;
            }
            else
                System.out.print(" " + newTab[i]);

        }
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
        int uniqueCounter = 0;
        int tempUnique;
        int tempCounter = 0;

        for (int i = 0; i < tab.length; i++) {
            tempUnique = tab[i];

            for (int j = 0; j < tab.length; j++) {
                if (tab[j] == tempUnique)
                    tempCounter++;
            }

            if (tempCounter <= 1)
                uniqueCounter++;

            tempCounter = 0;
        }

        System.out.println("Unikalne: " + uniqueCounter);
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
            sum +=  (1.0 / tab[i]);
        }

        double avg = tab.length / sum;

        System.out.println("Średnia harmoniczna: " + avg);
    }

    public static int[] funkcjaLiniowa(int[] tab, int a, int b) {
        int[] values = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            values[i] = a * tab[i] + b;
        }

        System.out.println("Wartości dla funkcji liniowej: " + Arrays.toString(values));

        return values;
    }

    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c) {
        int[] values = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            values[i] = a * (int) Math.pow(tab[i], 2) + b * tab[i] + c;
        }

        System.out.println("Wartości dla funkcji kwadratowej: " + Arrays.toString(values));

        return values;
    }

    public static int[] funkcjaWykladnicza(int[] tab, int a) {
        int[] values = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            values[i] = (int) Math.pow(a, tab[i]);
        }

        System.out.println("Wartości dla funkcji wykładniczej: " + Arrays.toString(values));

        return values;
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

        System.out.println("Signum: " + Arrays.toString(signum));

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

        System.out.println("Initial array: " + Arrays.toString(tab));
        System.out.println("Reversed array: " + Arrays.toString(reversedArr));
    }

    public static void odwrocTablice(int[] tab, int indeksStart, int indeksStop) {
        int reversedSubArr[] = new int[tab.length];
        int idx = 0;

        for (int i = indeksStop; i >= indeksStart; i--) {
            reversedSubArr[idx] = tab[i];
            idx++;
        }

        int finalArray[] = new int[tab.length];
        idx = 0;

        for (int i = 0; i < tab.length; i++) {
            if (i < indeksStart || i > indeksStop) 
                finalArray[i] = tab[i];
            else {
                finalArray[i] = reversedSubArr[idx];
                idx++;
            }
                
        }

        System.out.println("Initial array:  " + Arrays.toString(tab));
        System.out.println("Reversed array: " + Arrays.toString(finalArray));
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
        wypiszTablice(generujTablice(12, 1, 5), 5, 3);
        ileNieparzystych(generujTablice(5, 1, 10));
        ileParzystych(generujTablice(5, 1, 10));
        ileDodatnich(generujTablice(5, -5, 10));
        ileZerowych(generujTablice(5, -5, 10));
        ileUjemnych(generujTablice(5, -5, 10));
        ileMaxymalnych(generujTablice(10, 5, 10));
        ileMinimalnych(generujTablice(10, 5, 10));
        ileUnikalnych(generujTablice(10, 0, 10));
        sumaDodatnich(generujTablice(5, -5, 10));
        sumaUjemnych(generujTablice(5, -5, 10));
        sumaOdwrotnosci(generujTablice(5, 1, 3));
        sredniaArytmetyczna(generujTablice(5, 1, 5));
        sredniaGeometryczna(generujTablice(5, 1, 5));
        sredniaHarmoniczna(generujTablice(5, 1, 5));
        funkcjaLiniowa(generujTablice(5, 1, 5), 2, 3);
        funkcjaKwadratowa(generujTablice(5, 1, 5), 2, 3, 4);
        funkcjaWykladnicza(generujTablice(5, 1, 5), 2);
        funkcjaSignum(generujTablice(8, -5, 10));
        najdluzszyCiagDodatnich(generujTablice(10, -5, 5));
        najdluzszyCiagUjemnych(generujTablice(10, -5, 5));
        odwrocTablice(generujTablice(5, 1, 5));
        odwrocTablice(generujTablice(9, 1, 10), 2, 5);
        generujZakres(7, 5, 20);
    }
}
