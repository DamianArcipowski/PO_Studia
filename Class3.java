import java.util.ArrayList;

public class Class3 {

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
    }
}