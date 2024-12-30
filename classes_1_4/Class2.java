import java.util.Scanner;

public class Class2 {

    public static void zad1() {
        System.out.println(23.0 + 76);
        System.out.println(41 * 2.0 + 3);
        System.out.println(5 - 33);
        System.out.println(109 % 3);
        System.out.println(50 / 2);
        System.out.println(4 | 2);
        System.out.println(3 ^ 5);
        System.out.println(7 & 9);
    }

    public static void zad2() {
        double operation1 = (Math.sqrt(7) - 1) / 2 + (Math.pow(3, 3) % 2);
        System.out.println((int) operation1);

        double operation2 = 2000 / (19 * 1);
        System.out.println((int) operation2);

        double operation3 = (3 + Math.sqrt(3) / (Math.sqrt(5) / 2 / 3)) + 1;
        System.out.println((int) operation3);

        double operation4 = 15 % 4 % 2;
        System.out.println((int) operation4);

        double operation5 = (10 % 6) + 1 / Math.pow(2, 1/4);
        System.out.println((int) operation5);
    }

    public static void zad3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwsze słowo: ");
        String firstWord = scanner.nextLine();
        System.out.println("Wprowadź drugie słowo: ");
        String secondWord = scanner.nextLine();

        System.out.println(firstWord + " " + secondWord);
    }

    public static void zad4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
        
    }

    public static void zad5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println(num + 140);
        System.out.println(num - 31);
        System.out.println(num * 7);
        System.out.println(num / 13);
        System.out.println(num % 7);
        System.out.println(num / 4);
        System.out.println(Math.pow(num, 45));
        System.out.println(num >>> 67);
        System.out.println(num | 59);
        System.out.println(num ^ 23);
        System.out.println(num << 5);
        System.out.println(num >> 6);
    }

    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
    }
}
