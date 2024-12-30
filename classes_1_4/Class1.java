import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Class1 {

    public static void zad1() {
        System.out.println("Damian Arcipowski");
    }

    public static void zad2() {
        String nameSurname = "Damian Arcipowski";
        System.out.println(nameSurname.length());
    }

    public static void zad3() {
        String ala = "Ala";
        String has = "ma";
        String cat = "kota";
        System.out.println(ala + has + cat);
    }

    public static void zad4() {
        System.out.println(" ".repeat(20) + "*");
        System.out.println(" ".repeat(20) + "* *");
        System.out.println(" ".repeat(20) + "* * *");
        System.out.println("* ".repeat(14));
        System.out.println("* ".repeat(15));
        System.out.println("* ".repeat(14));
        System.out.println(" ".repeat(20) + "* * *");
        System.out.println(" ".repeat(20) + "* *");
        System.out.println(" ".repeat(20) + "*");

        System.out.println(" ".repeat(5) + "* ".repeat(1));
        System.out.println(" ".repeat(4) + "* ".repeat(2));
        System.out.println(" ".repeat(3) + "* ".repeat(3));
        System.out.println(" ".repeat(2) + "* ".repeat(4));
        System.out.println(" *".repeat(5));
        System.out.println("* ".repeat(6));
        System.out.println(" *".repeat(5));
        System.out.println(" ".repeat(2) + "* ".repeat(4));
        System.out.println(" ".repeat(3) + "* ".repeat(3));
        System.out.println(" ".repeat(4) + "* ".repeat(2));
        System.out.println(" ".repeat(5) + "* ".repeat(1));
    }

    public static void zad5() {
        String sentence = "Ala ma kota";
        System.out.println(sentence.replace("a", "e"));
    }

    public static void zad6() {
        String sentence = "Ala ma kota";
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
    }

    public static void zad7() {
        System.out.println("A: " + (int) 'A');
        System.out.println("!: " + (int) '!');
        System.out.println("@: " + (int) '@');
        System.out.println(">: " + (int) '>');
        System.out.println("~: " + (int) '~');
        System.out.println("/n: " + (int) '\n');
        System.out.println("/b: " + (int) '\b');
    }

    public static void zad8() {
        System.out.println("Małe litery: " + (int) 'a' + "-" + (int) 'z');
        System.out.println("Duże litery: " + (int) 'A' + "-" + (int) 'Z');
        System.out.println("Cyfry: " + (int) '0' + "-" + (int) '9');
    }

    public static void zad9() {
        String sentence = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym "
        + "... mimo, że jego ... na to nie wskazuje.";
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {
            System.out.println("Wprowadz słowo " + i + ": ");
            String tempWord = scanner.nextLine();
            sentence = sentence.replaceFirst("\\.{3,}", tempWord);
        }

        System.out.println(sentence);
    }

    public static void zad10() {
        String sentence = "... to najlepsza książka napisana przez ...";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź tytuł: ");
        String title = scanner.nextLine();
        sentence = sentence.replaceFirst("\\.{3,}", title);
        System.out.println("Wprowadź autora: ");
        String author = scanner.nextLine();
        sentence = sentence.replaceFirst("\\.{3,}", author);

        System.out.println(sentence);
        scanner.close();
    }

    public static void zad11() {
        System.out.println("wodrze".repeat(5));
    }

    public static void zad12() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Dzisiaj jest " + date + " godzina " + time);
    }

    public static void zad13() {
        System.out.println((char) 54);
        System.out.println((char) 103);
        System.out.println((char) 241);
        System.out.println((char) 67);
        System.out.println((char) 9999);
        System.out.println((char) 16);
        System.out.println((char) 174970);
    }

    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();
        zad9();
        zad10();
        zad11();
        zad12();
        zad13();
    }
}