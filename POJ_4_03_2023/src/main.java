import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.util.Scanner;
public class main {
    private static final DecimalFormat zad_2 = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // System.out.println("Zadania 4.03.2023")
        // zadanie_01();
        // System.out.println("--------------------------------------");
        // zadanie_02();
        // System.out.println("--------------------------------------");
        // zadanie_03();
        // System.out.println("--------------------------------------");
        // zadanie_04();
        // System.out.println("--------------------------------------");
        // zadanie_05();
         zadanie_06();
    }
    public static void zadanie_01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadanie_01");
        System.out.println("Podaj a:");
        int a = scanner.nextInt();
        System.out.println("Podaj b:");
        int b = scanner.nextInt();
        int c = a * b;
        System.out.println("Wynik a*b: " + c);
    }
    public static void zadanie_02() {
        System.out.println("zadanie_02");
        System.out.println("Pierwiastek kwadratowy PI: " + zad_2.format(Math.sqrt(Math.PI)));
    }
    public static void zadanie_03() {
        Scanner scanner = new Scanner(System.in);
        String text1, text2;
        System.out.println("Wpisz tekst rozdzielony spacją (text1 text2): ");
        text1 = scanner.next();
        text2 = scanner.next();
        System.out.println("%" + text2 + " " + text1 + "%");
    }
    public static void zadanie_04() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Podaj bok a:");
        a = scanner.nextInt();
        System.out.println("Podaj bok b:");
        b = scanner.nextInt();
        System.out.println("Podaj bok c:");
        c = scanner.nextInt();

        if (((a+b>c)&&(a+c>b)&&(b+c>a))&&((a>0)&&(b>0)&&(c>0))) {
            System.out.println("TAK");
        } else if ((a<=0)||(b<=0)||(c<=0)) {
            System.out.println("BŁĄD");
        } else {
            System.out.println("NIE");
        }
    }
    public static void zadanie_05() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr miesiąca:");
        int miesiac = scanner.nextInt();

        switch (miesiac) {
            case 1: System.out.println("Styczeń: 31 dni"); break;
            case 2: System.out.println("Luty: 28 lub 29 dni"); break;
            case 3: System.out.println("Marzec: 31 dni"); break;
            case 4: System.out.println("Kwieceń: 30 dni"); break;
            case 5: System.out.println("Maj: 31 dni"); break;
            case 6: System.out.println("Czerwiec: 30 dni"); break;
            case 7: System.out.println("Lipiec: 31 dni"); break;
            case 8: System.out.println("Sierpień: 31 dni"); break;
            case 9: System.out.println("Wrzesień: 30 dni"); break;
            case 10: System.out.println("Październik: 31 dni"); break;
            case 11: System.out.println("Listopad: 30 dni"); break;
            case 12: System.out.println("Grudzień: 31 dni"); break;
            default: System.out.println("Nieprawidłowe dane!");
        }
    }

    public static void zadanie_06() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę:");
        double a = scanner.nextDouble();
        System.out.println("Podaj 2 liczbę:");
        double b = scanner.nextDouble();
        System.out.println("Podaj 3 liczbę:");
        double c = scanner.nextDouble();

        double low, mid, high;

        if (a <= b && a <= c) {
            low = a;

            if (b <= c) {
                mid = b;
                high = c;
            } else {
                mid = c;
                high = b;
            }
        } else if (b <= a && b <=c) {
            low = b;

            if (a <= c) {
                mid = a;
                high = c;
            } else {
                mid = c;
                high = a;
            }
        } else {
            low = c;

            if (c <= a) {
                mid = a;
                high = b;
            } else {
                mid = b;
                high = a;
            }
        }

        System.out.println("Liczby od najmniejszej do największej: " + high + " " + mid + " " + low);
        System.out.println("Liczby od największej do najmniejszej: " + low + " " + mid + " " + high);
    }
}