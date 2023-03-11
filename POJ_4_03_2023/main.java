import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.HashSet;
public class main {
    private static final DecimalFormat zad = new DecimalFormat("0.00");
    private static final DecimalFormat wiek_zad = new DecimalFormat("000.00");

    public static void main(String[] args) {
        System.out.println("Zadania 4.03.2023")
        // zadanie_01();
        // zadanie_02();
        // zadanie_03();
        // zadanie_04();
        // zadanie_05();
        // zadanie_06();
        // zadanie_07();
        // zadanie_08();
        // zadanie_09();
        // zadanie_10();
        // zadanie_11();
        // zadanie_12();
        // zadanie_13();
        // zadanie_14();
        // zadanie_15();
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
        System.out.println("Pierwiastek kwadratowy PI: " + zad.format(Math.sqrt(Math.PI)));
    }

    public static void zadanie_03() {
        System.out.println("zadanie_03");
        Scanner scanner = new Scanner(System.in);
        String text1, text2;
        System.out.println("Wpisz tekst rozdzielony spacją (text1 text2): ");
        text1 = scanner.next();
        text2 = scanner.next();
        System.out.println("%" + text2 + " " + text1 + "%");
    }

    public static void zadanie_04() {
        System.out.println("zadanie_04");
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Podaj bok a:");
        a = scanner.nextInt();
        System.out.println("Podaj bok b:");
        b = scanner.nextInt();
        System.out.println("Podaj bok c:");
        c = scanner.nextInt();

        if (((a + b > c) && (a + c > b) && (b + c > a)) && ((a > 0) && (b > 0) && (c > 0))) {
            System.out.println("TAK");
        } else if ((a <= 0) || (b <= 0) || (c <= 0)) {
            System.out.println("BŁĄD");
        } else {
            System.out.println("NIE");
        }
    }

    public static void zadanie_05() {
        System.out.println("zadanie_05");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nr miesiąca:");
        int miesiac = scanner.nextInt();

        switch (miesiac) {
            case 1:
                System.out.println("Styczeń: 31 dni");
                break;
            case 2:
                System.out.println("Luty: 28 lub 29 dni");
                break;
            case 3:
                System.out.println("Marzec: 31 dni");
                break;
            case 4:
                System.out.println("Kwieceń: 30 dni");
                break;
            case 5:
                System.out.println("Maj: 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni");
                break;
            case 8:
                System.out.println("Sierpień: 31 dni");
                break;
            case 9:
                System.out.println("Wrzesień: 30 dni");
                break;
            case 10:
                System.out.println("Październik: 31 dni");
                break;
            case 11:
                System.out.println("Listopad: 30 dni");
                break;
            case 12:
                System.out.println("Grudzień: 31 dni");
                break;
            default:
                System.out.println("Nieprawidłowe dane!");
        }
    }

    public static void zadanie_06() {
        System.out.println("zadanie_06");
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
        } else if (b <= a && b <= c) {
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

    public static void zadanie_07() {
        System.out.println("zadanie_07");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int n = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int m = scanner.nextInt();

        if (n <= 0 && m <= 0) {
            System.out.println("BŁĄD");
        }

        int[] A = new int[n];
        int[] B = new int[m];

        for (int i = 0; i < n; i++) {
            System.out.println("Podaj " + i + "liczbę tablicy A:");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            System.out.println("Podaj " + i + "liczbę tablicy B:");
            B[i] = scanner.nextInt();
        }

        int C = 0; // iloczyn skalarny

        for (int i = 0; i < Math.min(n, m); i++) {
            C += A[i] * B[i];
        }

        System.out.println("Iloczny skalarny: " + C);
    }

    public static void zadanie_08() {
        System.out.println("zadanie_08");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar figury: ");
        int n = scanner.nextInt();

        // kształt >
        for (int i=1; i<=n; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // kształt >#
        for (int i = n; i >= 1; i--) {
            for (int j = n; j>i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }
    public static void zadanie_09() {
        System.out.println("zadanie_09");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz słowo: ");
        String word = scanner.nextLine();
        word = word.toLowerCase();

        if (Palindrom(word)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
    public static boolean Palindrom(String word) {
        int n = word.length();
        for(int i = 0; i < n / 2; i++) {
            if(word.charAt(i) != word.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void zadanie_10() {
        System.out.println("zadanie_10");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę wierszy: ");
        int r = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        int c = scanner.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Podaj elementy macierzy: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (scanner.hasNext()) {
                    matrix[i][j] = scanner.nextInt();
                } else {
                    System.out.println("BŁĄD!");
                }
            }
        }

        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void zadanie_11() {
        System.out.println("zadanie_11");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz zdanie, aby sprawdzić czy jest ono panagramem: ");
        String text = scanner.nextLine();
        boolean Panagram = Panagram(text);
        System.out.println(Panagram);
    }
    public static boolean Panagram(String text) {
        HashSet<Character> letters = new HashSet<Character>();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(Character.toLowerCase(c));
            }
        }
        return letters.size() == 26;
    }
    public static void zadanie_12() {
        System.out.println("zadanie_12");
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        double ziemia = 31557600;
        double merkury = 0.2408467 * ziemia;
        double wenus = 0.61519726 * ziemia;
        double mars = 1.8808158 * ziemia;
        double jowisz = 11.862615 * ziemia;
        double saturn = 29.447498 * ziemia;
        double uran = 84.016846 * ziemia;
        double neptun = 164.79132 * ziemia;
        System.out.println("Podaj wiek w sekundach:");
        double wiek = scanner.nextDouble();
        System.out.println("Na jakiej planecie?");
        String planeta = scan.next();

        switch (planeta) {
            case "ziemia":
                System.out.println(wiek_zad.format(wiek/ziemia));
                break;
            case "merkury":
                System.out.println(wiek_zad.format(wiek/merkury));
                break;
            case "wenus":
                System.out.println(wiek_zad.format(wiek/wenus));
                break;
            case "mars":
                System.out.println(wiek_zad.format(wiek/mars));
                break;
            case "jowisz":
                System.out.println(wiek_zad.format(wiek/jowisz));
                break;
            case "saturn":
                System.out.println(wiek_zad.format(wiek/saturn));
                break;
            case "uran":
                System.out.println(wiek_zad.format(wiek/uran));
                break;
            case "neptun":
                System.out.println(wiek_zad.format(wiek/neptun));
                break;
            default:
                System.out.println("Nie ma takiej planety w naszym programie!");
                break;
        }
    }
    public static void zadanie_13() {
        System.out.println("zadanie_13");
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadanie_13");
        System.out.println("Podaj rozmiar tablicy: ");
        int n = scanner.nextInt();
        int tab[] = new int[n];
        System.out.println("Wprowadź wartości do tablicy: ");

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj " + i + " element ");
            tab[i] = scanner.nextInt();
        }

        int max = tab[0];

        for (int i = 0; i < n; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        System.out.println("Najwieksza liczba w tej tablicy to: " + max);
    }
    public static void zadanie_14() {
        System.out.println("zadanie_14");
        System.out.println("Pobrałem JDK.");
        System.out.println("Używając terminala przechodzę do folderu projektu, w którum mam plik main.java.");
        System.out.println("Kompiluje go poleceniem javac main.java.");
        System.out.println("Uruchamiam skompilowany program w terminalu poleceniem java main");
    }
}