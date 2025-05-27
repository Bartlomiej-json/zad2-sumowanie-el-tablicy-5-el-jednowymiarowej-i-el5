import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wczytanie tablicy od użytkownika
        int[] tablica = wczytajTablice(scanner);

        // Wyświetlenie menu z dostępnymi operacjami
        System.out.println("\nWybierz operację:");
        System.out.println("1. Suma elementów podzielnych przez 5");
        System.out.println("2. Suma liczb parzystych");
        System.out.println("3. Suma liczb nieparzystych");
        System.out.println("4. Średnia liczb większych niż 10");
        System.out.println("5. Zakończ");

        System.out.print("Twój wybór: ");
        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1:
                System.out.println("Suma liczb podzielnych przez 5: " + sumaPodzielnychPrzez(tablica, 5));
                break;
            case 2:
                System.out.println("Suma liczb parzystych: " + sumaParzystych(tablica));
                break;
            case 3:
                System.out.println("Suma liczb nieparzystych: " + sumaNieparzystych(tablica));
                break;
            case 4:
                System.out.println("Średnia liczb > 10: " + sredniaWiekszychOd(tablica, 10));
                break;
            case 5:
                System.out.println("Zakończono program.");
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
        }

        scanner.close();
    }

    // Metoda do wczytania tablicy od użytkownika
    public static int[] wczytajTablice(Scanner scanner) {
        System.out.print("Ile elementów chcesz podać? ");
        int n = scanner.nextInt();
        int[] tablica = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj element " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }

        return tablica;
    }

    // Suma liczb podzielnych przez dany dzielnik (np. 5)
    public static int sumaPodzielnychPrzez(int[] tablica, int dzielnik) {
        int suma = 0;
        for (int liczba : tablica) {
            if (liczba % dzielnik == 0) {
                suma += liczba;
            }
        }
        return suma;
    }

    // Suma liczb parzystych
    public static int sumaParzystych(int[] tablica) {
        int suma = 0;
        for (int liczba : tablica) {
            if (liczba % 2 == 0) {
                suma += liczba;
            }
        }
        return suma;
    }

    // Suma liczb nieparzystych
    public static int sumaNieparzystych(int[] tablica) {
        int suma = 0;
        for (int liczba : tablica) {
            if (liczba % 2 != 0) {
                suma += liczba;
            }
        }
        return suma;
    }

    // Średnia liczb większych od danej wartości (np. 10)
    public static double sredniaWiekszychOd(int[] tablica, int prog) {
        int suma = 0;
        int licznik = 0;
        for (int liczba : tablica) {
            if (liczba > prog) {
                suma += liczba;
                licznik++;
            }
        }
        return (licznik > 0) ? (double) suma / licznik : 0.0;
    }
}
