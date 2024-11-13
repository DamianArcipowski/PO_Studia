import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Class3 {

    public static void trojkipitagorejskie(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    int powI = (int) Math.pow(i, 2);
                    int powJ = (int) Math.pow(j, 2);
                    int powK = (int) Math.pow(k, 2);
                    if (powI + powJ == powK) {
                        System.out.println("Trojka pitagorejska: " + i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    public static void funKwaRozwiazania(int n) {
        int delta;

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
                    delta = (int) Math.pow(b, 2) - 4 * a * c;

                    if (delta >= 0 && a != 0)
                        System.out.println("A: " + a + " B: " + b + " C: " + c);
                }
            } 
        }
    }

    public static void funKwaDelta(int n) {
        int delta;
        int deltaSqrt;
        double naturalNumSqrt;

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int c = 0; c < n; c++) {
                    delta = (int) Math.pow(b, 2) - 4 * a * c;
                    deltaSqrt = (int) Math.sqrt(delta);
                    naturalNumSqrt = Math.sqrt(deltaSqrt);

                    if (delta >= 0 && a != 0 && naturalNumSqrt % 1 == 0)
                        System.out.println("A: " + a + " B: " + b + " C: " + c);
                }
            } 
        }
    }

    public static void liczbyPierwsze(int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    numbers.add(i);
                }
            }
            if (numbers.size() == 1) {
                System.out.println("Liczba pierwsza: " + numbers.get(0));
            }
            numbers.clear();
        }
    }

    public static void liczbyPodzielne(int m, int n) {
        String baseMin = "1";
        String baseMax = "9";

        String zeros = "";
        for (int i = 1; i < m; i++) {
            zeros += "0";
            baseMax += "9";
        }

        baseMin += zeros;

        int min = Integer.valueOf(baseMin);
        int max = Integer.valueOf(baseMax);

        for (int i = min; i <= max; i++) {
            if (i % n == 0) {
                System.out.println("Liczba podzielna: " + i);
            }
        }
    }

    public static void piramida(int n, int variant) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź 1 dla zwykłej piramidy lub 2 dla odwróconej: ");
        int userVariant = scanner.nextInt();

        int row = 1;

        if (userVariant == 1) {
            for (int i = 0; i < n; i++) {
                System.out.print(" ".repeat(n - row) + "*".repeat(row * 2 - 1) + " ".repeat(n - row) + "\n");
                row++;
            }
        }
        else if (userVariant == 2) {
            for (int i = 0; i < n; i++) {
                System.out.print(" ".repeat(i) + "*".repeat(n * 2 - i * 2 - 1) + " ".repeat(i) + "\n");
                row++;
            }
        }
        else
            System.out.println("Prawidłowe warianty to 1 lub 2, podano zły wariant!");
    }

    public static int silnia(int n) {
        if (n < 2) {
            return 1;
        }

        return n * silnia(n - 1);
    }

    public static int silniaPodwojna(int n) {
        if (n < 2) {
            return 1;
        }

        return n * silniaPodwojna(n - 2);
    }

    public static int silniaWielokrotna(int m, int n) {
        if (n < 2) {
            return 1;
        }

        return n * silniaWielokrotna(m, n - m);
    }

    public static int dwumianNewtona(int n, int k) {
        return silnia(n) / (silnia(k) * silnia(n - k));
    }

    public static void ciagFibonacciego(int n) {
        int a = 0;
        int b = 1;
        int temp;

        for (int i = 0; i < n; i++) {
            b += a;
            a = b - a;
            System.out.println((i + 1) + " wyraz ciągu Fibonacciego: " + a);
        }
    }

    public static void sumaNaturalnych(int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
        }

        System.out.println("Suma liczb naturalnych: " + sum);
    }

    public static void sumaParzystych(int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                sum += i;
        }

        System.out.println("Suma liczb parzystych: " + sum);
    }

    public static void sumaNieparzystych(int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0)
                sum += i;
        }

        System.out.println("Suma liczb nieparzystych: " + sum);
    }

    public static void sumaKwaNaturalnych(int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.pow(i, 2);
        }

        System.out.println("Suma kwadratów liczb naturalnych: " + sum);
    }

    public static void sumaSzeNaturalnych(int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.pow(i, 3);
        }

        System.out.println("Suma sześcianów liczb naturalnych: " + sum);
    }

    public static void sumaOdwNaturalnych(int n) {
        float sum = 0;

        for (float i = 0; i < n; i++) {
            if (i == 0)
                sum += 0;
            else
                sum += (1/i);
        }

        System.out.println("Suma odwrotności liczb naturalnych: " + sum);
    }

    public static boolean czyPalindrom(String wyraz) {
        char[] charsArray = wyraz.toCharArray();
        String reversedWyraz = "";

        for (int i = charsArray.length - 1; i >= 0; i--) {
            reversedWyraz += charsArray[i];
        }

        if (wyraz.equals(reversedWyraz))
            return true;

        return false;
    }

    public static void trojkatPascala(int n) {

    }

    public static boolean czyPalindrom(int n) {
        int reversedNum = 0;
        int originalNum = n;
        int tempNum;

        while (n != 0) {
            tempNum = n % 10;
            reversedNum = reversedNum * 10 + tempNum;
            n /= 10;
        }

        if (reversedNum == originalNum)
            return true;

        return false;
    }

    public static boolean czyDoskonala(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                factors.add(i);
        }

        int sum = 0;
        for (int i = 0; i < factors.size(); i++) {
            sum += factors.get(i);
        }

        if (sum == n)
            return true;

        return false;
    }

    public static boolean czyPierwsza(int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numbers.add(i);
            }
        }

        if (numbers.size() == 2) {
            return true;
        }

        return false;
    }

    public static void NWD(int a, int b) {
        while (a != b) {
            if (a > b) 
                a -= b;
            else
                b -= a;
        }

        System.out.println("NWD: " + a);
    }

    public static int[] wczytajTablice(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        int tmp;

        for (int i = 0; i < n; i++) {
            System.out.print("Wprowadz liczbe nr. " + (i + 1) + ": ");
            tmp = scanner.nextInt();
            arr[i] = tmp;
        }

        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static void podzbiory(int tab) {

    }

    public static void main(String[] args) {
        trojkipitagorejskie(20);
        funKwaRozwiazania(5);
        funKwaDelta(6);
        liczbyPierwsze(50);
        liczbyPodzielne(2, 5);
        piramida(5, 1);
        System.out.println("Silnia: " + silnia(5));
        System.out.println("Silnia podwójna: " + silniaPodwojna(5));
        System.out.println("Silnia wielokrotna: " + silniaWielokrotna(4, 5));
        System.out.println("Dwumian newtona: " + dwumianNewtona(5, 3));
        ciagFibonacciego(10);
        sumaNaturalnych(20);
        sumaParzystych(20);
        sumaNieparzystych(20);
        sumaKwaNaturalnych(20);
        sumaSzeNaturalnych(20);
        sumaOdwNaturalnych(20);
        System.out.println("Czy palindrom wyraz: " + czyPalindrom("kajak"));
        //trojkatPascala();
        System.out.println("Czy palindrom liczba: " + czyPalindrom(151));
        System.out.println("Czy doskonała: " + czyDoskonala(28));
        System.out.println("Czy pierwsza: " + czyPierwsza(17));
        NWD(21, 4);
        wczytajTablice(4);
        //podzbiory();
    }
}