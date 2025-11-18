package ed.u2.sorting;

import java.util.Random;
import java.util.Scanner;

public class SortingUtils {

    public static void printArray(int[] array) {

        for (int size : array) {
            System.out.print(size + " ");
        }

        System.out.println();
    }

    public static int[] fillArrayManual(int size, Scanner scanner) {

        int[] array = new int[size];
        System.out.println("--------------------------------------");
        System.out.println("Ingrese " + size + " números:");
        System.out.println("--------------------------------------");

        for (int i = 0; i < size; i++) {

            while (true) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");

                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("--------------------------------------");
                    System.out.println("              VALOR INVÁLIDO          ");
                    System.out.println("--------------------------------------");
                    System.out.println("Por favor ingrese un número.");
                    System.out.println("--------------------------------------");
                    scanner.next();
                }

            }

        }

        return array;
    }

    public static int[] fillArrayAuto(int size) {
        int[] array = new int[size];
        Random random = new Random();
        System.out.println("\n--------------------------------------");
        System.out.println("Llenando automáticamente el arreglo...");
        System.out.println("--------------------------------------");

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // valores 0 a 99
        }

        return array;
    }

    public static int giveSize(Scanner scanner, int maxSize) {
        int size;
        System.out.println("--------------------------------------");
        System.out.print("Ingrese el tamaño del arreglo (máximo " + maxSize + "): ");

        while (true) {

            if (scanner.hasNextInt()) {
                size = scanner.nextInt();

                if (size > 0 && size <= maxSize) {
                    return size;
                } else if (size > maxSize) {
                    System.out.println("--------------------------------------");
                    System.out.println("           OPCIÓN INVÁLIDA            ");
                    System.out.println("--------------------------------------");
                    System.out.println("El tamaño no puede exceder " + maxSize + " elementos.");
                } else {
                    System.out.println("--------------------------------------");
                    System.out.println("           OPCIÓN INVÁLIDA            ");
                    System.out.println("--------------------------------------");
                    System.out.println("El tamaño debe ser mayor a 0.");
                }

            } else {
                System.out.println("--------------------------------------");
                System.out.println("           OPCIÓN INVÁLIDA            ");
                System.out.println("--------------------------------------");
                System.out.println("Por favor ingrese un número entero.");
                scanner.next();
            }

            System.out.println("--------------------------------------");
            System.out.print("Ingrese un número válido: ");
        }

    }

}
