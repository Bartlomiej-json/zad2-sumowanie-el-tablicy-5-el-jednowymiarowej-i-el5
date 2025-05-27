import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Tworzymy obiekt do wczytywania danych z klawiatury

        // 1. Zapytaj użytkownika o rozmiar tablicy
        System.out.print("Podaj liczbę elementów w tablicy: ");
        int rozmiar = scanner.nextInt();

        // 2. Utwórz tablicę o podanym rozmiarze
        int[] tablica = new int[rozmiar];

        // 3. Wczytaj elementy tablicy od użytkownika
        for (int i = 0; i < rozmiar; i++) {
            System.out.print("Podaj element " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }

        // 4. Oblicz sumę elementów podzielnych przez 5
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 5 == 0) { // Sprawdzenie czy liczba jest podzielna przez 5
                suma += tablica[i];   // Jeśli tak, dodajemy ją do sumy
            }
        }

        // 5. Wyświetl wynik
        System.out.println("Suma elementów podzielnych przez 5: " + suma);

        scanner.close(); // Zamykamy skaner, aby zwolnić zasoby
    }
}
