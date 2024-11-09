/*import java.util.ArrayList;

public class Class3 {

    public static void trojkipitagorejskie(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    int powI = (int) Math.pow(i, 2);
                    int powJ = (int) Math.pow(j, 2);
                    int powK = (int) Math.pow(k, 2);
                    if (powI + powJ == powK) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }

    public static void funKwaRozwiazania(int n) {

    }

    public static void funKwaDelta(int n) {

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
                System.out.println(numbers.get(0));
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
                System.out.println(i);
            }
        }
    }

    public static void piramida(int n, int variant) {

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
            System.out.println(a);
        }
    }

    public static boolean czyPierwsza(int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numbers.add(i);
                }
            }
            if (numbers.size() == 1) {
                return true;
            }
        }

        return false;
        //DO POPRAWY!

    public static void piramida(int n, int variant) {

        if (n < 1)
            return;

        for (int i = 1; i <= n; i++) {
            System.out.println();
        }
                    
    }

    public static void sumaNaturalnych(int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void sumaParzystych(int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                sum += i;
        }

        System.out.println(sum);
    }

    public static void sumaNieparzystych(int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0)
                sum += i;
        }

        System.out.println(sum);
    }

    public static void sumaKwaNaturalnych(int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.pow(i, 2);
        }

        System.out.println(sum);
    }

    public static void sumaSzeNaturalnych(int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.pow(i, 3);
        }

        System.out.println(sum);
    }

    public static void sumaOdwNaturalnych(int n) {
        float sum = 0;

        for (float i = 0; i < n; i++) {
            if (i == 0)
                sum += 0;
            else
                sum += (1/i);
        }

        System.out.println(sum);
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

    public static void NWD(int a, int b) {
        while (a != b) {
            if (a > b) 
                a -= b;
            else
                b -= a;
        }

        System.out.println(a);
    }

    public static void main(String[] args) {
        //piramida(5, 1);
        sumaNaturalnych(20);
        sumaParzystych(20);
        sumaNieparzystych(20);
        sumaKwaNaturalnych(20);
        sumaSzeNaturalnych(20);
        sumaOdwNaturalnych(20);
        System.out.println(czyPalindrom("kajak"));
        //trojkatPascala(n);
        //czyPalindrom(n);
        System.out.println(czyDoskonala(28));
        NWD(21, 4);
    }*/
}