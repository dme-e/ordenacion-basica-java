package ed.u2.sorting;

import java.util.Scanner;

public class SortingDemo {

    public static void principalMenu() {
        System.out.println("\n--------------------------------------");
        System.out.println("            MENÚ PRINCIPAL            ");
        System.out.println("--------------------------------------");
        System.out.println("1. Insertar valores manualmente");
        System.out.println("2. Agregar valores automáticamente");
        System.out.println("0. Salir");
        System.out.println("--------------------------------------");
    }

    public static void sortingMenu() {
        System.out.println("\n--------------------------------------");
        System.out.println("         MENÚ DE ORDENAMIENTO         ");
        System.out.println("--------------------------------------");
        System.out.println("1. Ordenamiento por Inserción");
        System.out.println("2. Ordenamiento por Selección");
        System.out.println("3. Ordenamiento por Burbuja");
        System.out.println("4. Volver al menú principal");
        System.out.println("--------------------------------------");
    }

    public static void traceSelection() {
        System.out.println("--------------------------------------");
        System.out.println("¿Desea que se muestre el trazado?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.println("--------------------------------------");
    }

    public static int selectionPrincipalMenu(Scanner scanner) {
        int MAX_MANUAL = 20;
        int MAX_AUTO = 500;

        while (true) {
            principalMenu();
            int size;
            System.out.println("\n--------------------------------------");
            System.out.print("Seleccione una opción: ");
            String option = scanner.next();

            switch (option) {
                case "1":
                    size = SortingUtils.giveSize(scanner, MAX_MANUAL);
                    return size;
                case "2":
                    size = SortingUtils.giveSize(scanner, MAX_AUTO);
                    return -size;
                case "0":
                    return 0;
                default:
                    System.out.println("--------------------------------------");
                    System.out.println("           OPCIÓN INVÁLIDA            ");
                    System.out.println("--------------------------------------");
                    System.out.println("Por favor ingrese un número válido.");
                    break;
            }

        }

    }

    public static void selectionSortingMenu(Scanner scanner, int[] array) {
        System.out.println("\n--------------------------------------");
        System.out.println("        VALOR ACTUAL DEL ARREGLO        ");
        System.out.println("--------------------------------------");
        SortingUtils.printArray(array);

        while (true) {
            int[] sortedCopy = array.clone();

            sortingMenu();
            System.out.print("Ingrese una opción de ordenamiento: ");
            String option = scanner.next();

            switch (option) {
                case "1": // Inserción
                    traceSelection();
                    String showTraceInsertion = validationTraceSelection(scanner);

                    if ("1".equals(showTraceInsertion)) {
                        System.out.println("--------------------------------------");
                        System.out.println("        TRAZADO POR INSERCIÓN         ");
                        System.out.println("--------------------------------------");
                        InsertionSort.sort(sortedCopy, true);
                    } else {
                        InsertionSort.sort(sortedCopy);
                        System.out.println("--------------------------------------");
                        System.out.println("          ARREGLO COMPLETADO          ");
                        System.out.println("--------------------------------------");
                        SortingUtils.printArray(sortedCopy);
                    }

                    System.out.println("--------------------------------------");
                    System.out.println("           ARREGLO ANTERIOR           ");
                    System.out.println("--------------------------------------");
                    SortingUtils.printArray(array);
                    System.out.println("--------------------------------------");
                    System.out.println("Arreglo Ordenado por Inserción.");
                    break;


                case "2": // Selección
                    traceSelection();
                    String showTraceSelection = validationTraceSelection(scanner);

                    if ("1".equals(showTraceSelection)) {
                        System.out.println("--------------------------------------");
                        System.out.println("        TRAZADO POR SELECCIÓN         ");
                        System.out.println("--------------------------------------");
                        SelectionSort.sort(sortedCopy, true);
                    } else {
                        SelectionSort.sort(sortedCopy);
                        System.out.println("--------------------------------------");
                        System.out.println("          ARREGLO COMPLETADO          ");
                        System.out.println("--------------------------------------");
                        SortingUtils.printArray(sortedCopy);
                    }

                    System.out.println("--------------------------------------");
                    System.out.println("           ARREGLO ANTERIOR           ");
                    System.out.println("--------------------------------------");
                    SortingUtils.printArray(array);
                    System.out.println("--------------------------------------");
                    System.out.println("Arreglo ordenado por Selección.");
                    break;

                case "3": // Burbuja
                    traceSelection();
                    String showTraceBubble = validationTraceSelection(scanner);

                    if ("1".equals(showTraceBubble)) {
                        System.out.println("--------------------------------------");
                        System.out.println("         TRAZADO POR BURBUJA          ");
                        System.out.println("--------------------------------------");
                        BubbleSort.sort(sortedCopy, true);
                    } else {
                        BubbleSort.sort(sortedCopy);
                        System.out.println("--------------------------------------");
                        System.out.println("          ARREGLO COMPLETADO          ");
                        System.out.println("--------------------------------------");
                        SortingUtils.printArray(sortedCopy);
                    }

                    System.out.println("--------------------------------------");
                    System.out.println("           ARREGLO ANTERIOR           ");
                    System.out.println("--------------------------------------");
                    SortingUtils.printArray(array);
                    System.out.println("--------------------------------------");
                    System.out.println("Arreglo ordenado por Burbuja.");
                    break;

                case "4":
                    System.out.println("--------------------------------------");
                    System.out.println("Volviendo al menú principal...");
                    return;

                default:
                    System.out.println("--------------------------------------");
                    System.out.println("           OPCIÓN INVÁLIDA            ");
                    System.out.println("--------------------------------------");
                    System.out.println("Inténtalo de nuevo.");
                    break;
            }

        }

    }

    public static String validationTraceSelection(Scanner scanner) {
        String trace;

        while (true) {
            System.out.print("Seleccione una opción: ");
            trace = scanner.next();

            if ("1".equals(trace) || "2".equals(trace)) {
                return trace;
            } else {
                System.out.println("--------------------------------------");
                System.out.println("           OPCIÓN INVÁLIDA            ");
                System.out.println("--------------------------------------");
                System.out.println("Por favor ingrese 1 o 2.");
                System.out.println("--------------------------------------");
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("\n--------------------------------------");
        System.out.println("       PROGRAMA DE ORDENAMIENTO       ");
        System.out.println("--------------------------------------");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int size = selectionPrincipalMenu(scanner);
            int[] array;

            if (size == 0) {
                System.out.println("\n----------------------------------");
                System.out.println("Saliendo del programa...");
                break;
            }

            if (size > 0) {
                array = SortingUtils.fillArrayManual(size, scanner);
            } else {
                array = SortingUtils.fillArrayAuto(Math.abs(size));
            }

            selectionSortingMenu(scanner, array);
        }

        scanner.close();
    }

}
