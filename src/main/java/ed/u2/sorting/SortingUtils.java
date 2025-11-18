package ed.u2.sorting;

import java.util.Random;
import java.util.Scanner;

public class SortingUtils {

    public static void print(int[] a) {

        for (int n : a) {
            System.out.print(n + " ");
        }

        System.out.println();
    }

    public static int[] fillArrayManual(int n, Scanner sc) {

        int[] a = new int[n];
        System.out.println("\n--------------------------------------");
        System.out.println("Ingrese " + n + " números:");
        System.out.println("--------------------------------------");

        for (int i = 0; i < n; i++) {

            while (true) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    a[i] = sc.nextInt();
                    break;
                } else {
                    System.out.println("--------------------------------------");
                    System.out.println("          VALOR INVALIDO          ");
                    System.out.println("Por favor ingrese un número.");
                    System.out.println("--------------------------------------");
                    sc.next();
                }
            }
        }
        return a;
    }

    public static int[] fillArrayAuto(int n) {
        int[] a = new int[n];
        Random random = new Random();

        System.out.println("\n--------------------------------------");
        System.out.println("Llenando automáticamente el arreglo...");
        System.out.println("--------------------------------------");

        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(100); // valores 0 a 99
        }

        return a;
    }

    public static int giveSize(Scanner scanner) {
        int size;
        System.out.println("--------------------------------------");
        System.out.print("Ingrese el tamaño del arreglo: ");

        while (true) {
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) return size;

                System.out.println("El tamaño debe ser mayor a 0.");
            } else {
                System.out.println("Entrada inválida. Por favor ingrese un número entero.");
                scanner.next();
            }
            System.out.print("Ingrese un número válido: ");
        }
    }



}
